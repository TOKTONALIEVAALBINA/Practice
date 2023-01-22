public class UkraineHen extends Hen{
    public UkraineHen(int count, String country) {
        super(count, country);
    }
    UkraineHen(){

    }

    @Override
    public int getCountOfEggsPerMonth() {
        return super.getCountOfEggsPerMonth();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public String toString() {
        return getDescription()+ getCountOfEggsPerMonth() + "eggs that i give and i from" + getCountry();
    }
}
