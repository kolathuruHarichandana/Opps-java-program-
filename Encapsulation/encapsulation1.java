class WeatherReport {
    private double temperatureCelsius;
    private double temperatureFahrenheit;
    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }
    public double getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }
    public void updateTemperature(double tempCelsius) {
        this.temperatureCelsius = tempCelsius;
        this.temperatureFahrenheit = (tempCelsius * 9 / 5) + 32; 
    }
}
public class W {
    public static void main(String[] args) {
        WeatherReport report = new WeatherReport();
        report.updateTemperature(25); 
        System.out.println("Temperature in Celsius: " + report.getTemperatureCelsius());
        System.out.println("Temperature in Fahrenheit: " + report.getTemperatureFahrenheit()); 
    }
}

