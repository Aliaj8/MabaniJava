package khodro;

public abstract class Khodro {
    protected void protectedmethod(){
        System.out.println(" this is a protected mthode");
    }
    protected boolean ayaroshanast;

    public void roshan(){
        ayaroshanast=true;
    }
    public void khamohs(){
        ayaroshanast =false;

    }

    public abstract boolean harakat();

    public abstract String getmark();
}
