import java.util.Random;
import java.util.Scanner;

class TicTacToe01 {
    char userChoice1;
    char systemChoice1;
    char[] boardSpaces = new char[10];


    TicTacToe01() {

        for (int i = 1; i < boardSpaces.length; i++) {

            boardSpaces[i] = 'N';
        }
        for (int i = 0; i < (boardSpaces.length - 1) / 3; i++) {
            for (int j = 3 * i + 1; j < 3 * i + 1 + 3; j++) {
                System.out.print(boardSpaces[j] + "" + j + "   ");

            }
            System.out.println("\n");
        }

    }

    void show_Board() {

        for (int i = 0; i < (boardSpaces.length - 1) / 3; i++) {
            for (int j = 3 * i + 1; j < 3 * i + 1 + 3; j++) {
                if(boardSpaces[j] == 'N') {
                    System.out.print(boardSpaces[j] + "" + j + "   ");
                }
                else
                {
                    System.out.print(boardSpaces[j] + "" + "   ");
                }

            }
            System.out.println("\n");
        }

    }
    void userChoice() {
        Scanner sc1 = new Scanner(System.in);
        int choice =(int)Math.floor(Math.random() * 10)%2;

        switch (choice) {

            case 0:
                System.out.println("User wins the toss");
                System.out.print("Enter your choice X or O : ");

                userChoice1 = sc1.next().charAt(0);
                if (userChoice1 == 'X') {
                    systemChoice1 = '0';
                } else {
                    systemChoice1 = 'X';
                }
                break;

            case 1:
                System.out.println("System wins the toss");
               systemChoice1 = 'X';
               userChoice1= 'O';
               break;
        }
        System.out.println("The choice of user is :" + userChoice1);
        System.out.println("\n");
        System.out.println("The choice of system is :" + systemChoice1);
        System.out.println("\n");


    }

    void userMove(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the position to move between 1 -9");
        int index = sc1.nextInt();
        if(boardSpaces[index] == 'N') {
            boardSpaces[index] = userChoice1;
            show_Board();
        }
        else
        {
            System.out.println("Can't move");
        };

    }


}


public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe01 t1 = new TicTacToe01();
        t1.userChoice();
        t1.show_Board();
        t1.userMove();



    }
}
