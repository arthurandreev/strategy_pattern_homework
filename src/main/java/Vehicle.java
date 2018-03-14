public abstract class Vehicle {
    private int averageSpeed;

    public Vehicle(int averageSpeed){
        this.averageSpeed = averageSpeed;
    }

    public int getAverageSpeed(){
        return this.averageSpeed;
    }

    public void setAverageSpeed(int newAverageSpeed){
        this.averageSpeed = newAverageSpeed;
    }
}
