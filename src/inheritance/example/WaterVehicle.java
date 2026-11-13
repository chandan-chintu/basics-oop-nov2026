package inheritance.example;

public class WaterVehicle extends Vehicle{

    public void travelsOnWater(){
        System.out.println("Travels on Water");
    }

    @Override // this tells that we are overriding parent class implementation in child class and it is optional
    public void start() {
        System.out.println("WaterVehicle started");
    }

    @Override
    public void stop() {
        System.out.println("WaterVehicle stopped");
    }

    @Override
    public void fuel() {
        System.out.println("WaterVehicle fueled");
    }
}
