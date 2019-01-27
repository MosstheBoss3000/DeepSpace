/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Auto;

import javax.tools.DocumentationTool.Location;

import com.team319.follower.FollowArc;
import com.team319.trajectory.SrxTrajectory;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.arcs.Forward1FootArc;
import frc.robot.commands.Camera.driveByDocking;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Camera.CAMERA;

public class testAutoVisionGroup extends CommandGroup {

  /**
   * Add your docs here.
   */
  
  public testAutoVisionGroup(boolean flipped, CAMERA location) {
    addSequential(new FollowArc(Drivetrain.getInstance(), new Forward1FootArc(flipped)));
    addSequential(new driveByDocking(location));
  }
}
