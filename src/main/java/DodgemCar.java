public class DodgemCar extends Vehicle implements IDriveable {

    private int numberOfSeats;
//    private int averageSpeed;

    public DodgemCar(int numberOfSeats, int averageSpeed) {
        super(averageSpeed);
        this.numberOfSeats = numberOfSeats;

    }

    public int driveDistance(int distance){
        return distance/getAverageSpeed();
    }

    //refactored below code by adding and extending abstract class Vehicle
//    public int getAverageSpeed(){
//        return averageSpeed;
//    }
//
//    public void setAverageSpeed(int newAverageSpeed){
//        this.averageSpeed = newAverageSpeed;
//    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
