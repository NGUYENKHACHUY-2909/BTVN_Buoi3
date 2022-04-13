package BTVN_Buoi3;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    //Ball()
    public Ball(float x, float y, int radius, float xDelta, float yDelta){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    //setter
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setxDelta(float xDelta){
        this.xDelta = xDelta;
    }
    public void setyDelta(float yDelta){
        this.yDelta = yDelta;
    }


    //getter
    public float getX(){
        return x;
    }
    public int getRadius() {
        return radius;
    }

    public float getyDelta() {
        return yDelta;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getY() {
        return y;
    }

    //toString()
    public String toString(){
        return "Ball[("+x+","+y+")], speed = ("+xDelta+","+yDelta+")]";
    }

    //move()
    public void move(){
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    //reflectHorizontal()
    public void reflectHorizontal(){
        this.xDelta= -xDelta;
    }

    //reflectVertical()
    public void reflectVertical(){
        this.yDelta= -yDelta;
    }

    public static void main(String[] args){
        System.out.println(new Ball(3,4,8,9,12).toString());
        System.out.println(new Ball(80,35,10,4,6).toString());
        Ball ballOne = new Ball(80,35,10,4,6);
        System.out.println("x is: "+ballOne.getX());
        System.out.println("y is: "+ballOne.getY());
        System.out.println("radius is: "+ballOne.getRadius());
        System.out.println("xDelta is: "+ballOne.getxDelta());
        System.out.println("yDelta is: "+ballOne.getyDelta());
        ballOne.move();
        System.out.println(ballOne.toString());
        ballOne.move();
        System.out.println(ballOne.toString());
        ballOne.reflectVertical();
        ballOne.move();
        System.out.println(ballOne.toString());
        ballOne.move();
        System.out.println(ballOne.toString());
        ballOne.reflectHorizontal();
        ballOne.move();
        System.out.println(ballOne.toString());
        ballOne.move();
        System.out.println(ballOne.toString());
    }
}
