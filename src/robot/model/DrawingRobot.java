package robot.model;

import lejos.nxt.Motor;

public class DrawingRobot
{
	
	public void drawShape(int vertexCount, int length)
	{
		int angle = calculateAngle(vertexCount);
		
		for(int drawCount = 0; drawCount < vertexCount; drawCount++)
		{
			try
			{
				Motor.B.backward();
				Motor.C.backward();
				Thread.sleep(length* 5000);
				Motor.B.stop();
				Motor.C.stop();
				Thread.sleep(length* 1000);
				Motor.A.rotate(angle, true);
				Thread.sleep(length* 500);
				Motor.C.flt();
				Motor.B.backward();
				Thread.sleep(length* 1500);
				Motor.A.rotate(90, true);
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
	}
	
	public int calculateAngle(int vertexCount)
	{
		int currentAngle = 0;
		
		if(vertexCount != 0)
		{
			currentAngle = 360/4;
		}
		
		return currentAngle;
	}
	
	public void drawCircle(int vertexCount, int length)
	{
		int angle = circAngle(vertexCount);
		
		for(int drawCount = 0; drawCount < vertexCount; drawCount++)
		{
			try
			{ 
			Motor.A.rotate(angle, true);
			Motor.B.flt();
			Motor.C.backward();
			Thread.sleep(length* 3000);
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
	}
	
	public int circAngle(int vertexCount)
	{
		int currentAngle = 0;
		
		if(vertexCount != 0)
		{
			currentAngle = 360/4;
		}
		
		return currentAngle;
	}
	
	public void drawTri(int vertexCount, int length)
	{
		int angle = calculateAngle(vertexCount);
		
		for(int drawCount = 0; drawCount < vertexCount; drawCount++)
		{
			try
			{
				Motor.B.backward();
				Motor.C.backward();
				Thread.sleep(length* 5000);
				Motor.B.stop();
				Motor.C.stop();
				Thread.sleep(length* 1000);
				Motor.A.rotate(angle, true);
				Thread.sleep(length* 500);
				Motor.C.flt();
				Motor.B.backward();
				Thread.sleep(length* 1500);
				Motor.A.rotate(angle, true);
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
	}
	
	public int TriAngle(int vertexCount)
	{
		int currentAngle = 0;
		
		if(vertexCount != 0)
		{
			currentAngle = 360/3;
		}
		
		return currentAngle;
	}
	
	public void drawHex(int vertexCount, int length)
	{
		int angle = calculateAngle(vertexCount);
		
		for(int drawCount = 0; drawCount < vertexCount; drawCount++)
		{
			try
			{
				Motor.B.backward();
				Motor.C.backward();
				Thread.sleep(length* 3000);
				Motor.B.stop();
				Motor.C.stop();
				Thread.sleep(length* 1000);
				Motor.A.rotate(angle, true);
				Thread.sleep(length* 500);
				Motor.C.flt();
				Motor.B.backward();
				Thread.sleep(length* 500);
				Motor.A.rotate(angle, true);
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
	}
	
	public int HexAngle(int vertexCount)
	{
		int currentAngle = 0;
		
		if(vertexCount != 0)
		{
			currentAngle = 720/6;
		}
		
		return currentAngle;
	}
	
	public void drawOct(int vertexCount, int length)
	{
		int angle = calculateAngle(vertexCount);
		
		for(int drawCount = 0; drawCount < vertexCount; drawCount++)
		{
			try
			{
				Motor.B.backward();
				Motor.C.backward();
				Thread.sleep(length* 3000);
				Motor.B.stop();
				Motor.C.stop();
				Thread.sleep(length* 1000);
				Motor.A.rotate(angle, true);
				Thread.sleep(length* 500);
				Motor.C.flt();
				Motor.B.backward();
				Thread.sleep(length* 500);
				Motor.A.rotate(angle, true);
			}
			catch(Exception threadException)
			{
				System.out.print(threadException.getMessage());
			}
		}
	}
	
	public int OctAngle(int vertexCount)
	{
		int currentAngle = 0;
		
		if(vertexCount != 0)
		{
			currentAngle = 1080/8;
		}
		
		return currentAngle;
	}
	
	
}
