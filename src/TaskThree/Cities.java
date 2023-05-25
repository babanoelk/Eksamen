package TaskThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cities {

    private List<City> cities = new ArrayList<>();

    public void add(City city) {
        cities.add(city);
    }

    public City getBiggestCity() {

        if (cities.isEmpty()) {
            return null;
        }

        Collections.sort(cities, (city1, city2) -> city2.getPopulation() - city1.getPopulation());
        return cities.get(0);
    }

    public int getTotalPopulation() {
        int counter = 0;
        for (City c : cities) {
            counter += c.getPopulation();
        }
        return counter;
    }

    public int getAveragePopulation() {
        return getTotalPopulation() / cities.size();
    }
}
