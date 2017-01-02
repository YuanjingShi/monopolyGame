package hk.edu.polyu.comp.comp2021.monopoly;

/**
 * Created by Isaac on 12/4/16.
 */
public interface IOService {
    /**
     *
     * @return This is a description;
     */
    abstract String readLine();

    /**
     *
     * @param str the str to be printed out
     */
    abstract void printLine(String str);

    /**
     *
     * @param player player;
     * @param msg The state of the game to be displayed
     */
    abstract void printConsole(Player player, String msg);
}
