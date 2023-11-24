package OE;
public class Vehicle {
    String name;
    String color;
    double speed;

    Vehicle(double speed) { 
        this.speed = speed;
        System.out.println("กำหนดความเร็วแล้ว");
    }

    public void run() {
        System.out.println("I am running with speed "+speed);
    }

    public void stop() {
        System.out.println("I am stopping");
    }
}

class Car extends Vehicle {
    Car(double speed) { 
        super(speed);
    }

    public void liveOnTheRoad() {
        System.out.println("I am living on the road");
    }
}

class Airplane extends Vehicle {
    Airplane(double speed) {
        super(speed);
    }
    public void flyOnTheAir() {
        System.out.println("I believe I can fly");
    }
}

class Boat extends Vehicle {
    Boat(double speed) {
        super(speed);
    }
    public void liveInTheSea() {
        System.out.println("I living in the sea");
    }
}
