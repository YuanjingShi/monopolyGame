package hk.edu.polyu.comp.comp2021.monopoly;

/**
 * Created by Isaac on 11/27/16.
 */
public class FreeSquare extends Square{
    /**
     *
     * @param name : This a description
     */
    public FreeSquare(String name) {
        super(name);
    }

    @Override
    public void squareMove(Player player, Board board, IOService ioservice) {
        ioservice.printConsole(player, player.getName() + " is at Free Parking square... He/She literally does nothing.");
    }
}
