package org.usfirst.frc.team3414.actuactors;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Relay.Value;

public class ActuatorConfig 
{
	private static ActuatorConfig instance;
	
	private CANTalon rightTalonOne;
	private CANTalon rightTalonTwo;
	private CANTalon leftTalonOne;
	private CANTalon leftTalonTwo;
	
	private CANTalon leftShootTalon;
	private CANTalon rightShootTalon;
	
	private CANTalon intakeTalon;
	private CANTalon augerTalon;
	private CANTalon linearActuatorTalon;
	
	private Motor rightMotorOne;
	private Motor rightMotorTwo;
	private Motor leftMotorOne;
	private Motor leftMotorTwo;
	
	private Motor leftShootMotor;
	private Motor rightShootMotor;
	
	private Motor intakeMotor;
	private Motor augerMoter;
	private Motor linearActuatorMotor;
	
	private DoubleMotor leftDoubleMotor;
	private DoubleMotor rightDoubleMotor;
	private DoubleMotor shootDoubleMotor;
	
	private DoubleSolenoid shooterSolenoid;
	
	private ActuatorConfig(){}
	
	public static ActuatorConfig getInstance()
	{
		if(instance == null)
		{
			instance = new ActuatorConfig();
		}
		
		return instance;
	}
	
	public void init()
	{
		shooterSolenoid = new DoubleSolenoid(1,0);
		
		rightTalonOne = new CANTalon(0);
		rightTalonTwo = new CANTalon(1);
		
		leftTalonOne = new CANTalon(2);
		leftTalonTwo = new CANTalon(3);
		
		leftShootTalon = new CANTalon(4);
		rightShootTalon = new CANTalon(5);
		
		intakeTalon = new CANTalon(6);
		augerTalon = new CANTalon(7);
		linearActuatorTalon = new CANTalon(8);
		
	}
	
}
