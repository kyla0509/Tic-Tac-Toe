public class tictactoe {

  public static void main(String []args) {
        String playerMove;

        //set up Scanner for player inputs
        Scanner scnr = new Scanner(System.in);

        //welcome messages
        System.out.println("Welcome to Tic-Tac-Toe!");

        // initiaize 2d int array to keep track of input
        int[][] gameBoard = new int[3][3];
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
            gameBoard[i][j] = 0;
          }
        }

        // initialize 2d char array to print out input
        char[][] printGameboard = new char[3][3];
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
            printGameboard[i][j] = '-';
          }
        }

        System.out.println("Here are the spaces you can fill in:");
        showBoard();
        System.out.println("Please enter your move:");  
        String playerMove = scnr.nextLine(); 

      }
}
