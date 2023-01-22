public class RussianHen extends Hen{

    public RussianHen(int count, String country) {
        super(count, country);
    }
    RussianHen(){

    }

    @Override
    public String getDescription() {
      return "I am chicken";
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 100;

    }

    @Override
    public String toString() {
        return getDescription()+ getCountOfEggsPerMonth() + "eggs that i give and i from" + getCountry();
    }
}
