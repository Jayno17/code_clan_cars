import Cars.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTypeTest {
    EngineType engineType;

    @Before
    public void before(){
       engineType = new EngineType("MercedesBenz",1800);
    }

    @Test
    public void hasName(){
        assertEquals("MercedesBenz", engineType.getName());
    }
    @Test
    public void hasSize(){
        assertEquals(1800, engineType.getSize());
    }

}

