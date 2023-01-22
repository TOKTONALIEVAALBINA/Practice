public class Main {
    public static void main(String[] args) {
//        Hen hen = new RussianHen();
//        Hen hen1 = new UkraineHen();
//        if (hen.equals("Russian")) {
//            hen = new RussianHen(100, "Russian");
//            System.out.println(hen);
//        }
//
//
//        if (hen.equals("Ucraine")) {
//            hen = new UkraineHen(150, "Ucraine");
//            System.out.println(hen1);
        Hen [] hen = {new RussianHen(100,"Russia"), new UkraineHen(150,"Ucraine")};
        for(Hen a:hen){
            if (a instanceof RussianHen){
                ((RussianHen)a).toString();
            }else if (a instanceof UkraineHen){
                ((UkraineHen)a).toString();
            }
        }


        }

    }
