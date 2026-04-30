import java.util.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Borad borad = new Borad();
        borad.initialize();
        borad.printBorad();

        String Player = "white";

        while (true) {
            System.out.println(Player + " true");

            System.out.println( " from (row col):  ");
            int fr = sc.nextInt();
            int fc = sc.nextInt();

            System.out.println("TO (Row Cols): ");
            int tr = sc.nextInt();
            int tc = sc.nextInt();

            move move = new move(fr, fc, tr ,tc);

            if (borad.movePice(move, Player)) {
                borad.printBorad();
                Player = Player.equals("white")?"black" : "white";
                
            }else{
                System.out.println("Invaild move ");
            }
            
        }

    }
    
}
