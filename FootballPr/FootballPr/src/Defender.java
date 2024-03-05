public class Defender extends Player {

    private String position;
    private String place;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Defender(String club, int age, int salary, int contract, String position, String place) {
        super(club, age, salary, contract);
        this.position = position;
        this.place = place;
    }

    public String PrintInfo() {
        return("\nCurrent club: " + getClub() + "\nAge: " + getAge() + "\nAnnual salary: " + getSalary() + "\nContract length(years): " + getContract() + "\nThis players position in defensive line is " + getPosition() + "\nThis player prefers to play as a " + getPlace());
    }
}
