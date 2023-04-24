package Compare;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class CompareObjectsTest {
    @Test
    void compare_primitive_type() {
        assertThat(1==1).isTrue();
        assertThat(1.3==1.3).isTrue();
    }

    @Test
    void compare_non_primitive() {
        String nam_1="zahra";
        String nam_2="Zahra";
        assertThat(nam_1.equalsIgnoreCase(nam_2));

        String str=new String("ali");
        String str1="ali";
        assertThat(str.equals(str1)).isTrue();//equals not support null value

        String name="ali";
        String family=null;
        assertThat(Objects.equals(name,family)).isFalse();
    }
}
