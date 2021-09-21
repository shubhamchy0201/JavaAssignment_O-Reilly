import java.util.Scanner;

public class Chapter6_Project2 {
    public static void main(String[] args) {
        runGame();
    }

    public static void runGame() {
        String winner="";
        boolean xTurn=true;
        int row=0;
        int col=0;
        String[][] gameBoard=new String[3][3];
        initializeGameBoard(gameBoard);
        printCurrentBoard(gameBoard);

        while (winner.equals(""))
        {
            if(xTurn)
            {
                System.out.println("It is X's turn");
            }
            else
            {
                System.out.println("It's 0's turn");
            }
            getUserInput(xTurn,gameBoard);
            System.out.println();

            printCurrentBoard(gameBoard);
            winner=getWinner(gameBoard);
            xTurn=!xTurn;

            if(winner.equals("") && isBoardFull(gameBoard))
            {
               winner="C";
            }

        }//while end

        System.out.println();
        if(winner.equals("C"))
        {
            System.out.println("It was the cat's game!! No winner.");
        }
        else{
            System.out.println("The Winner is  :"+winner);
        }

    }//function runGame end

    private static boolean isBoardFull(String[][] gameBoard) {
        int countFill=0;

        for(int i=0;i<gameBoard.length;i++)
        {
            for(int j=0;j< gameBoard[i].length;j++)
            {
                if(!gameBoard[i][j].equals(" "))
                {
                    countFill++;
                }
            }
        }
        return countFill==9;
    }

    private static void getUserInput(boolean xTurn, String[][] gameBoard) {
        Scanner input=new Scanner(System.in);
        int row1=-1;
        int col1=-1;
        boolean keepAsking=true;
        while (keepAsking)
        {
            System.out.println("Please enter the row then the column each from 0,1,2 seperated by a space");
            row1=input.nextInt();
            col1=input.nextInt();
            input.nextLine();


            if(row1>=0 && row1<=2 && col1>=0 && col1<=2)
            {
                if(!cellAlreadyOccupied(row1,col1,gameBoard))
                {
                    keepAsking=false;
                }
                else
                {
                    System.out.println("That cell is already occupied");
                }
            }//enf if
        }//end while

        if(xTurn)
        {
        gameBoard[row1][col1]="X";
        }
        else
        {
        gameBoard[row1][col1]="0";
        }

    }//end function

    private static boolean cellAlreadyOccupied(int row1, int col1, String[][] gameBoard) {
        return !gameBoard[row1][col1].equals(" ");
    }

    private static String getWinner(String[][] gameBoard) {
        final int ROWS=gameBoard.length;
        final int COLS=gameBoard[0].length;
        //check rows
        for (int i=0;i<ROWS;i++)
        {
            if(!gameBoard[i][0].equals(" ") && gameBoard[i][0].equals(gameBoard[i][1]) && gameBoard[i][1].equals(gameBoard[i][2]))
            {
                return gameBoard[i][0];
            }
        }//end for
        //check cols
        for (int i=0;i<COLS;i++)
        {
            if(!gameBoard[0][i].equals(" ") && gameBoard[0][i].equals(gameBoard[1][i]) && gameBoard[1][i].equals(gameBoard[2][i]))
            {
                return gameBoard[0][i];
            }
        }//end for
        //check diagonally-Upper left to bottom right
        if(!gameBoard[0][0].equals(" ") && gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][2]))
        {
            return gameBoard[0][0];
        }

        //check diagonally-Lower left to upper right
        if(!gameBoard[2][0].equals(" ") && gameBoard[2][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[0][2]))
        {
            return gameBoard[2][0];
        }
        return "";
    }//end function

    private static void printCurrentBoard(String[][] gameBoard) {
        for(int i=0;i<gameBoard.length;i++)
        {
            for(int j=0;j< gameBoard[i].length;j++)
            {
                System.out.print(gameBoard[i][j]);
                if(j<2)
                {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(i<2)
            {
                System.out.print("-------");
            }
            System.out.println();
        }

    }//end function

    private static void initializeGameBoard(String[][] gameBoard) {
        for(int i=0;i<gameBoard.length;i++)
        {
            for(int j=0;j< gameBoard[i].length;j++)
            {
                gameBoard[i][j]=" ";
            }
        }
    }// end initializeGameBoard function
}
