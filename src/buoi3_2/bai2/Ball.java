package buoi3_2.bai2;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    // contructor
    public Ball(float x, float y, int radius, float xDelta, float yDelta){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void move() {
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal() {
        this.xDelta = -xDelta;
    }

    public void reflectVertical() {
        this.yDelta = -yDelta;
    }

    public String toString() {
        return String.format("Ball[(%.1f,%.1f),speed=(%.1f,%.1f)]", this.x, this.y, this.xDelta, yDelta);
    }

    public static void main(String[] args) {
        System.out.println(new Ball(80,35,5,4,6).toString());
        Ball ballnew = new Ball(80,35,5,4,6);
        System.out.println("x is: " + ballnew.getX());
        System.out.println("y is: " + ballnew.getY());
        System.out.println("radius: " + ballnew.getRadius());
        System.out.println("xDelta is: " + ballnew.getxDelta());
        System.out.println("yDelta is: " + ballnew.getyDelta());
        ballnew.move();
        System.out.println(ballnew.toString());
        ballnew.move();
        System.out.println(ballnew.toString());
        ballnew.reflectVertical();
        ballnew.move();
        System.out.println(ballnew.toString());
        ballnew.move();
        System.out.println(ballnew.toString());
        ballnew.reflectHorizontal();
        ballnew.move();
        System.out.println(ballnew.toString());
        ballnew.move();
        System.out.println(ballnew.toString());
        ballnew.move();
        System.out.println(ballnew.toString());
        ballnew.move();
        System.out.println(ballnew.toString());
        ballnew.move();
        System.out.println(ballnew.toString());
        ballnew.move();
        System.out.println(ballnew.toString());
        ballnew.reflectVertical();
        ballnew.move();
        System.out.println(ballnew.toString());
        ballnew.move();
        System.out.println(ballnew.toString());
        ballnew.move();
        System.out.println(ballnew.toString());
        ballnew.move();
        System.out.println(ballnew.toString());
        ballnew.move();
        System.out.println(ballnew.toString());
    }

}
