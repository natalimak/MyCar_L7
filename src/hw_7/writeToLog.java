package hw_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class writeToLog {
    private static writeToLog instance = null;

    private writeToLog(){}

    public static writeToLog getInstance() {
        if (instance == null) {
            instance = new writeToLog();
        }
        return instance;
    }

    public void WriteUserToFile(String input) throws IOException {
        Files.writeString(Paths.get("log.txt"), input);
        String content = new String(Files.readAllBytes(Paths.get("log.txt")));
        System.out.println("Write only one time to " + content);
    }
}
