package khodro;

public class Motor {
    boolean ayaroshanast;

    public void roshan(){
        ayaroshanast=true;
    }
    public void khamohs(){
        ayaroshanast =false;

    }

    public boolean harakat(){
        if (ayaroshanast) {
            return true;
        }
        else {return false;}



    }
}
