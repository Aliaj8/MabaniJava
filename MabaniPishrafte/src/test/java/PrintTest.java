import khodro.Kashti;
import khodro.Khodro;
import khodro.Mashin;
import khodro.Motor;
import khodro.namkhorochapkn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrintTest {
    @Test
    void Bayad_nam_mashin_ra_chap_kond() {
        //given
        Khodro benz = new Mashin("benz",120,"Automatic");
        Khodro volvo = new Mashin("volvo",80,"Dasti");
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
