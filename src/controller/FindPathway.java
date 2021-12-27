package controller;
import model.Player;

// Potential pathways are ‘highlighted’ to show possible moves. Uses recursive backtracking to find all the possible moves for every cell
public class FindPathway {

	// Fields
	private static int playerTurn;
	private static Player[] players;
	private static boolean[][] visited = new boolean[7][7];

	// This method finds the path by checking possible pathways in backend, and
	// updating that information in the frontend
	public static void findPath() {

		playerTurn = LabyrinthController.board.getPlayerTurn();
		players = LabyrinthController.board.getPlayers();

		// Set the initial visit to every cell to false
		for (int i = 0; i < 7; i++) {

			for (int j = 0; j < 7; j++) {
				visited[i][j] = false;
			}
		}

		// Check if path exists and update info
		pathExists(players[playerTurn].getRow(), players[playerTurn].getColumn());

		// Update frontend
		setUpGUI();

	}

	private static void pathExists(int playerRow, int playerCol) {
		
		//Get tile openings information
		boolean[] openings = LabyrinthController.board.getMatrix()[playerRow][playerCol].getOpenings();
		
		//Set the current cell visited as true
		visited[playerRow][playerCol] = true;
		
		//Loop through 4 different directions for every cell
		for (int direction = 0; direction < 4; direction++) {

			// calculate change in rows or columns based on the direction
			int dX = 0;
			int dY = 0;

			//Find the change in x and change in y
			if (direction == 0) {
				dY = -1;
			} else if (direction == 1) {
				dX = 1;
			} else if (direction == 2) {
				dY = 1;
			} else if (direction == 3) {
				dX = -1;
			}

			//Recursively check if there is a pathway
			if (openings[direction] && canPlayerMove(direction, playerRow, playerCol, dX, dY)
					&& !visited[playerRow + dY][playerCol + dX]) {

				if (direction == 0) 
					pathExists(playerRow + dY, playerCol + dX);

				if (direction == 1) 
					pathExists(playerRow + dY, playerCol + dX);

				if (direction == 2) 
					pathExists(playerRow + dY, playerCol + dX);
				

				if (direction == 3) 
					pathExists(playerRow + dY, playerCol + dX);
				
			}
		}

		return;

	}

	//Checks if there is a pathway to the next cell
	private static boolean canPlayerMove(int direction, int row, int col, int dX, int dY) {

		// if player tried to move outside board, return false
		if (col + dX < 0 || row + dY < 0 || row + dY > 6 || col + dX > 6)
			return false;

		return LabyrinthController.board.getMatrix()[row][col].getOpenings()[direction]
				&& LabyrinthController.board.getMatrix()[row + dY][col + dX].getOpenings()[(direction + 2)
						% 4];
	}

	//Sets up the GUI after possible pathways are calculated
	private static void setUpGUI() {

		for (int row = 0; row < 7; row++)

			for (int col = 0; col < 7; col++)

				if (visited[row][col])
					LabyrinthController.gameFrame.getBoardPanel().getPathwayLabels()[row][col].setVisible(true);

		LabyrinthController.isPathwayVisible = true;

		//Update text on button
		LabyrinthController.gameFrame.getShowPathwaysButton().setText("Hide pathways");
	}

	//Disables pathways on frontend if needed
	public static void disablePathways() {

		for (int row = 0; row < 7; row++)

			for (int col = 0; col < 7; col++)

				LabyrinthController.gameFrame.getBoardPanel().getPathwayLabels()[row][col].setVisible(false);

		LabyrinthController.isPathwayVisible = false;
		
		//Update text on button
		LabyrinthController.gameFrame.getShowPathwaysButton().setText("Show pathways");
	}

}
