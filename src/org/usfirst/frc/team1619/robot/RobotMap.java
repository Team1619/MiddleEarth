package org.usfirst.frc.team1619.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    public final static int leftMotor = 0;
    public final static int rightMotor = 1;
    
    public final static int leftJoystick = 0;
    public final static String cameraName = "cam0"; 
    public final static int kachigLeft = 4;
    public final static int kachigRight = 5;
    
    public final static int servoPWMID = 2;
    public final static int limitSwitchDIOID = 0;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
