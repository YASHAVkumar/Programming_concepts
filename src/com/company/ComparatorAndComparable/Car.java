package com.company.ComparatorAndComparable;



public class Car implements Comparable<Car>{
    long price;
    String name;
    int speed;

    public Car(long price,String name,int speed) {
        this.price = price;
        this.name=name;
        this.speed=speed;
    }

    @Override
    public String toString() {
        return "car{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                "} local";
    }

    @Override
    public int compareTo(Car car) {

        if(this.name.compareTo(car.name)>0)
            return 0;
        else
            return 1;
    }
}
