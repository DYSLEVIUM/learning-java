package org.inheritance;

// types of inheritance: hierarchical, single, multi-level, multiple, hybrid
public class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int startHeight, int startSpeed, int startGear) {
        super(startSpeed, startGear);
        seatHeight = startHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 10, 1);

        System.out.println("Gear is: " + mountainBike.gear);
        System.out.println("Seat height is: " + mountainBike.seatHeight);
        System.out.println("Bike speed is: " + mountainBike.speed);
        mountainBike.applyBrake(1);
        System.out.println("Bike speed after applying brake is: " + mountainBike.speed);
    }
}
