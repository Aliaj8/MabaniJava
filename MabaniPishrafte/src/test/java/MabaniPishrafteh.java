import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MabaniPishrafteh {
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


//        Mashin mashin = new Mashin();
//        mashin.bazkardandar();
//        mashin.bastandar();
//
//        System.out.println("aya dar mahsin baz ast?" + mashin.ayadarmashinbaz);
//        mashin.harakat();
//        System.out.println("---------------------------------------");
//
//        Mashin pride = new Mashin("pride");
//        pride.roshan();
//        pride.bazkardandar();
//        mashin.harakat();

    }

    class Mashin{
        //data or dade
        boolean ayamashinroshan;
        boolean ayadarmashinbaz;
        String mark;

        //constractor
        Mashin(){
            System.out.println("yek mashin bdone dade shakhte shod");
        }

        Mashin(String mark){
            this.mark=mark;
            System.out.println("yek mashin  "+ this.mark+"  sakhte shod");

        }





        //methode
        void roshan(){
            System.out.println("mashin roshan ast!");
            ayamashinroshan=true;
        }
        void khamohs(){
            System.out.println("mashin khamosh ast!");
            ayamashinroshan=false;


        }
        void bazkardandar(){
            System.out.println("dar mashin baz ast");
            ayadarmashinbaz=true;
        }
        void bastandar(){
            System.out.println("dar baste ast");
            ayadarmashinbaz=false;
        }
        // bayad mashin roshan bashad , dar mashin baste bashad
        boolean harakat(){
            if(ayamashinroshan && !ayadarmashinbaz){
                System.out.println("mashin mitavand harakat kond");
                return true;
            }
            else {
                System.out.println("mashin park ast");
                return false;
            }

        }


    }

}
