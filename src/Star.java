import java.lang.Math;

public class Star {
    private double distance;
    private double angle;
    private double speed;

    /*
     * Creates a star with a given angle and distance from the origin = 0
     * @param angle: angle in radians
     */
    public Star(double a, double s) {
        distance = 0;
        angle = a;
        speed = s;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public int getX() {
        return (int)(distance * Math.cos(angle));
    }

    public int getY() {
        return (int)(distance * Math.sin(angle));
    }

    public double getSpeed() {
        return speed;
    }
}
