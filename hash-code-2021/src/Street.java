public class Street {

    private String name;
    private int from;
    private int to;
    private int length;

    public Street(String[] dataArr){

        this.from = Integer.parseInt(dataArr[0]);
        this.to = Integer.parseInt(dataArr[1]);
        this.name = dataArr[2];
        this.length = Integer.parseInt(dataArr[3]);

        Intersection.getIntersectionFromId(from, this, "from");
        Intersection.getIntersectionFromId(to, this, "to");

    }

    public String getName() {

        return name;

    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                ", from=" + from +
                ", to=" + to +
                ", length=" + length +
                '}';
    }
}
