import java.awt.geom.Point2D.Double;
import java.util.ArrayList;

public class Spline {
	
	private class Point {
		public double x, y;
		public Point() {
		}
		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public static Point avg(Point a, Point b) {
			return new Point((a.x+b.x)/2, (a.y+b.y)/2);
		}
		//start, end
		public boolean isRightOf(Point s, Point e) {
			return (e.x-s.x)*(y-s.y)-(e.y-s.y)*(x-s.x) < 0;
		}
		/*public static Point add(Point a, Point b) {
			return new Point(a.x+b.x, a.y+b.y);
		}*/
	}
	private class ConvexHull {
		private ArrayList list = new ArrayList();
		public boolean addPoint(Point p) {
			int l = list.size();
			if(l > 2) {
				
			}
			else if(l < 2) {
				l.add(p);
			} else {
				if(p.isRightOf(list.get(0), list.get(1)))
					list.add(l, p);
					list.add(0, p);
				}
			}
		}
	private Point[] pts;
	public Spline(String repr) {
	}
	public Spline(int[] coords) {
		pts = new Point[coords.length/2];
		for(int i = 0; i < length/2-1; i++) {
			pts[i].x = coords[2*i];
			pts[i].y = coords[2*i+1];
		}
	}
	public static boolean testA(Spline a, Spline b) {
		
	}
}
