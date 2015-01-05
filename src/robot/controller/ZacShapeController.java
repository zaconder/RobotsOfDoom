package robot.controller;

import robot.model.DrawingRobot;
import lejos.nxt.Button;

public class ZacShapeController
{
	private DrawingRobot myBot;
	
	public ZacShapeController()
	{
		myBot = new DrawingRobot();
	}
	
	public void start()
	{
		while( Button.waitForAnyPress() != Button.ID_ESCAPE)
		{
			myBot.drawShape(4, 1);
			myBot.drawCircle(1, 1);
			myBot.drawTri(3, 1);
			myBot.drawHex(6, 1);
			myBot.drawOct(8, 1);
		}
	}
}
