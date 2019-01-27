/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Auto;

import com.team319.follower.FollowArc;

import edu.wpi.first.wpilibj.command.Command;
import frc.arcs.Forward1FootArc;
import frc.robot.subsystems.Camera;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Camera.CAMERA;

public class testAuto extends Command {

  private CAMERA location;

  public testAuto(CAMERA location) {
    Camera.getInstance().setCamera(location);
    requires(Camera.getInstance());
    requires(Drivetrain.getInstance());

    this.location = location;
  }

  @Override
  protected void initialize() {
   
  }

  @Override
  protected void execute() {
    Camera.getInstance().getCamera(location);
    Camera.getInstance().setCamera(location);

    if (location == CAMERA.FRONT) {
      new FollowArc(Drivetrain.getInstance(), new Forward1FootArc(false));
    }else {
      new FollowArc(Drivetrain.getInstance(), new Forward1FootArc(true));
    }
      
    
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }
}
