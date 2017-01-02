package hk.edu.polyu.comp.comp2021.monopoly;
/**
 * Created by Isaac on 11/27/16.
 */
public class GoSquare extends Square {
	/**
	 *  : This a description
	 * @param name : This a description
	 */
	public GoSquare(String name) {
		super(name);
	}
	
	@Override
	public void squareMove(Player player, Board board, IOService ioservice) {
		final int ADDMONEYNO = 1500;
		ioservice.printConsole(player, player.getName() + " is at Go... Giving 1500 money");
		player.getMoney().addMoney(ADDMONEYNO);
	}
}
