package inheritance.example;

public class AirVehicle extends Vehicle{

    public void travelsOnAir(){
        super.color="green";
        System.out.println("Travels on air");
        System.out.println("color is : "+super.color);
    }

    @Override // this tells that we are overriding parent class implementation in child class and it is optional
    public void start() {
        System.out.println("AirVehicle started");
        super.start();
    }

    @Override
    public void stop() {
        System.out.println("AirVehicle stopped");
    }

    @Override
    public void fuel() {
        System.out.println("AirVehicle fueled");
    }
}
