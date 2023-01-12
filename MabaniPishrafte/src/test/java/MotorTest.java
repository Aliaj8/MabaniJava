import khodro.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorTest {
    @Test
    void Motor_bayad_harakat_konad() {
        //given
        Motor motor = new Motor();


        //when
        boolean ayaharktmiknd = motor.harakat();


        //then
        Assertions.assertFalse(ayaharktmiknd);


    }
}
