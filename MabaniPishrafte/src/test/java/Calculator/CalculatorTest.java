package Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void bayad_do_add_ra_jam_kond() {
        Calculator calculator = new Calculator();
        double add = calculator.getadd(5.3, -2);

        Assertions.assertEquals(3.3,add);
    }
    @Test
    void bayad_do_adad_ra_az_ham_kam_knd() {
        Calculator calculator = new Calculator();
        double sub = calculator.getsub(-1, 2.2);

        Assertions.assertEquals(-3.2,sub);
    }
    @Test
    void bayad_d0_adad_ra_zarb_knd() {
        Calculator calculator = new Calculator();
        double mull = calculator.getmul(-2, -3);
        Assertions.assertEquals(6.0,mull);
    }
    @Test
    void bayad_do_adad_ra_taghsim_knd() {
        Calculator calculator = new Calculator();
        double div = calculator.getdiv(5, 2);
        Assertions.assertEquals(2.5,div);
    }
}
