import Cars.Car;
import Cars.ElectricCar;
import Cars.EngineType;
import Cars.Tyre;
import People.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Car car1;
    ElectricCar car2;
    EngineType dieselEngine;
    EngineType electricEngine;
    Tyre tyres;
    Customer customer;

    @Before
    public void before(){
        dieselEngine = new EngineType("MercedesBenz", 1600);
        electricEngine = new EngineType("MercedesBenz", 1600);
        tyres = new Tyre("Dunlop", 4);
        car1 = new Car(20000,"blue",dieselEngine,tyres);
        car2 = new ElectricCar(30000,"blue",electricEngine,tyres);
        customer = new Customer("Dave", 40000);
    }

    @Test
    public void hasName(){
        assertEquals("Dave", customer.getName());
    }
    @Test
    public void hasMoney(){
        assertEquals(40000, customer.getMoney(), 0.1);
    }
    @Test
    public void canAddCarToCollection(){
        customer.addCar(car1);
        customer.addCar(car2);
        assertEquals(2, customer.getCars().size());
    }
}
