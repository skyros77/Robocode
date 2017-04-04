package sky.logic;

import java.awt.geom.Point2D;

public class Bot {
	
	// get position of target from angle/distance
	public static Point2D.Double getPos(Point2D.Double pos, double angle, double distance) {
		double x = pos.x + distance * Math.sin(angle);
		double y = pos.y + distance * Math.cos(angle);
		return new Point2D.Double(x,y);
	}
}