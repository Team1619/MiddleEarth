package org.usfirst.frc.team1619.robot.subsystems;

import org.usfirst.frc.team1619.robot.RobotMap;
import org.usfirst.frc.team1619.robot.commands.ServoCommand;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ServoSystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private Servo servo;
	private DigitalInput limitSwitch;
	private double servoPosition; 
	private double servoPositionModifier;
	
	public ServoSystem() {
		servo = new Servo(RobotMap.servoPWMID);
		limitSwitch = new DigitalInput(RobotMap.limitSwitchDIOID);
		//System.out.println("ServoSystem Created");
		servoPosition = servo.getPosition();
		servoPositionModifier = 0.1;
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ServoCommand());
    }
    
    public boolean getSwitch() {
    	return limitSwitch.get();
    }
    
    public void run() {
    	servoPosition = servo.getPosition();
    	if((servoPosition >= 1.0 && servoPositionModifier > 0) || (servoPosition <= 0.0 && servoPositionModifier < 0)) {
    		servoPositionModifier *= -1;
    	}
    	servo.set(servoPosition += servoPositionModifier);

    	System.out.println(servoPosition);
    }
    
    public void stop() {
    	servo.set(servoPosition);
    }
    
    public double getServoPosition() {
    	servoPosition = servo.getPosition();
    	return servoPosition;
    }
}

