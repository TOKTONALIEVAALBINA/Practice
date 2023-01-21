public class Hen {
    private int count;
    private String country;

    public  int getCountOfEggsPerMonth(){
    return count;
    }
    public  String getDescription(){
        return country;

    }
    Hen(){

    }

    public Hen(int count, String country) {
        this.count = count;
        this.country = country;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
