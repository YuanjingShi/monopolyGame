package hk.edu.polyu.comp.comp2021.monopoly;

/**
 * Created by Isaac Shi
 */
public class Monopoly {
	private Die die = new Die();
	private Board board;
	private IOService ioservice;

	/**
	 *
	 * @param totalPlayer : This is description
	 * @param aiList : This is description
	 */
	public Monopoly(int totalPlayer, int[] aiList) {
		board = new Board(totalPlayer, aiList);
	}

	/**
	 * This is the main function
	 * @param args : System argument
	 */
	public static void main(String[] args) {
		IOService ioservice = new ConsoleIO();
		if(Integer.parseInt(args[0]) == 0) {
			//IOService ioservice = new ConsoleIO();
		}else{
			ioservice = new StubIO();
		}
		int firstInput = 0;
		while(firstInput != 3) {
			ioservice.printLine("Enter 1 if You want to see the board map");
			ioservice.printLine("Enter 2 if You want to read the instructions");
			ioservice.printLine("Enter 3 if You want to start the game: ");
			firstInput = Integer.parseInt(ioservice.readLine());

			if(firstInput == 1){
				printBoard(ioservice);
			}else if(firstInput == 2){
				printInstruction(ioservice);
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
		Monopoly game = new Monopoly(totalPlayer, aiPlayer);
		game.startGame(ioservice);
	}

	/**
	 *  @param ioservice : This a description
	 *  : This is description
	 */
	public static void printBoard(IOService ioservice){
		ioservice.printLine("Square 1 is GO\n" +
				"Square 2 is CENTRAL\n" +
				"Square 3 is Wan Chai\n" +
				"Square 4 is Tax Square\n" +
				"Square 5 is Stanley\n" +
				"Square 6 is Jail\n" +
				"Square 7 is Shek O\n" +
				"Square 8 is Mong Kok\n" +
				"Square 9 is Chance 1\n" +
				"Square 10 is Tsing Yi\n" +
				"Square 11 is Free Parking\n" +
				"Square 12 is Shatin\n" +
				"Square 13 is Chance 2\n" +
				"Square 14 is Tuen Mun\n" +
				"Square 15 is Tai Po\n" +
				"Square 16 is Go To Jail\n" +
				"Square 17 is Sai Kung\n" +
				"Square 18 is Yuen Long\n" +
				"Square 19 is Chance 3\n" +
				"Square 20 is Tai O);");
	}

	/**
	 * @param ioservice : This a description
	 * print the instruction of this game
	 */
	public static void printInstruction(IOService ioservice){
		ioservice.printLine("1. Players have money and can own property. Each player starts with HKD 1500 and no property.\n" +
				"2. All players start from the first square (“Go”).\n" +
				"3. One at a time, players take a turn: roll the dice and advance their respective tokens clockwise on the board. After reaching square 20 a token moves to square 1 again.\n" +
				"4. Certain squares take effect on the player (see below), when his token passes or lands on the square. In particular, it can change the player’s amount of money.\n" +
				"5. If after taking a turn a player has a negative amount of money, he retires from the game. All his property becomes unowned.\n" +
				"6. A round consists of all players taking their turns once.\n" +
				"7. The game ends either if there is only one player left or after 100 rounds. The winner is the player with the most money after the end of the game. Ties (multiple winners) are possible.");
	}

	/**
	 * @param ioservice : This a description
	 *  Start the game!
	 */
	public void startGame(IOService ioservice) {
		ioservice.printLine("Game start!");
		ioservice.printLine("========");
		while (!isGameEnd() && !board.hasWinner()){
			if(!board.getCurrentPlayer().isBrokeOut()){
				int input = 0;

				if(!board.getCurrentPlayer().getAI()) {
					while (input == 2 || input < 1 || input > 4) {
						ioservice.printLine("1 for continue, 2 for report, 3 for auto and 4 for retire");
						input = Integer.parseInt(ioservice.readLine());

						if (input == 1) {
							break;
						} else if (input == 2) {
							board.getReport(ioservice);
						} else if (input == 3) {
							board.getCurrentPlayer().setAI(true);
						} else if (input == 4) {
							board.getCurrentPlayer().setBrokeOut(true, board);
							ioservice.printLine(board.getCurrentPlayer().getName()+" has quit the game!");
						}
					}
				}
				if(!board.getCurrentPlayer().isBrokeOut()) {
					int face = board.getCurrentPlayer().tossDie(die, ioservice);
					board.movePlayer(board.getCurrentPlayer(), face, ioservice);
				}
			}
			board.nextTurn();
		}
		System.out.println("========");
		if(board.hasWinner()){
			ioservice.printLine(board.getWinner().getName() + " is won by don't brokeout!");


		}else{
			ioservice.printLine(board.getMaxMoneyPlayer().getName() + " is won by have most money!");
		}
		ioservice.printLine("Game over!");
	}

	/**
	 * Is the game finished?
	 * @return : This is description
	 */
	public boolean isGameEnd() {
		for(Player player:board.getPlayers()){
			if(player.getTotalWalk() >= 100) {
				return true;
			}
		}
		return false;
	}
}
