package org.usfirst.frc.team1619.robot.commands;

import org.usfirst.frc.team1619.robot.Robot;

<<<<<<< HEAD

=======
>>>>>>> 334184e03ea163f2cc1806f644eb21789f969c12
import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCommand extends Command {
	
	private Joystick leftJoystick; 
	
    public DriveCommand() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.getRobot().driveTrain);
    	leftJoystick = Robot.getRobot().oi.getLeftJoystick();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
<<<<<<< HEAD
=======
    	
>>>>>>> 334184e03ea163f2cc1806f644eb21789f969c12
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.getRobot().driveTrain.drive(leftJoystick); //Just give it the joystick directly
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.getRobot().driveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
