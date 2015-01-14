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
	
	public ServoSystem() {
		servo = new Servo(RobotMap.servoPWMID);
		limitSwitch = new DigitalInput(RobotMap.limitSwitchDIOID);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ServoCommand());
    }
    
    public boolean getSwitch() {
    	return limitSwitch.get();
    }
    
    public void run() {
    	servo.set(0.5);
    }
    
    public void stop() {
    	servo.set(0.0);
    }
}

