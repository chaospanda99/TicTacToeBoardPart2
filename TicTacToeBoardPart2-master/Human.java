

import java.util.Scanner;
/**
 *Darren D'Silva APCS
 *Shannon Sos 
 *2nd Period
 */

class Human extends player 
{

    public Human()
    {

    }   

    public void takeTurn(String[][] board) 
    {

        Scanner s = new Scanner(System.in);

        boolean turn = true;

        int bs = play.bs();
        while(turn)
        {
            System.out.println("Enter a ROW");
            int row = s.nextInt();
            System.out.println("Enter a COL");
            int col = s.nextInt();
            System.out.print("You entered "+row+" "+col);
            System.out.println();
            if(row<1 || row>bs || col<1 ||col>bs)
            {
                System.out.println("Enter valid numbers for placing the marker!!");
                System.exit(bs);
            }
            if(!"X".equals(board[row - 1][col - 1]) && !"O".equals(board[row - 1][col - 1]))
            {
                board[row - 1][col - 1] = Marker;
                turn = false;
            } // closes if
            else 
            {
                System.out.println("Already Marker here! Please guess again!");
        }
    } // ends while
} // ends method

} // ends class
