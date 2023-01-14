package khodro;

public abstract class Khodro {
    boolean ayaroshanast;

    public void roshan(){
        ayaroshanast=true;
    }
    public void khamohs(){
        ayaroshanast =false;

    }

    public abstract boolean harakat();

    public abstract String getmark();
}
