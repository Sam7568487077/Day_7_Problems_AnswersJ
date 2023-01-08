class TicTacToe01{
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


    void board(){





    }


}





public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe01 t1 = new TicTacToe01();


    }
}
