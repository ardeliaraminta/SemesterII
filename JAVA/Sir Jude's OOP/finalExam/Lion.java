package finalExam;

public class Lion extends Animal {
    private int poundsMeatPerDay;

    public Lion(String name, int weight) {
        super(name, weight);
    }

    public int getPoundsMeatPerDay() {
        return poundsMeatPerDay;
    }

    public void setPoundsMeatPerDay(int poundsMeatPerDay) {
        this.poundsMeatPerDay = poundsMeatPerDay;
    }

}
