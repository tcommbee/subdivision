public class Point {
	public double x, y;
	public Point() {
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return x + " " + y;
	}
	public static Point avg(Point a, Point b) {
		return new Point((a.x+b.x)/2, (a.y+b.y)/2);
	}
	//start, end
	public boolean isRightOf(Point s, Point e) {
		return (e.x-s.x)*(y-s.y)-(e.y-s.y)*(x-s.x) < 0;
	}
	public boolean isLeftOf(Point s, Point e) {
		return (e.x-s.x)*(y-s.y)-(e.y-s.y)*(x-s.x) > 0;
	}
	/*public static Point add(Point a, Point b) {
		return new Point(a.x+b.x, a.y+b.y);
	}*/
}
