package hk.edu.polyu.comp.comp2021.test;

import hk.edu.polyu.comp.comp2021.monopoly.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Apple on 2016/12/4.
 */
public class MonopolyTest {
    private Monopoly game;

    /**
     * This is the description
     * @throws Exception :This is the description
     */
    @Before
    public void setUp() throws Exception {

    }

    /**
     * This is the description
     * @throws Exception :This is the description
     */
    @Test
    public void main() throws Exception{
        /*
        IOService ioservice = new StubIO();
        int firstInput = 0;
        while(firstInput != 3) {
            ioservice.printLine("Enter 1 if You want to see the board map");
            ioservice.printLine("Enter 2 if You want to read the instructions");
            ioservice.printLine("Enter 3 if You want to start the game: ");
            firstInput = Integer.parseInt(ioservice.readLine());
            //assertEquals("Enter 1 if You want to see the board map",ioservice.getoutput());
            if(firstInput == 1){
                Monopoly.printBoard(ioservice);
            }else if(firstInput == 2){
                Monopoly.printInstruction(ioservice);
            }
        }

        int totalPlayer = 0;

        while (totalPlayer < 2 || totalPlayer > 8){
            ioservice.printLine("Enter the Total Player You want (between 2 and 6): ");
            totalPlayer = Integer.parseInt(ioservice.readLine());
        }

        ioservice.printLine("Enter the AI player number you want(enter 0 if don't want any) : ");
        int	aiInit = Integer.parseInt(ioservice.readLine());
        int[] aiPlayer = {0};
        if(aiInit != 0) {
            String input = Integer.toString(aiInit);
            String[] items = input.split("");
            int[] result = new int[items.length];
            for (int i = 0; i < items.length; i++) {
                try {
                    result[i] = Integer.parseInt(items[i]);
                } catch (NumberFormatException nfe) {
                    ioservice.printLine("Please enter a sequence of numbers for AI players");
                }
            }
            aiPlayer = result;
        }
        //System.out.println(totalPlayer);
        //for(int i = 0; i < aiPlayer.length; i++)
        //	System.out.println(aiPlayer[i]);
        game = new Monopoly(totalPlayer, aiPlayer);
        game.startGame(ioservice);
        */
        Monopoly.main(new String[] {"1"});
    }

    /**
     * This is the description
     * @throws Exception :This is the description
     */
    @Test
    public void printBoardtest() throws Exception {
        IOService ioservice = new StubIO();
        Player player = new Player(1,"Joy");
        player.setPosition(2);
        game.printBoard(ioservice);
        int test = player.getCurrentPosition();
        assertEquals(2,test);
    }

    /**
     * This is the description
     * @throws Exception :This is the description
     */
    @Test
    public void printInstructiontest() throws Exception {
        IOService ioservice = new StubIO();
        Player player = new Player(1,"Joy");
        player.setPosition(2);
        game.printInstruction(ioservice);
        int test = player.getCurrentPosition();
        assertEquals(2,test);
    }
}