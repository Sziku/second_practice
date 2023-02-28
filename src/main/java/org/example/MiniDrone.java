package org.example;

public class MiniDrone {
    private String color;
    private int PositionX = 0;
    private int PositionY = 0;
    private int PositionZ = 0;

    public MiniDrone(String color) {
        this.color = color;
    }

    public MiniDrone() {
        color="blue";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getPositionX() {
        return PositionX;
    }

    public int getPositionY() {
        return PositionY;
    }

    public int getPositionZ() {
        return PositionZ;
    }

    public void moveRight(){
        PositionX+=1;
    }

    public void moveLeft(){
        PositionX-=1;
    }

    public void moveForward(){
        PositionY+=1;
    }

    public void moveBack(){
        PositionY-=1;
    }
    public void moveUp(){
        PositionZ+=1;
    }
    public void moveDown(){
        PositionZ-=1;
        if (PositionZ<0){
            PositionZ=0;
        }
    }

    public int calculateMovesFromHome(){
        return Math.abs(PositionX)+Math.abs(PositionY)+Math.abs(PositionZ);
    }

    public void returnHome(){
        PositionX = 0;
        PositionY = 0;
        PositionZ = 0;
    }
}
