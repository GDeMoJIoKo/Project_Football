public class Player {
    private String club;
    private int age;
    private int salary;
    private int contract;

    public Player(String club, int age, int salary, int contract) {
        this.club = club;
        this.age = age;
        this.salary = salary;
        this.contract = contract;
    }


    public String PrintInfo() {
        return ("\nCurrent club: " + club + "\nAge: " + age + "\nAnnual salary: " + salary + "\nContract length(years): " + contract);
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getContract() {
        return contract;
    }

    public void setContract(int contract) {
        this.contract = contract;
    }
    public double fullcontract() {
        double fcontr = salary * contract;
        return fcontr;
    }
}