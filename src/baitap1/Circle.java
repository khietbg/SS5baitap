package baitap1;

public class Circle {
    private double radius = 1;
    private String circleColor = "red";

    public Circle() {
    }

    public Circle(double radius, String circleColor) {
        this.radius = radius;
        this.circleColor = circleColor;
    }

    public double getRadius() {
        return radius;
    }

    public String getCircleColor() {
        return circleColor;
    }
}
