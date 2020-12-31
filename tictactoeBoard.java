import java.util.*;

public class tictactoeBoard {
  static int A1, A2, A3, B1, B2, B3, C1, C2, C3;

  public TicTacToeBoard() {
		this.reset();
  }
  
  public void reset()
	{
		A1 = 0;
		A2 = 0;
		A3 = 0;
		B1 = 0;
		B2 = 0;
		B3 = 0;
		C1 = 0;
		C2 = 0;
		C3 = 0;
	}


  static void showBoard(){
    System.out.println(" A1 | B1 | C1");
    System.out.println(" ---|----|---");
    System.out.println(" A2 | B2 | C2");
    System.out.println(" ---|----|---");
    System.out.println(" A3 | B3 | C3");
  }

  public int getSquare(String space) {
    switch (space) {
      case "A1":
        return A1;
      case "A2":
        return A2;
      case "A3":
        return A3;
      case "B1":
        return B1;
      case "B2":
        return B2;
      case "B3":
        return B3;
      case "C1":
        return C1;
      case "C2":
        return C2;
      case "C3":
        return C3;
      }
      default:
        System.out.println("Can't do that!");
    }

    public static void computerTurn() {
      Random computerMove = new Random();
      int computerMove = rand.nextInt(9)
      switch (computerMove) {
        case 0:
          return A1;
        case 1:
          return A2;
        case 2:
          return A3;
        case 3:
          return B1;
        case 4:
          return B2;
        case 5:
          return B3;
        case 6:
          return C1;
        case 7:
          return C2;
        case 8:
          return C3;
        }
        default:
            System.out.println("Can't do that!");
      }
    }
  }