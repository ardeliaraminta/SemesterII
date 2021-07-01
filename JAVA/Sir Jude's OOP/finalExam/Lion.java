package finalExam;

public class Lion extends Animal {
    private int poundsMeatPerDay;

    public Lion(String name, int weight, int poundsMeatPerDay) {
        super(name, weight);
        this.poundsMeatPerDay = poundsMeatPerDay;
    }

    public int getPoundsMeatPerDay() {
        return poundsMeatPerDay;
    }

    public void setPoundsMeatPerDay(int poundsMeatPerDay) {
        this.poundsMeatPerDay = poundsMeatPerDay;
    }

    @Override
    public String toString() {
        return "Lion: " + " Name: " + name + '\'' +
                ", Weight:" + weight +
                ", Meat eaten per day: "+ poundsMeatPerDay +
                " pounds";
    }

}
