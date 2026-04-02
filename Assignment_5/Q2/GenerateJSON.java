import java.io.FileWriter;

public class GenerateJSON {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("data.json");

        for (int i = 0; i < 100000; i++) {
            writer.write("{\"meter_id\":\"M" + i + "\",\"timestamp\":"
                + System.currentTimeMillis() + ",\"usage_kwh\":"
                + Math.random()*10 + "}\n");
        }

        writer.close();
        System.out.println("JSON file created");
    }
}