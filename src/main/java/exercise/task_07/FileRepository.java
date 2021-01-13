package exercise.task_07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileRepository {

    public void createFile(Path filePath) {
        try {
            Files.createFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
