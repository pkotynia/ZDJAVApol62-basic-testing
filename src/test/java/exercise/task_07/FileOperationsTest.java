package exercise.task_07;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileOperationsTest {

    @Test
    void shouldCreateFile() {
        //given
        FileRepository fileRepositoryMock = Mockito.mock(FileRepository.class);
        FileOperations fileOperations = new FileOperations(fileRepositoryMock);

        //when
        fileOperations.createFile();

        //assert
        Path path = Paths.get("src\\main\\java\\exercise\\task_07\\file.txt");
        Mockito.verify(fileRepositoryMock).createFile(path);
    }
}