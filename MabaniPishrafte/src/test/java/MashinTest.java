import khodro.Mashin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MashinTest {
    @Test
    void mashin_bayad_harakat_konad() {
        //given
        Mashin benz = new Mashin("benz");
        Mashin volvo = new Mashin("Volvo");

        //when
        boolean ayaharktmiknd = benz.harakat();
        volvo.roshan();
        boolean ayavolvoharktmiknd = volvo.harakat();


        //then
        Assertions.assertFalse(ayaharktmiknd);
        Assertions.assertTrue(ayavolvoharktmiknd);




    }


}
