package khodro;

import khodro.Girbox;
import khodro.Khodro;
import khodro.Runnande;
import khodro.SandoghDar;

import java.util.Objects;

//motor & car is a :vehicle
public class Mashin extends Khodro implements SandoghDar, Girbox {
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

    public Mashin(String mark, int bak, Dande noeDande) {
        this.mark=mark;
        this.bak=bak;


    }

    public void bazkardandar(){
        ayadarmashinbaz=true;
    }
    public void bastandar(){
        ayadarmashinbaz=false;
    }
    public boolean harakat(){
        protectedmethod();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mashin mashin = (Mashin) o;
        return bak == mashin.bak && Objects.equals(mark, mashin.mark) && Objects.equals(noeDande, mashin.noeDande);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, bak, noeDande);
    }
}
