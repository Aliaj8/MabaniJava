package khodro;

public class Runnande {
    private String noegavahiname="paye 1";//run time
    private static String nam="ali "; //compile time

    public class gavahiname{

        public void print(){
            System.out.println("class non static !");
            System.out.println(noegavahiname);
            System.out.println(nam);

        }
    }
    public static class staticGovahiname{
        public void print(){
            System.out.println("class static !");
            //System.out.println(noegavahiname);
            System.out.println(nam);
        }

    }
}
