package khodro;
//motor & car is a :vehicle
public class Mashin extends Khodro implements SandoghDar,Girbox{
    //data or dade
    boolean ayadarmashinbaz;
    private String mark;
    private Runnande runnande;
    private int bak;
    String noeDande;

    //constractor
    public Mashin(){
    }
    public Mashin(String mark){
        this.mark=mark;

    }

    public Mashin(String mark, int bak, String noeDande) {
        this.mark=mark;
        this.bak=bak;
        this.noeDande=noeDande;

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

    @Override
    public String getmark() {
        return mark;
    }

    @Override
    public String typedande() {
        return "otuomatic";
    }

    @Override
    public int Gonjayesh() {
        return 100;
    }
}
