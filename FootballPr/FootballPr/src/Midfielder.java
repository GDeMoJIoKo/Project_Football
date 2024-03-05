public class Midfielder extends Player {
    private String style;
    private String creativity;

    public Midfielder(String club, int age, int salary, int contract, String style, String creativity) {
        super(club, age, salary, contract);
        this.style = style;
        this.creativity = creativity;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getCreativity() {
        return creativity;
    }

    public void setCreativity(String creativity) {
        this.creativity = creativity;
    }

    public String PrintInfo() {
        return("\nCurrent club: " + getClub() + "\nAge: " + getAge() + "\nAnnual salary: " + getSalary() + "\nContract length(years): " + getContract() + "\nThis players playstyle is " + getStyle() + "\nThis player is " + getCreativity());
    }
}
