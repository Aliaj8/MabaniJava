package Khodro;

import khodro.Runnande;
import org.junit.jupiter.api.Test;

public class RunnandeTest{
    @Test
    void bayad_noe_v_nam_gavahiname_chap_knd() {
        Runnande runnande = new Runnande();
        Runnande.gavahiname gavahiname = runnande.new gavahiname();
        gavahiname.print();
    }


    @Test
    void bayad_nam_ra_chap_knd() {
        Runnande.staticGovahiname staticGovahiname = new Runnande.staticGovahiname();
        staticGovahiname.print();
    }
}




