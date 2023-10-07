package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double temperatureFahrenheit = (temperatureCelsius * 9.0 / 5.0) + 32; // Using 9.0 and 5.0 for accurate division
        System.out.println(temperatureFahrenheit);
    }
}
