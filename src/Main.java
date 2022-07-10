import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    JsonTrucks jsonTrucks = new JsonTrucks();
    jsonTrucks.jsonWriteFileTrucks("trucks.json");

    JsonDrivers jsonDrivers = new JsonDrivers();
    jsonDrivers.jsonWriteFileDrivers("drivers.json");

    }
}