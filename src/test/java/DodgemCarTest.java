import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DodgemCarTest {

DodgemCar dodgemCar;

@Before
    public void before(){
    dodgemCar = new DodgemCar(4, 50);
}

@Test
    public void canGetAverageSpeed(){
    assertEquals(50, dodgemCar.getAverageSpeed());
}

@Test
    public void canSetAverageSpeed(){
    dodgemCar.setAverageSpeed(100);
    assertEquals(100, dodgemCar.getAverageSpeed());
}

@Test
    public void canGetNumberOfSeats(){
    assertEquals(4, dodgemCar.getNumberOfSeats());
}

@Test
    public void canSetNumberOfSeats(){
    dodgemCar.setNumberOfSeats(5);
    assertEquals(5, dodgemCar.getNumberOfSeats());
}

}