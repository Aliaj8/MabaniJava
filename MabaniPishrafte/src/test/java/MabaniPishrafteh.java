public class MabaniPishrafteh {
    class Mashin{
        //data or dade
        boolean ayamashinroshan;
        boolean ayadarmashinbaz;
        String mark;
        




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
        void harakat(){
            if(ayamashinroshan && !ayadarmashinbaz){
                System.out.println("mashin mitavand harakat kond");
            }
            else {
                System.out.println("mashin park ast");
            }

        }


    }

}
