package sky;
import sky.logic.*;


import java.awt.geom.Point2D;

import robocode.*;
import robocode.util.Utils;

//WTF!!
public class PewPew extends AdvancedRobot {

	Point2D.Double pos, ePos;

	public void run() {
		while(true)	turnRadarLeftRadians(Double.POSITIVE_INFINITY);
	}
	
	public void onScannedRobot(ScannedRobotEvent e)
	{	
		pos = new Point2D.Double(getX(),getY());
		ePos = Bot.getPos(pos,e.getBearingRadians() + getHeadingRadians(), e.getDistance());
		out.println(ePos);
		
		//radar scan
		setTurnRadarRightRadians(Utils.normalRelativeAngle(getHeadingRadians() - getRadarHeadingRadians() + e.getBearingRadians()));
	
	
		//move bot
	
	}
}