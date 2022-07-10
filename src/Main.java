import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    JsonTrukcs jsonTrucks = new JsonTrukcs();
    jsonTrucks.jsonWriteFileTrucks("trucks.json");

    JsonDrivers jsonDrivers = new JsonDrivers();
    jsonDrivers.jsonWriteFileDrivers("drivers.json");
    
    }
}