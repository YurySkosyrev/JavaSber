package CSVScaner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVScaner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Задача ВС Java Сбер.csv"));

        ArrayList<City> cityArrayList = new ArrayList<>();
        String[] nextCity;
        while (scanner.hasNextLine()){
            nextCity = scanner.nextLine().split(";");
            City city = new City(Integer.parseInt(nextCity[0]), nextCity[1],
                    nextCity[2], nextCity[3], Long.parseLong(nextCity[4]));
            if (nextCity.length == 6) city.setFoundation(nextCity[5]);
            cityArrayList.add(city);
            System.out.println(city);
        }

        for (City city : cityArrayList){
            System.out.println(city);
        }
    }
}
