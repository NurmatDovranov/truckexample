import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonTrukcs {
    public void jsonWriteFileTrucks(String fileNameTrucks) throws IOException {
        JsonArray jsonArray = new JsonArray();

        //Trucks
        JsonObject truck1 = new JsonObject();
        truck1.addProperty("id", 1);
        truck1.addProperty("name", "Renault Magnum");
        truck1.addProperty("driver", " ");
        truck1.addProperty("state", "base");
        jsonArray.add(truck1);


        JsonObject truck2 = new JsonObject();
        truck2.addProperty("id", 2);
        truck2.addProperty("name", "Volvo");
        truck2.addProperty("driver", " ");
        truck2.addProperty("state", "base");
        jsonArray.add(truck2);

        JsonObject truck3 = new JsonObject();
        truck3.addProperty("id", 2);
        truck3.addProperty("name", "DAF XT");
        truck3.addProperty("driver", " ");
        truck3.addProperty("state", "base");
        jsonArray.add(truck3);

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

        try (FileWriter fileWriter = new FileWriter(fileNameTrucks)) {
            fileWriter.write(jsonArray.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
