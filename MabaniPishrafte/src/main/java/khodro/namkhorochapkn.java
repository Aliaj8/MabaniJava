package khodro;

public class namkhorochapkn {
    Khodro[] khodroha;

    public namkhorochapkn(Khodro[] khodroha) {
        this.khodroha=khodroha;

    }

    public String execute() {
        String namkhodroha = "";
        for (int neshangar=0; neshangar < khodroha.length ;neshangar++){
            Khodro khodro = khodroha[neshangar];
            if (neshangar!=khodroha.length-1){
                namkhodroha=namkhodroha+ khodro.getmark()+"-";
            }
            else {
                namkhodroha=namkhodroha+khodro.getmark();
            }


        }
        return namkhodroha;
    }
}
