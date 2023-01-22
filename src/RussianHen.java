public class RussianHen extends Hen{

    public RussianHen(int count, String country) {
        super(count, country);
    }
    RussianHen(){

    }

    @Override
    public String getDescription() {
      return super.getDescription();
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return super.getCountOfEggsPerMonth();

    }

    @Override
    public String toString() {
        return getDescription()+ getCountOfEggsPerMonth() + "eggs that i give and i from" + getCountry();
    }
}
