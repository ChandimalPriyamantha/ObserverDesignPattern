public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Observers
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        CarDisplay carDisplay = new CarDisplay();

        // Register observers
        weatherStation.registerObserver(phoneDisplay);
        weatherStation.registerObserver(carDisplay);

        // Change in temperature will notify observers
        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);

        // Unregister an observer
        weatherStation.removeObserver(phoneDisplay);

        // Change in temperature again
        weatherStation.setTemperature(35);
    }
}
