public class CarDisplay implements Observer{
    @Override
    public void update(int temperature) {
        System.out.println("Car Display: Temperature is now" + temperature + "degree");

    }
}
