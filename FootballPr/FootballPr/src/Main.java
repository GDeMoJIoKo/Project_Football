import javax.print.attribute.standard.PrinterInfo;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Attacker player1 = new Attacker("Benfica", 24, 500000, 4, "flank", "finisher");
        Attacker player2 = new Attacker("Liverpool", 28, 450000, 3, "center", "creator");
        Midfielder player3 = new Midfielder("Chelsea", 19, 300000, 6, "defensive", "uncreative");
        Midfielder player4 = new Midfielder("Real Madrid", 34, 350000, 2, "offensive", "creative");
        Defender player5 = new Defender("Barcelona", 17, 200000, 5, "defender", "centre");
        Defender player6 = new Defender("Porto", 35, 150000, 1, "goalkeeper", "sweeper keeper");
        Player player7 = new Player("Dundee United", 26, 75000, 3);
        Player player8 = new Player("Burnley", 20, 50000, 5);
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);


        //   player1.PrintInfo();
        //   player2.PrintInfo();
        //   player3.PrintInfo();
        //   player4.PrintInfo();
        //   player5.PrintInfo();
        //   player6.PrintInfo();
        //   player7.PrintInfo();
        //   player8.PrintInfo();
        String str = " ";
        for (Player i : players) {
            str = str + i.PrintInfo() +"\nHis salary for a full contract is "+i.fullcontract() + "$" + "\n";

        }
        System.out.println(str);
        try {
                FileWriter fw = new FileWriter("Players.txt");
                fw.write(str);
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
