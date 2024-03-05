public class Attacker extends Player {
    private String placing;
    private String finish;

    public Attacker(String club, int age, int salary, int contract, String placing, String finish) {
        super(club, age, salary, contract);
        this.placing = placing;
        this.finish = finish;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String getPlacing() {
        return placing;
    }

    public void setPlacing(String placing) {
        this.placing = placing;
    }

    public String PrintInfo() {
       return("\nCurrent club: " + getClub() + "\nAge: " + getAge() + "\nAnnual salary: " + getSalary() + "\nContract length(years): " + getContract() + "\nThis player plays at " + getPlacing() + "\nThis player is a " + getFinish());
    }
}

