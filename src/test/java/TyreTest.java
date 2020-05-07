import Cars.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyres;

    @Before
    public void before(){
        tyres = new Tyre("Dunlop", 4);
    }

    @Test
    public void hasBrand(){
        assertEquals("Dunlop", tyres.getBrand());
    }

    @Test
    public void hasNumber(){
        assertEquals(4, tyres.getNumber());
    }
}
