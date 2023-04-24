package Collection.set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    @Test
    void should_be_remove_duplication() {
        Set<String> cars = new LinkedHashSet<>();
        cars.add("pride");
        cars.add("toyota");
        cars.add("pride");
        cars.add("benz");


        Set<String> expected = new HashSet<>();
        expected.add("pride");
        expected.add("toyota");
        expected.add("benz");

        Assertions.assertThat(cars).isEqualTo(expected);

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
