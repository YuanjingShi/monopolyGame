package hk.edu.polyu.comp.comp2021.monopoly;
import java.util.Scanner;
import java.io.PrintStream;
/**
 * Created by Isaac on 12/4/16.
 */
public class ConsoleIO implements IOService {

    private PrintStream output = new PrintStream(System.out);
    @Override
    public String readLine(){
        Scanner input = new Scanner(System.in);
        String nextLine = input.nextLine();
        return nextLine;
    }
    @Override
    public void printLine(String str) {
        output.println(str);
    }
    @Override
    public void printConsole(Player player, String msg){
        System.out.println("[Turn " + (player.getTotalWalk() + 1) + "] [" + player.getCurrentPosition() + "] [$" + player.getMoney().getMoney() + "] " + msg);
    }

}
