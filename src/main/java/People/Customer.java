package People;

import Cars.Car;
import Cars.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private ArrayList<Vehicle> cars;

    public Customer(String name, double money){
        this.name = name;
        this.money = money;
        this.cars = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getCars() {
        return cars;
    }

    public void addCar(Vehicle car) {
        this.cars.add(car);
    }
}
