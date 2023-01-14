package khodro;

public class Motor extends Khodro {
    public boolean harakat(){
        if (ayaroshanast) {
            return true;
        }
        else {return false;}
    }

    @Override
    public String getmark() {
        return "honda";
    }
}
