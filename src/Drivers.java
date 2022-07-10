public class Drivers {
    private String driverId;
    private String driverName;
    private String driverTruck;

    public Drivers(String driverId, String driverName, String driverTruck) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.driverTruck = driverTruck;

    }
    public Drivers() {
    }

    public String getDriversId() {
        return driverId;
    }

    public void setDriversId(String driversId) {
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
    public static Drivers addDrivers(String driverId, String driverName, String driverTruck) {
        Drivers drivers = new Drivers();
        drivers.driverId = driverId;
        drivers.driverName = driverName;
        drivers.driverTruck = driverTruck;
        return drivers;
    }
}
