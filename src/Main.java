public class Main {
    public static void main(String[] args) {
        Hen hen = new RussianHen();
        Hen hen1 = new UkraineHen();
        if (hen.equals("Russian")) {
            hen = new RussianHen(100, "Russian");

        }

        if (hen.equals("Ucraine")) {
            hen = new UkraineHen(150, "Ucraine");
        }
    }
}