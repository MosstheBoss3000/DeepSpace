/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Auto;

import com.team319.follower.FollowArc;
import com.team319.follower.SrxTrajectory;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.arcs.Forward1FootArc;
import frc.robot.commands.Camera.driveByDockingPID;
import frc.robot.subsystems.Camera.CAMERA;

public class AutoGroup extends CommandGroup {
  public AutoGroup(SrxTrajectory path) {
		 this(path, null);
	 }

    public AutoGroup(SrxTrajectory path, Command phase2) {
    	addSequential(new driveByDockingPID(CAMERA.FRONT));
      addSequential(new FollowArc(null, new Forward1FootArc()));
      // addSequential(new WaitCommand(0.25));
        if (phase2 != null) {
        	addSequential(phase2);
        }
    }
}
