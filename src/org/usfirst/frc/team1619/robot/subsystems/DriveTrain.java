package org.usfirst.frc.team1619.robot.subsystems;

import org.usfirst.frc.team1619.robot.Robot;
import org.usfirst.frc.team1619.robot.RobotMap;
import org.usfirst.frc.team1619.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	RobotDrive drive;	
    Talon leftMotor;
    Talon rightMotor;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public DriveTrain() {
    	leftMotor = new Talon(RobotMap.leftMotor);
    	rightMotor = new Talon(RobotMap.rightMotor);
   
    	
    	drive = new RobotDrive(leftMotor, rightMotor);
    	drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
    	drive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, false);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveCommand());
    }
    
    public void drive(GenericHID inputDevice) {
    	drive.arcadeDrive(inputDevice);
    }
}

