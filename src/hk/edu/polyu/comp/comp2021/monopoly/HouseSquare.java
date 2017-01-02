package hk.edu.polyu.comp.comp2021.monopoly;

import java.util.Random;
/**
 * Created by Isaac on 11/27/16.
 */
public class HouseSquare extends Square {
	private int price;
	private int owner = -1;
	private int rent;

	/**
	 *
	 * @param name : This a description
	 * @param price : This a description
	 * @param rent : This a description
	 */
	public HouseSquare(String name, int price, int rent) {
		super(name);
		this.price = price;
		this.rent = rent;
	}



	@Override
	public void squareMove(Player player, Board board, IOService ioservice) {
		//if player.state = 0
		boolean input2;
		if(owner < 0){
			if(player.getAI()){
				Random rand = new Random();
				input2 = rand.nextBoolean();
			}else {
				ioservice.printConsole(player, player.getName() + ", do you want to buy " + getName() + "? (1 for yes, 2 for no)");
				int temp = Integer.parseInt(ioservice.readLine());
				if(temp == 1)
					input2 = true;
				else
					input2 = false;
			}
			if(input2){
				ioservice.printConsole(player, player.getName() + " buy " + getName() + " for " + price);
				owner = player.getID();
				player.getMoney().substractMoney(price);
			}else{
				ioservice.printConsole(player, player.getName() + " don't want to buy " + getName());
			}
		}else{
			if(owner != player.getID()){
				ioservice.printConsole(player, player.getName() + " lost " + rent + " money to " + board.getPlayer(owner).getName());
				player.getMoney().substractMoney(rent);
				board.getPlayer(owner).getMoney().addMoney(rent);
			}
		}
	}
}
