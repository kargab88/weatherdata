package weather;

public class WeatherDay {

    private int dayNo;
    private int minTemperature;
    private int maxTemperature;

    public WeatherDay(int dayNo, int maxTemperature, int minTemperature) {
        this.dayNo = dayNo;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int getDayNo() {
        return dayNo;
    }
}
