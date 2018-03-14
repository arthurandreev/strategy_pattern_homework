import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DriverTest {

    Driver driver;
    DodgemCar dodgemCar;
    QuadBike quadBike;

    @Before
    public void before() {
        dodgemCar = new DodgemCar(4, 50);
        driver = new Driver("Speedy Gonzales", dodgemCar);
        quadBike = new QuadBike(15, 2000);
    }

    @Test
    public void canGetName(){
        assertEquals("Speedy Gonzales", driver.getName());
    }

    @Test
    public void canSetName(){
        driver.setName("Mother Teresa");
        assertEquals("Mother Teresa", driver.getName());
    }

    @Test
    public void canGetVehicle(){
        assertEquals(dodgemCar, driver.getVehicle());
    }

    @Test
    public void canSetVehicle(){
        driver.setVehicle(quadBike);
        assertEquals(quadBike, driver.getVehicle());
    }

    @Test
    public void getDriveTimeForDodgemCar() {
        assertEquals(2, dodgemCar.driveDistance(100));
    }

    @Test
    public void getDriveTimeForQuadBike(){
        assertEquals(10, quadBike.driveDistance(150));
    }
}