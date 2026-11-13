package inheritance.example;

public class RoadVehicle extends Vehicle{

    public void travelsOnRoad(){
        System.out.println("Travels on Road");
    }

    @Override // this tells that we are overriding parent class implementation in child class and it is optional
    public void start() {
        System.out.println("RoadVehicle started");
    }

    @Override
    public void stop() {
        System.out.println("RoadVehicle stopped");
    }

    @Override
    public void fuel() {
        System.out.println("RoadVehicle fueled");
    }
}
