import Cars.*;
import People.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car1;
    ElectricCar car2;
    EngineType dieselEngine;
    EngineType electricEngine;
    Tyre tyres;
    Customer customer;
    ArrayList<Vehicle> stock;

    @Before
    public void before(){
        dieselEngine = new EngineType("MercedesBenz", 1600);
        electricEngine = new EngineType("MercedesBenz", 1600);
        tyres = new Tyre("Dunlop", 4);
        car1 = new Car(20000,"blue",dieselEngine,tyres);
        car2 = new ElectricCar(30000,"blue",electricEngine,tyres);
        customer = new Customer("Dave", 40000);
        stock = new ArrayList<Vehicle>();
        stock.add(car1);
        stock.add(car2);
        dealership = new Dealership(stock,100);

    }

    @Test
    public void hasTill(){
        assertEquals(100, dealership.getTill(), 0.1);
    }
    @Test
    public void hasCars(){
        assertEquals(2, dealership.getCars().size());
    }







}
