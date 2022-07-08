package weather;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    private final Path dataFilePath;

    public DataReader(Path dataFilePath) {
        this.dataFilePath = dataFilePath;
    }

    public List<WeatherDay> read() {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(dataFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<WeatherDay> weatherDays = new ArrayList<>();
        for (int i = 2; i < lines.size() - 1; i++) {
            weatherDays.add(process(lines.get(i)));
        }
        return weatherDays;
    }

    private WeatherDay process(String line) {
        String[] splittedLine = line.split("[* ]+");
        int dayNo = Integer.parseInt(splittedLine[1]);
        int minTemp = Integer.parseInt(splittedLine[2]);
        int maxTemp = Integer.parseInt(splittedLine[3]);
        return new WeatherDay(dayNo, minTemp, maxTemp);
    }


}
