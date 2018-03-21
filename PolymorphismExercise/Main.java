package com.shreyas;

class car{
    private String name;
    private int cylinders;

    private int wheels;
    private boolean engine;

    private int currentVelocity;

    public car(String name,int cylinders){
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
        this.currentVelocity = 0;
    }

    public String startEngine(String name){
        if(name == "Honda Accord" || name == "Audi Q9"){
            System.out.println("Press start button to start the " + name);
        }else {
            System.out.println("Put the key in the ignition and turn clockwise to start " + name);
        }
        return name;

    }
    public int accelerate(String name,int velocity){
        currentVelocity += velocity;
        System.out.println(getName()+ " is moving at speed of: " + currentVelocity + "km/h.");
        return currentVelocity;
    }

    public void stop(String name){
        this.currentVelocity = 0;
        System.out.println(getName() + " has stopped.");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getCurrentVelocity(){
        return this.currentVelocity;
    }

    public int getWheels(){
        return this.wheels;
    }
}

class Honda extends car{
    public Honda() {
        super("Honda Accord", 6);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String startEngine(String name) {
        return super.startEngine(name);
    }

    @Override
    public int accelerate(String name, int velocity) {
        return super.accelerate(name, velocity);
    }

    @Override
    public void stop(String name) {
        super.stop(name);
    }
}

class MB extends car{
    public MB() {
        super("Mercedes Benz B200 Turbo", 4);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String startEngine(String name) {
        return super.startEngine(name);
    }

    @Override
    public int accelerate(String name, int velocity) {
        return super.accelerate(name, velocity);
    }

    @Override
    public void stop(String name) {
        super.stop(name);
    }
}

class Audi extends car{
    public Audi() {
        super("Audi Q9", 8);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String startEngine(String name) {
        return super.startEngine(name);
    }

    @Override
    public int accelerate(String name, int velocity) {
        return super.accelerate(name, velocity);
    }

    @Override
    public void stop(String name) {
        super.stop(name);
    }

}

public class Main {

    public static void main(String[] args) {
        car car1 = favouriteCar1();
        System.out.println("");
        System.out.println("My first favourite car is " + car1.getName());
        System.out.println("It has " + car1.getCylinders() + " cylinders" + " and " +
        car1.getWheels() + " wheels.");
        car1.startEngine(car1.getName());
        car1.accelerate(car1.getName(),50);
        car1.stop(car1.getName());

        car car2 = favouriteCar2();
        System.out.println("");
        System.out.println("My second favourite car is " + car2.getName());
        System.out.println("It has " + car2.getCylinders() + " cylinders" + " and " +
                car2.getWheels() + " wheels.");
        car2.startEngine(car2.getName());
        car2.accelerate(car2.getName(),60);
        car2.stop(car2.getName());

        car car3 = favouriteCar3();
        System.out.println("");
        System.out.println("My third favourite car is " + car3.getName());
        System.out.println("It has " + car3.getCylinders() + " cylinders" + " and " +
                car3.getWheels() + " wheels.");
        car3.startEngine(car3.getName());
        car3.accelerate(car3.getName(),70);
        car3.stop(car3.getName());
    }

    public static car favouriteCar1() {
        return new Honda();
    }
    public static car favouriteCar2() {
        return new MB();
    }
    public static car favouriteCar3() {
        return new Audi();
    }
}

