import java.util.ArrayList;

public class Intersection {

    private ArrayList<Street> entryPoints;
    private ArrayList<Street> exitPoints;
    private int id;
    private static ArrayList<Intersection> intersections;

    public Intersection(int id, Street street, String connectionSpot) {

        this.id = id;

        this.addPoint(street, connectionSpot);

    }


    public static Intersection getIntersectionFromId(int id, Street street, String connectionSpot){

        for(Intersection intersection : intersections){

            if(id == intersection.getId()){

                intersection.addPoint(street, connectionSpot);
                return intersection;

            }

        }

        return new Intersection(id, street, connectionSpot);

    }

    public int getId() {
        return id;
    }

    public void addPoint(Street street, String connectionSpot){

        if(connectionSpot.equals("from")){

            exitPoints.add(street);

        } else if(connectionSpot.equals("to")){

            entryPoints.add(street);

        }

    }

    public int getEntryCount(){

        return this.entryPoints.size();

    }

    public int getExitCount(){

        return  this.exitPoints.size();

    }

    public String toString() {
        return "Intersection{" +
                "entryPoints=" + entryPoints +
                ", exitPoints=" + exitPoints +
                ", id=" + id +
                '}';
    }
}
