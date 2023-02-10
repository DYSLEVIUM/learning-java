package org.interfaces;

public class MountainBike extends TwoWheeler implements Bicycle, Vehicle {
    private int seatHeight;
    private int gear;
    private int speed;

    public MountainBike(int seatHeight, int startGear, int startSpeed) {
        this.seatHeight = seatHeight;
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void canDrive() {
        System.out.println("Mountain Bike can be driven.");
    }
}
