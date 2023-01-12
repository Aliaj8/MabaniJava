package khodro;

public class Mashin {
    //data or dade
    boolean ayaroshanast;
    boolean ayadarmashinbaz;
    String mark;
    Runnande runnande;

    //constractor
    public Mashin(){
    }
    public Mashin(String mark){
        this.mark=mark;

    }

    //methode
    public void roshan(){
        ayaroshanast =true;
    }
    public void khamohs(){
        ayaroshanast =false;

    }
    public void bazkardandar(){
        ayadarmashinbaz=true;
    }
    public void bastandar(){
        ayadarmashinbaz=false;
    }
    public boolean harakat(){
        if(ayaroshanast && !ayadarmashinbaz){
            return true;
        }
        else {
            return false;
        }

    }

}
