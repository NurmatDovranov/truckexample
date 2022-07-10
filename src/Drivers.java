public class Drivers {
    private int driverId;
    private String driverName;
    private String driverTruck;

    public Drivers(int driverId, String driverName, String driverTruck) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.driverTruck = driverTruck;

    }
    public Drivers() {
    }

    public int getDriversId() {
        return driverId;
    }

    public void setDriversId(int driversId) {
        this.driverId = driversId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverTruck() {
        return driverTruck;
    }

    public void setDriverTruck(String driverTruck) {
        this.driverTruck = driverTruck;
    }

    @Override
    public String toString() {
        return "Drivers{" +
                "driver_id='" + driverId + '\'' +"driverTruck='"+driverTruck+'\''+
                ", driver_Name='" + driverName + '\'' +
                '}';
    }
    public static Drivers addDrivers(int driverId, String driverName, String driverTruck) {
        Drivers drivers = new Drivers();
        drivers.driverId = driverId;
        drivers.driverName = driverName;
        drivers.driverTruck = driverTruck;
        return drivers;
    }
}
