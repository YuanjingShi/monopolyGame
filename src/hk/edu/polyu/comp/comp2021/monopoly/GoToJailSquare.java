package hk.edu.polyu.comp.comp2021.monopoly;
/**
 * Created by Isaac on 11/27/16.
 */
public class GoToJailSquare extends Square {
	/**
	 *
	 * @param name : This a description
	 */
	public GoToJailSquare(String name) {
		super(name);
	}
	
	@Override
	public void squareMove(Player player, Board board, IOService ioservice) {
		ioservice.printConsole(player, player.getName() + " has landed on Go to Jail Square");
		board.movePlayer(player, -board.getTotalSquare() / 2, false, ioservice);
	}
}
