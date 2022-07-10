import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonTrucks {
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
        truck3.addProperty("id", 3);
        truck3.addProperty("name", "DAF XT");
        truck3.addProperty("driver", " ");
        truck3.addProperty("state", "base");
        jsonArray.add(truck3);



        try (FileWriter fileWriter = new FileWriter(fileNameTrucks)) {
            fileWriter.write(jsonArray.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
