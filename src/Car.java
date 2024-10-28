public class Car extends Vehicle{
    @Override
    public void start() {
        System.out.println("Put your leg on the gas pedal");
    }

    @Override
    public void stop() {
        System.out.println("Put your leg on the break pedal");
    }

    @Override
    public double accelerate() {
        return 3;
    }
}
