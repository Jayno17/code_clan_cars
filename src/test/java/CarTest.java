import Cars.Car;
import Cars.EngineType;
import Cars.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    EngineType dieselEngine;
    Tyre tyres;

    @Before
    public void before(){
        dieselEngine = new EngineType("Diesel", 1600);
        tyres = new Tyre("Dunlop", 4);
        car = new Car(20000,"blue",dieselEngine,tyres);
    }

    @Test
    public void hasPrice(){
        assertEquals(20000,car.getPrice(), 0.1 );
    }

    @Test
    public void hasColour(){
        assertEquals("blue", car.getColour());
    }
    @Test
    public void hasEngineType(){
       assertEquals(dieselEngine, car.getEngine());
    }

    @Test
    public void hasTyres(){
        assertEquals(tyres, car.getTyres());
    }


}
