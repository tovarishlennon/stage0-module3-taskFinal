package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float fahreheit = (temperatureCelsius * (9f/5f)) + 32f;

        System.out.println(fahreheit);
    }
}
