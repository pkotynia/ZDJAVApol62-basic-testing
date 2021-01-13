package exercise.task_07;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Napisz program imitujący operacje na pliku.
 *
 * Następnie napisz testy sprawdzające:
 * tworzenie pliku,
 * zapis,
 * odczyt,
 * czyszczenie pliku.
 * Wykorzystaj metody cyklu życia.
 */

public class FileOperations {

    private FileRepository fileRepository;

    public void createFile() {
        Path path = Paths.get("src\\main\\java\\exercise\\task_07\\file.txt");
        //fileRepository.createFile(path);
    }

    public FileOperations(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    public static void main(String[] args) {
        FileOperations fileOperations = new FileOperations(new FileRepository());
        fileOperations.createFile();
    }

}
