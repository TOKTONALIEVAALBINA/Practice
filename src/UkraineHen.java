public class UkraineHen extends Hen{
    public UkraineHen(int count, String country) {
        super(count, country);
    }
    UkraineHen(){

    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 120;
    }

    @Override
    public String getDescription() {
        return "I am chicken";
    }

    @Override
    public String toString() {
        return getDescription()+ getCountOfEggsPerMonth() + "eggs that i give and i from" + getCountry();
    }
}
