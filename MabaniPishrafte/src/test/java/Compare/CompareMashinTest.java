package Compare;

import khodro.Dande;
import khodro.Mashin;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class CompareMashinTest {
    @Test
    void should_compare_mashin() {
        Mashin bmw_1 = new Mashin("BMW",150, Dande.AUTOMATIC);
        Mashin bmw_2 = new Mashin("BMW",150, Dande.AUTOMATIC);
        Assertions.assertThat(bmw_1.equals(bmw_2)).isTrue();
        Assertions.assertThat(Objects.equals(bmw_1,bmw_2)).isTrue();
    }
}
