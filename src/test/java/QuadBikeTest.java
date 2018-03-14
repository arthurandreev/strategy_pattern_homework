import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadBikeTest {

    QuadBike quadBike;

    @Before
    public void before(){
        quadBike = new QuadBike(50, 200);
    }

    @Test
    public void canGetAverageSpeed(){
        assertEquals(50, quadBike.getAverageSpeed());
    }

    @Test
    public void canSetAverageSpeed(){
        quadBike.setAverageSpeed(100);
        assertEquals(100, quadBike.getAverageSpeed());
    }

    @Test
    public void canGetEngineCapacity(){
        assertEquals(200, quadBike.getEngineCapacity());
    }

    @Test
    public void canSetEngineCapacity(){
        quadBike.setEngineCapacity(5);
        assertEquals(5, quadBike.getEngineCapacity());
    }
}
