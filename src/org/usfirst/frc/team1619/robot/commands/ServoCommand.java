package org.usfirst.frc.team1619.robot.commands;

import org.usfirst.frc.team1619.robot.Robot;
import org.usfirst.frc.team1619.robot.subsystems.ServoSystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ServoCommand extends Command {
	private ServoSystem servoSystem;
	
    public ServoCommand() {
        // Use requires() here to declare subsystem dependencies
    	servoSystem = Robot.getRobot().servoSystem;
        requires(servoSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	while(servoSystem.getSwitch()) {
    		servoSystem.run();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	servoSystem.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
