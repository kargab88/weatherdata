package weather;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Path dataFilePath = Paths.get("C:\\practice\\data\\weather.dat");
        DataReader dataReader = new DataReader(dataFilePath);
        List<WeatherDay> weatherDayList = dataReader.read();
        WeatherStatistics statistics = new WeatherStatistics(weatherDayList);
        statistics.calculateSmallestSpread();
        System.out.println(statistics.getSmallesTempSpread().getDayNo());
    }

}
