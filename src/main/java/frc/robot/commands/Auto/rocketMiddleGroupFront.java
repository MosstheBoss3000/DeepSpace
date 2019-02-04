/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Auto;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.arcs.HpRocketMiddleArc;
import frc.arcs.HpRocketMiddleReverseArc;
import frc.robot.camera.CAMERA;
import frc.robot.commands.FollowArc;
import frc.robot.commands.drivetrain.driveByDockingPID;
import frc.robot.commands.drivetrain.resetHeading;
import frc.robot.subsystems.Drivetrain;

public class rocketMiddleGroupFront extends CommandGroup {
  /**
   * Add your docs here.
   */
  public rocketMiddleGroupFront() {
    addSequential(new resetHeading());
    addSequential(new FollowArc(Drivetrain.getInstance(), new HpRocketMiddleArc(), false, false, false));
    addSequential(new driveByDockingPID(CAMERA.FRONT));
    // addSequential(new FollowArc(Drivetrain.getInstance(), new HpRocketCloseArc(), false, true, true));
    addSequential(new FollowArc(Drivetrain.getInstance(), new HpRocketMiddleReverseArc(), false, false, false));
  }
}
