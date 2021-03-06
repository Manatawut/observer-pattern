package post;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.logging.FileHandler;

public class BackupService implements Observer{

    private String filename;

    public BackupService(String filename, Subject subject) {
        this.filename = filename;
        subject.addObserver(this);
    }

    @Override
    public void update(String data) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(filename, true);
            PrintWriter out = new PrintWriter(writer);
            out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
