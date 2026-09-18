// 4. DataStorage.java (Persistence / File I/O)
package tracker.utils;
import tracker.services.ReconManager;
import java.io.*;
import java.util.Map;

public class DataStorage {
    private static final String FILE_NAME = "recon_data.dat";

    public static void save(ReconManager manager) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(manager.getAllTargets());
        } catch (IOException e) {
            System.err.println("Error saving data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static void load(ReconManager manager) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            Map<String, tracker.models.Target> data = (Map<String, tracker.models.Target>) in.readObject();
            for (tracker.models.Target t : data.values()) {
                manager.addTarget(t);
            }
        } catch (FileNotFoundException e) {
            // Normal on first run
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading data: " + e.getMessage());
        }
    }
}
