import java.util.Random;
import java.util.Scanner;
class TicTacToe01{
    char userChoice1;
    char systemChoice1;
    char [] boardSpaces = new char[10];


    TicTacToe01(){

        for (int i=1;i<boardSpaces.length;i++)
        {

            boardSpaces[i] = 'N';
        }
        for(int i=0;i < (boardSpaces.length-1)/3;i++)
        {
            for(int j=3*i+1;j<3*i+1+3;j++) {
                System.out.print( boardSpaces[j] + "" + j + "   ");

            }
            System.out.println("\n");
        }

    }


    void userChoice(){
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter your choice X or O : ");

        userChoice1 =sc1.next().charAt(0);
        if(userChoice1 == 'X')
        {
            systemChoice1 = '0';
        }
        else
        {
            systemChoice1 = 'X';
        }
        System.out.println("The choice of user is :" + userChoice1);
        System.out.println("\n");
        System.out.println("The choice of system is :" + systemChoice1);
        System.out.println("\n");






    }


}





public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe01 t1 = new TicTacToe01();
        t1.userChoice();


    }
}
