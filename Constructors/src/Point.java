public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // getter & setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double distance = Math.sqrt((x*x) + (y*y));
        return distance;
    }

    public double distance(int x, int y) {
        double distance = Math.sqrt(Math.pow((x-this.x),2) + Math.pow(y-this.y, 2));
        return distance;
    }
    public double distance(Point another) {
        double distance = Math.sqrt(Math.pow((another.getX()-this.x),2) + Math.pow(another.getY()-this.y, 2));
        return distance;
    }
}
