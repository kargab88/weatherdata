package weather;

import java.util.List;

public class WeatherStatistics {

    private WeatherDay smallesTempSpread;

    private final List<WeatherDay> weatherDays;

    public WeatherStatistics(List<WeatherDay> weatherDays) {
        this.weatherDays = weatherDays;
    }

    public WeatherDay getSmallesTempSpread() {
        return smallesTempSpread;
    }

    public void calculateSmallestSpread() {
        int minSpread = Integer.MAX_VALUE;
        WeatherDay minSpreadWeatherDay = null;
        for (WeatherDay weatherDay : weatherDays) {
            int spread = weatherDay.getMaxTemperature() - weatherDay.getMinTemperature();
            if (weatherDay.getMaxTemperature() - weatherDay.getMinTemperature()  < minSpread) {
                minSpread = spread;
                minSpreadWeatherDay = weatherDay;
            }
        }
        this.smallesTempSpread = minSpreadWeatherDay;
    }
}
