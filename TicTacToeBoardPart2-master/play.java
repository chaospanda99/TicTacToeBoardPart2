

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *Darren D'Silva APCS
 *Shannon Sos 
 *2nd Period
 */
public class play
{
    public static int N;

    public static void main(String[] args)
    {
        try
        {
            System.out.println("Welcome to Tic-Tac-Toe!!! \n By Darren D'Silva" );
            System.out.println();

            //creat markers
            String marker1 = "x";
            String marker2 = "o";
            int playAgain;

            Scanner s = new Scanner(System.in);

            do
            {
                //Determining the size of the board
                N = getBoardSizebs();

                if(N<=0)
                {
                    System.out.println("Size of the board must be greater than '0'!"
                        + "\nPlease enter a valis number for size!!");
                    System.exit(N);
                }
                //run board setup
                boardSize Setup = new boardSize();

                Setup.createBoard();
                Setup.printBoard();

                System.out.println("\nPress the number 3 on your keyboard");
                int level = s.nextInt();
                if(level == 1) { System.out.println("You're SO stupid! I said press 3! Press 1 to restart");  }
                /**   {
                //create player objects
                Human human = new Human();
                Computer computer = new Computer();
                System.out.println("please choose your marker");
                System.out.println("type 1 for 'X' or 2 for 'O'");

                int marker = s.nextInt();
                //set markers
                if(marker == 1)
                {
                // create player objects
                System.out.println("You chose cross 'X'");
                human.setMarker("X");
                computer.setMarker("O");
                } 
                else if(marker == 2)
                {
                System.out.println("You chose Knought 'O'");
                human.setMarker("O");
                computer.setMarker("X");
                }
                else if((marker != 1) && (marker != 2))
                {
                System.out.println("Please choose either '1' or '2'!!");
                System.exit(marker);
                }
                // determine who goes first
                int first = (int) (Math.random() * 2);

                boolean won = false;
                int turns = 0;

                if(first == 0)
                {
                System.out.println("You got to make the first move!");
                if((N == 1) || (N == 2))
                {
                System.out.println("When the board is of size 1X1 or 2X2, "
                + "\n first player wins the game!! "
                + "\nCongratulations!!! You won the game!!");
                System.exit(turns);
                }
                }
                else
                {
                System.out.println("Computer makes the first move!");
                if((N == 1) || (N == 2))
                {
                System.out.println("When the board is of size 1X1 or 2X2, "
                + "\n first player wins the game!! "
                + "\nYou are a loser!! Computer won the game!!");
                System.exit(turns);
                }
                }

                if(first == 0)
                {
                System.out.println();
                while(!won)
                {
                human.takeTurn(Setup.getBoard());
                turns++;
                Setup.printBoard();
                if(Setup.hasWon(Setup.getBoard()))
                {
                won = true;
                System.out.println("Congrats, you won!");
                }
                if(turns == N*N)
                {
                won = true;
                //System.out.println(N*N);
                System.out.println("It's a tie! If you're not first YOU'RE LAST!");
                break;
                }
                if(!won)
                {
                computer.takeTurn(Setup.getBoard(), human);
                turns++;
                System.out.println();
                Setup.printBoard();
                System.out.println();
                if(Setup.hasWon(Setup.getBoard()))
                {
                won = true;
                System.out.println("You just lost a game to a computer."
                + " LOSER! SAD!");
                }
                if(turns == N*N)
                {
                won = true;
                System.out.println("It's a tie! If you're not first YOU'RE LAST!");
                break;
                }
                }   
                }  // close while 1
                }
                else 
                {
                System.out.println();
                while(!won)
                {
                computer.takeTurn(Setup.getBoard(), human);
                turns++;
                Setup.printBoard();
                if(Setup.hasWon(Setup.getBoard()))
                {
                won = true;
                System.out.println("You just lost a game to a computer! "
                + "LOSER! SAD!");
                }

                //checks if maximum moves are made and declares a draw
                if(turns == N*N)
                {
                won = true;
                System.out.println("It's a tie! If you're not first YOU'RE LAST!");
                break;
                }
                if(!won)
                {
                human.takeTurn(Setup.getBoard());
                turns++;
                System.out.println();
                Setup.printBoard();
                System.out.println();
                if(Setup.hasWon(Setup.getBoard()))
                {
                won = true;
                System.out.println("You won the game!");
                }
                if(turns == N*N)
                {
                won = true;
                System.out.println("It's a tie! If you're not first YOU'RE LAST!");
                break;
                }
                }
                }  // close while 2
                }
                } 

                 **/
                else if(level == 2) { System.out.println("You're SO stupid! I said press 3! Press 1 to restart");  }
                /**  {
                //create player objects
                Human human = new Human();
                Computer computer = new Computer();
                System.out.println("Do you want to be X or O?");
                System.out.println("type 1 for 'x' or 2 for 'o'");

                int marker = s.nextInt();
                //set markers
                if(marker == 1)
                {
                // create player objects
                System.out.println("You chose  'X'");
                human.setMarker("X");
                computer.setMarker("O");
                } 
                else if(marker == 2)
                {
                System.out.println("You chose  'O'");
                human.setMarker("O");
                computer.setMarker("X");
                }
                else if((marker != 1) && (marker != 2))
                {
                System.out.println("Can you read? Please choose either '1' or '2'!!");
                System.exit(marker);
                }
                // determine who goes first
                int first = (int) (Math.random() * 2);

                boolean won = false;
                int turns = 0;

                if(first == 0)
                {
                System.out.println("You've got to make the first move!");
                if((N == 1) || (N == 2))
                {
                System.out.println("When the board is of size 1X1 or 2X2, "
                + "\n first player wins the game!! \nYou won the game!!");
                System.exit(turns);
                }
                }
                else
                {
                System.out.println("Computer makes the first move!");
                if((N == 1) || (N == 2))
                {
                System.out.println("When the board is of size 1X1 or 2X2, "
                + "\n first player wins the game!! \nI won the game!!");
                System.exit(turns);
                }
                }

                if(first == 0)
                {
                System.out.println();
                while(!won)
                {
                human.takeTurn(Setup.getBoard());
                turns++;
                Setup.printBoard();
                if(Setup.hasWon(Setup.getBoard()))
                {
                won = true;
                System.out.println("You won!!");
                }
                if(turns == N*N)
                {
                won = true;
                //System.out.println(N*N);
                System.out.println("Its a bore draw!");
                break;
                }
                if(!won)
                {
                computer.takeTurn(Setup.getBoard(), human);
                turns++;
                System.out.println();
                Setup.printBoard();
                System.out.println();
                if(Setup.hasWon(Setup.getBoard()))
                {
                won = true;
                System.out.println("You just lost a game to a computer!"
                + "SAD!");
                }
                if(turns == N*N)
                {
                won = true;
                System.out.println("It's a tie! If you're not first YOU'RE LAST!");
                break;
                }
                }   
                }  // close while 1
                }
                else 
                {
                System.out.println();
                while(!won)
                {
                computer.takeTurn(Setup.getBoard(), human);
                turns++;
                Setup.printBoard();
                if(Setup.hasWon(Setup.getBoard()))
                {
                won = true;
                System.out.println("You just lost a game to a"
                + " computer. SAD!");
                }

                //checks if maximum moves are made and declares a draw
                if(turns == N*N)
                {
                won = true;
                System.out.println("It's a tie! If you're not first YOU'RE LAST!");
                break;
                }
                if(!won)
                {
                human.takeTurn(Setup.getBoard());
                turns++;
                System.out.println();
                Setup.printBoard();
                System.out.println();
                if(Setup.hasWon(Setup.getBoard()))
                {
                won = true;
                System.out.println("You win!");
                }
                if(turns == N*N)
                {
                won = true;
                System.out.println("It's a tie! If you're not first YOU'RE LAST!");
                break;
                }
                }
                }  // close while 2
                }

                } 

                 */
                else if(level == 3)
                {
                    //create player objects
                    Human human = new Human();
                    Computer computer = new Computer();
                    System.out.println("please choose your marker");
                    System.out.println("PRESS THE NUMBER (1) FOR 'x' OR (2) FOR 'o'");

                    int marker = s.nextInt();
                    //set markers
                    if(marker == 1)
                    {
                        // create player objects
                        System.out.println("You chose  'X'");
                        human.setMarker("X");
                        computer.setMarker("O");
                    } 
                    else if(marker == 2)
                    {
                        System.out.println("You chose  'O'");
                        human.setMarker("O");
                        computer.setMarker("X");
                    }
                    else if((marker != 1) && (marker != 2))
                    {
                        System.out.println("Can you read? Please choose either '1' or '2'!!");
                        System.exit(marker);
                    }
                    // determine who goes first
                    int first = (int) (Math.random() * 2);

                    boolean won = false;
                    int turns = 0;

                    if(first == 0)
                    {
                        System.out.println("You've got to make the first move!");
                        if((N == 1) || (N == 2))
                        {
                            System.out.println("When the board is of size 1X1 or 2X2, "
                                + "\n first player wins the game!! \nYou won the game!!");
                            System.exit(turns);
                        }
                    }
                    else
                    {
                        System.out.println("I make the first move!");
                        if((N == 1) || (N == 2))
                        {
                            System.out.println("When the board is of size 1X1 or 2X2, "
                                + "\n first player wins the game!! \nI won the game!!");
                            System.exit(turns);
                        }
                    }

                    if(first == 0)
                    {
                        System.out.println();
                        while(!won)
                        {
                            human.takeTurn(Setup.getBoard());
                            turns++;
                            Setup.printBoard();
                            if(Setup.hasWon(Setup.getBoard()))
                            {
                                won = true;
                                System.out.println("Congrats you won!");
                            }
                            if(turns == N*N)
                            {
                                won = true;
                                //System.out.println(N*N);
                                System.out.println("It's a tie! If you're not first YOU'RE LAST!");
                                break;
                            }
                            if(!won)
                            {
                                computer.takeTurn(Setup.getBoard(), human);
                                turns++;
                                System.out.println();
                                Setup.printBoard();
                                System.out.println();
                                if(Setup.hasWon(Setup.getBoard()))
                                {
                                    won = true;
                                    System.out.println("Rethink you're life descisons because you just lost to a program that was coded by a high schooler in APCS"
                                        + "\nSAD!");
                                }
                                if(turns == N*N)
                                {
                                    won = true;
                                    //System.out.println(N*N);
                                    System.out.println("It's a tie! If you're not first YOU'RE LAST!");
                                    break;
                                }
                            }   
                        }  // close while 1
                    }
                    else 
                    {
                        System.out.println();
                        while(!won)
                        {
                            computer.takeTurn(Setup.getBoard(), human);
                            turns++;
                            Setup.printBoard();
                            if(Setup.hasWon(Setup.getBoard()))
                            {
                                won = true;
                                System.out.println("You just lost a game to an"
                                    + " computer! \n SAD!");
                            }

                            //checks if maximum moves are made and declares a draw
                            if(turns == N*N)
                            {
                                won = true;
                                System.out.println("It's a tie! If you're not first YOU'RE LAST!");
                                break;
                            }
                            if(!won)
                            {
                                human.takeTurn(Setup.getBoard());
                                turns++;
                                System.out.println();
                                Setup.printBoard();
                                System.out.println();
                                if(Setup.hasWon(Setup.getBoard()))
                                {
                                    won = true;
                                    System.out.println("You win!");
                                }
                                if(turns == N*N)
                                {
                                    won = true;
                                    System.out.println("It's a tie! If you're not first YOU'RE LAST!");
                                    break;
                                }
                            }
                        }  // close while 2
                    }
                }// Close of 'hard' level
                else
                {
                    System.out.println("Please enter a valid number for choosing the level! You do know what numbers are right?"
                        + "\nChoose 1 or 2 or 3 only.");
                    System.exit(level);
                }
                System.out.println("Would you like to play again? Type '1' for YES\n"
                    + "Any other input will be considered as a 'NO'!!");
                System.out.println();
                playAgain = s.nextInt();
            }while(playAgain == 1);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid input!! \n ");
        }
    }

    public static int getBoardSizebs()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please choose the size of the board! \n"
            + "Enter 3 for 3X3 board, 4 for 4X4 board, etc..");
        int _boardSize;
        _boardSize = s.nextInt();
        System.out.print("You chose a "+_boardSize+"X"+_boardSize+" board.\n");
        return _boardSize;
    }

    public static int bs()
    {
        return N;
    }
}