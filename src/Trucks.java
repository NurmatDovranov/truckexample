public class Trucks {
    private int id;
    private String name;
    private String driver;
    private String state;

    public Trucks(int id, String name, String driver, String state) {
        this.id = id;
        this.name = name;
        this.driver = driver;
        this.state = state;
    }

    public Trucks() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", driver='" + driver + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
    public static Trucks addTrucks(int id, String name, String driver, String state) {
        Trucks trucks = new Trucks();
        trucks.id = id;
        trucks.name = name;
        trucks.driver = driver;
        trucks.state = state;
        return trucks;
    }
}
