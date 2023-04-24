import khodro.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrintTest {
    @Test
    void Bayad_nam_mashin_ra_chap_kond() {
        //given
        Khodro benz = new Mashin("benz",120, Dande.AUTOMATIC);
        Khodro volvo = new Mashin("volvo",80,Dande.MANUAL);
        Khodro honda = new Motor();
        Khodro kashti= new Kashti();
        Khodro [] khodroha={benz,volvo,honda,kashti};
        namkhorochapkn printnames = new namkhorochapkn(khodroha);

        //when
        String listnames=printnames.execute();
        //then
        Assertions.assertEquals("benz-volvo-honda-kashti",listnames);

    }
}
