package TaskThree;

public class Main {

    public static void main(String[] args) {

        City city1 = new City("Kongens Lyngby", 57500);
        City city2 = new City("Ribe", 8257);
        City city3 = new City("Storvorde", 3425);
        City city4 = new City("Tarm", 4010);
        City city5 = new City("Horreby", 305);

        Cities cities = new Cities();

        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);

        System.out.println(cities.getBiggestCity());
        System.out.println(cities.getTotalPopulation());
        System.out.println(cities.getAveragePopulation());
    }
}
