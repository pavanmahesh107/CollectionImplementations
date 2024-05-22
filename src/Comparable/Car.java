package Comparable;

public class Car implements Comparable<Car>{
    String name;
    int speed;
    int price;

    public Car(String name, int speed, int price){
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public int compareTo(Car other) {
        return other.speed - this.speed;
    }

    @Override
    public String toString() {
        return "[name:" +name+ " speed:" +speed+ " price:" +price+ "]";
    }
}
