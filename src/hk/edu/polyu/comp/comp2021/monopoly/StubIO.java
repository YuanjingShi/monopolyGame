package hk.edu.polyu.comp.comp2021.monopoly;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Isaac on 12/4/16.
 */
public class StubIO implements IOService {
    private Queue<String> input = new LinkedList<String>();
    private Queue<String> output = new LinkedList<>();
    /**
     *
     */
    public StubIO(){
        input.add("1");
        input.add("2");
        input.add("3");
        input.add("6");
        input.add("1234");
        input.add("1");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("2");
        input.add("1");
        input.add("1");
        input.add("2");
        input.add("1");
        input.add("1");
        input.add("1");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("2");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("2");
        input.add("1");
        input.add("1");
        input.add("2");
        input.add("1");
        input.add("1");
        input.add("1");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("2");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("2");
        input.add("1");
        input.add("1");
        input.add("2");
        input.add("1");
        input.add("1");
        input.add("1");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("2");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("4");
        input.add("1");
        input.add("2");
        input.add("1");
        input.add("2");
        input.add("2");
        input.add("1");
        input.add("1");
        input.add("1");
        input.add("2");
        input.add("3");
        input.add("1");
        input.add("2");
        input.add("1");
        input.add("1");
        input.add("4");


    }
    @Override
    public String readLine(){
        String nextLine = input.element();
        input.remove();
        return nextLine;
    }
    @Override
    public void printConsole(Player player, String msg){
        System.out.println("[Turn " + (player.getTotalWalk() + 1) + "] [" + player.getCurrentPosition() + "] [$" + player.getMoney().getMoney() + "] " + msg);
    }
    @Override
    public void printLine(String str){
        output.add(str);
    }

    //public String getoutput(){
    //    return output.peek();
   // }
}
