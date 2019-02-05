/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Auto;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import frc.arcs.DistanceScalingArc;
import frc.arcs.TurnScalingArc;
import com.team319.follower.FollowArc;

import frc.robot.camera.CAMERA;
import frc.robot.commands.drivetrain.driveByDocking;
import frc.robot.commands.drivetrain.driveByDockingPID;
import frc.robot.commands.drivetrain.resetHeading;
import frc.robot.subsystems.Drivetrain;

public class FollowArcTesting extends CommandGroup {
  /**
   * Add your docs here.
   */
  public FollowArcTesting(CAMERA location) {
  // Drivetrain.getInstance().resetHeading();
  addSequential(new resetHeading());
  addSequential(new FollowArc(Drivetrain.getInstance(), new TurnScalingArc(), false, true));
  // addSequential(new WaitCommand(0.25));
  addSequential(new driveByDocking(location));
  // addSequential(new WaitCommand(0.75));

  // addSequential(new resetHeading());
  // addSequential(new FollowArc(Drivetrain.getInstance(), new TurnScalingArc(), false, true)); //to flip path the robot must also get flipped
  }
}
