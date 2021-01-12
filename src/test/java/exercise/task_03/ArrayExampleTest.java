package exercise.task_03;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayExampleTest {

    @Test
    void removeDuplicates() {
        //given
        ArrayExample arrayExample = new ArrayExample();
        String[] stringArray = new String[]{"a", "b", "a"};

        //when
        String[] result = arrayExample.removeDuplicates(stringArray);

        //then
        assertThat(result).isEqualTo(new String[]{"a", "b"});
    }

}