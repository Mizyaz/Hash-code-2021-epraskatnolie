import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws FileNotFoundException {

        int duration;
        int numOfIntersections;
        int numOfStreets;
        int numOfCars;
        int bonusPoints;

        ArrayList<Street> streets = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Intersection> intersections = new ArrayList<>();

        try {

            String fileName = "a.txt";
            File file = new File(fileName);
            Scanner myReader = new Scanner(file);

            String initialData = myReader.nextLine();

            System.out.println(initialData);

            String[] initialArr = initialData.split(" ");

            duration = Integer.parseInt(initialArr[0]);
            numOfIntersections = Integer.parseInt(initialArr[1]);
            numOfStreets = Integer.parseInt(initialArr[2]);
            numOfCars = Integer.parseInt(initialArr[3]);
            bonusPoints = Integer.parseInt(initialArr[4]);

            int count = 0;

            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                String[] dataArr = data.split(" ");

                if(count < numOfStreets){

                    streets.add(new Street(dataArr));

                } else {

                    cars.add(new Car(dataArr, streets));

                }

                count++;
            }

        } catch (IOException ioException){

            ioException.getStackTrace();

        }



    }

}
