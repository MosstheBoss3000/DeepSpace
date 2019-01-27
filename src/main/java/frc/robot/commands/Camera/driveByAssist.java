/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Camera;


import edu.wpi.first.wpilibj.command.PIDCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.OI;
import frc.robot.subsystems.Camera;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Camera.CAMERA;

public class driveByAssist extends PIDCommand {

  private CAMERA location;

  public driveByAssist(CAMERA location) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);

    super(0.01, 0.00, 0.00);   // P,I,D values to use on Aiming.

    requires(Drivetrain.getInstance());
    requires(Camera.getInstance());

    this.location = location;

    getPIDController().setAbsoluteTolerance(1.5);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
          // Always set which camera you are using. This is passed into the command 
      // from OI.java.

      setSetpoint(0.0);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Camera.getCamera(location);
    Camera.getInstance().setCamera(location);
    Camera.getInstance().setDockingMode();
  }

  @Override
  protected double returnPIDInput() {
    // perfrom PID controller on X -- rotational degrees.
    return (Camera.getInstance().RotationalDegreesToTarget());
  }

  @Override
  protected void usePIDOutput(double output) {
    SmartDashboard.putNumber("PID Output: ", output);

    // Output is the PID controllers output for tx -- rotational degrees
    // Forward is just driver Y stick value.
    
    double distance_adjust = OI.getInstance().getDriverY();  // forward throttle

    // output is steering adjustment
    Drivetrain.getInstance().tankDrive(distance_adjust + output, -(distance_adjust - output));
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return (Camera.getInstance().IsTargetFound() == false);
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Camera.getInstance().setCameraMode();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }

}
