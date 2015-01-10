package org.usfirst.frc.team1619.robot.commands;

import org.usfirst.frc.team1619.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class KachigCommand extends Command {
	
	
	Timer timer = new Timer();
	
    public KachigCommand() {
        requires(Robot.getRobot().driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return timer.get() > 0.25;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.getRobot().driveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    
    static public class KachigLeftCommand extends KachigCommand {
    	
    	protected void execute() {
        	Robot.getRobot().driveTrain.drive(0, 0.25);
        }
    }
    
    static public class KachigRightCommand extends KachigCommand {
    	
    	protected void execute() {
    		Robot.getRobot().driveTrain.drive(0, -0.25);
    	}
    }
}
