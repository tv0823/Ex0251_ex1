public class Bicycle extends Vehicle{
    @Override
    public void start() {
        System.out.println("move your legs on the pedals");
    }

    @Override
    public void stop() {
        System.out.println("Put one both legs down");
    }

    @Override
    public double accelerate() {
        return 1;
    }
}
