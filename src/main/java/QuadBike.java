public class QuadBike extends Vehicle implements IDriveable {

//    private int averageSpeed;
    private int engineCapacity;

    public QuadBike(int averageSpeed, int engineCapacity){
        super(averageSpeed);
        this.engineCapacity = engineCapacity;
    }

    public int driveDistance(int distance){
        return distance/getAverageSpeed();
    }

    //refactored below code by adding and extending abstract class Vehicle
//    public int getAverageSpeed() {
//        return averageSpeed;
//    }
//
//    public void setAverageSpeed(int averageSpeed) {
//        this.averageSpeed = averageSpeed;
//    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
