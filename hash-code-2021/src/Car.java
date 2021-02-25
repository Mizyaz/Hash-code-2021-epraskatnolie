import java.util.ArrayList;

public class Car {

    private int pathNum;
    private ArrayList<Street> path;
    private Street currentStreet;

    public Car(String[] dataArr, ArrayList<Street> streets) {

        ArrayList<Street> path = new ArrayList<>();

        for(int i = 1 ; i < dataArr.length ; ++i) {

            for(Street street : streets){

                if(street.getName().equals(dataArr[i])){

                    path.add(street);

                }

            }

        }

        this.pathNum = Integer.parseInt(dataArr[0]);
        this.path = path;
        this.currentStreet = path.get(0);

    }

    @Override
    public String toString() {
        return "Car{" +
                "pathNum=" + pathNum +
                ", path=" + path +
                ", currentStreet=" + currentStreet +
                '}';
    }
}
