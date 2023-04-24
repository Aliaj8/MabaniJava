package Colection.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class ArrayListTest {
    @Test
    void Given_an_array_return_an_List() {
        //given
        int [] arrayNumbers={1,2,3};

        //when
        converter converter = new converter();
        List<Integer> arrayListnumbers=converter.convertToarrylist(arrayNumbers);
        //then
        List<Integer> expectedList = new LinkedList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        Assertions.assertThat(arrayListnumbers).isEqualTo(expectedList);
    }

    @Test
    void sort_list() {
        List<String> animal = new LinkedList<>();
        animal.add("wolf");
        animal.add("cat");
        animal.add("dog");
        animal.add("snake");
        Collections.sort(animal);

        List<String> expected = new LinkedList<>();
        expected.add("cat");
        expected.add("dog");
        expected.add("snake");
        expected.add("wolf");
        Assertions.assertThat(animal).isEqualTo(expected);
    }

    static class converter {
        public List<Integer> convertToarrylist(int[] arrayNumbers) {
            List<Integer> linkedList = new LinkedList<>();
            for (int number : arrayNumbers) {
                linkedList.add(number);
            }
            return linkedList;
        }
    }
}
