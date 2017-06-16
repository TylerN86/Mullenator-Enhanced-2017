package org.usfirst.frc.team3414.actuactors;

import org.usfirst.frc.team3414.util.RotationalDirection;

public class DoubleMotor extends MotorBase
{
	
	private Motor motorOne;
	private Motor motorTwo;
	
	private boolean isSafeConfig = false;
	
	public DoubleMotor (Motor motorOne, Motor motorTwo)
	{
		this.motorOne = motorOne;
		this.motorTwo = motorTwo;
	}

	
	public void setSpeed(double speed) 
	{
		if (isSafeConfig())
		{
			motorOne.setSpeed(speed);
			motorTwo.setSpeed(speed);
		}
		
	}

	private boolean isSafeConfig()
	{
		if(motorOne.isReversed() && motorOne.isReversed())
		{
			isSafeConfig = true;
		}	
		else if(!motorOne.isReversed() && !motorOne.isReversed())
		{
			isSafeConfig = true;
		}
		else
		{
			System.err.println("Double Motor Configuration is unsafe: Locking");
			isSafeConfig = false;
		}
		
		return isSafeConfig;
	}

	public void stop() 
	{
		motorOne.stop();
		motorTwo.stop();
	}

	public void setDirection(RotationalDirection direction) 
	{
		motorOne.setDirection(direction);
		motorTwo.setDirection(direction);
	}

	public void setMotorReveresed(boolean reverse) 
	{
		this.isReversed = reverse;
		motorOne.setMotorReveresed(reverse);
		motorTwo.setMotorReveresed(reverse);
	}
	
	public Motor motorOne()
	{
		return motorOne;
	}
	
	public Motor motorTwo()
	{
		return motorTwo;
	}

}
