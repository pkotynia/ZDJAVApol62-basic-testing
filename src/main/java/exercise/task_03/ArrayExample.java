package exercise.task_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Wykorzystując podejście TDD zaimplementuj w klasie ArrayExample metodę:
 *
 * public String[] removeDuplicates(String[] array)
 *
 * Metoda powinna zwrócić nową tablicę bez duplikatów.
 */

public class ArrayExample {

    public String[] removeDuplicates(String[] array) {

        //create result list
        List<String> result = new ArrayList<>();

        //iterate over array and add element to result if not yet present
        for(String item : array){
            if(!result.contains(item)){
                result.add(item);
            }
        }

        //return result converted to array
        return result.toArray(new String[0]);
    }

}
