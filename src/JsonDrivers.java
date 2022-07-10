import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonDrivers {
    public void jsonWriteFileDrivers(String fileNameDrivers) throws IOException {

        JsonArray jsonArray = new JsonArray();

        //Drivers
        JsonObject driver1 = new JsonObject();
        driver1.addProperty("driverId", "driver-1");
        driver1.addProperty("driverName", "Petr");
        driver1.addProperty("driverTruck", " ");
        jsonArray.add(driver1);

        JsonObject driver2 = new JsonObject();
        driver2.addProperty("driverId", "driver-2");
        driver2.addProperty("driverName", "Askar");
        driver2.addProperty("driverTruck", " ");
        jsonArray.add(driver2);

        JsonObject driver3 = new JsonObject();
        driver3.addProperty("driverId", "driver-3");
        driver3.addProperty("driverName", "Uson");
        driver3.addProperty("driverTruck", " ");
        jsonArray.add(driver3);

        try (
                FileWriter fileWriter = new FileWriter(fileNameDrivers)) {
            fileWriter.write(jsonArray.toString());
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
