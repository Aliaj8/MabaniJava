package Calculator;

import khodro.Dande;
import org.junit.jupiter.api.Test;

public class DandeTest {
    @Test
    void print_values_of_dande() {
        Dande.print();

    }

    @Test
    void print_values_of_dande_in_persion() {
        System.out.println("in persian");
        Dande.printInPersian();
        System.out.println("in French");
        Dande.printInFrench();

    }
}
