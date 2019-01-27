/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Camera;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Camera;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Camera.CAMERA;

public class driveByDockingPID extends Command {

    // private double kpAim = 0.05;
    // private double kpDistance = 0.05;
    // private double throttleInput;
    // private double rotateValue ;
    // private double left_command = 0.0;
    // private double right_command = 0.0;
    double Kp = 0.015;
    double Ki = 0.0;
    double Kd = 0.0275;
    double kpDistance = 0.0215;
    double min_command = 0.0;
    double left_command;
    double right_command;
    double integral;
    double derivative;
    double last_error;
    double result;
    double error;
    private boolean finished = false;
    private CAMERA location; 

  public driveByDockingPID(CAMERA location) {
    Camera.getInstance().setCamera(location);
    requires(Camera.getInstance());
    requires(Drivetrain.getInstance());

    this.location = location;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    left_command = 0.0;
    right_command = 0.0;

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Camera.getInstance().getCamera(location);
    Camera.getInstance().setCamera(location);
    Camera.getInstance().setDockingMode();

    double tx = Camera.getInstance().RotationalDegreesToTarget();
    double ty = Camera.getInstance().VerticalDegreesToTarget();

    double heading_error = -tx;
    double steering_adjust = 0.0;
    double distance_error = -ty; //subtracting 2 due to range error on camera on back of the robot.

    if(Math.abs(tx) < 0.1) {
      finished = true;
    }

    steering_adjust = PIDCalc2(tx);

    
    double distance_adjust = (kpDistance * distance_error);

    if (location == CAMERA.FRONT) {
      left_command += steering_adjust - distance_adjust;
      right_command -= steering_adjust + distance_adjust; // changed from "-"
    } else {
      left_command += steering_adjust + distance_adjust;
      right_command -= steering_adjust - distance_adjust;
    }

    Drivetrain.getInstance().tankDrive(left_command, right_command);

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return finished;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }

  public double PIDCalc2(double error){
    integral += error * .2;
    derivative = error - last_error;
    last_error = error;
    result = Kp * error + Ki * integral + Kd * derivative;
    return result;
  }
}
