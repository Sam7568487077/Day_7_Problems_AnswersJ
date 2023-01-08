import java.util.Scanner;
class Gambler {

    float initialStake = 100;
    float currentStake=0;
    int bettingAmount = 1;
    float fiftyPercentOfTake;
    float gainAmount=0;
    float lossAmount=0;
    int counter=0;



    Gambler() {
        this.currentStake=this.initialStake;
        System.out.print("The initial stake is : " + initialStake + "\n");
        System.out.print("The betting amount in every game is : " + bettingAmount + "\n");

    }


    public void outcomeGenerator () {

        System.out.println(" ================== YOU ARE PLACING THE BET ==================" + " \n");

        int outcome = (int) Math.floor(Math.random() * 10) % 2;
        switch (outcome){

            case 0:
                System.out.println("You have won the bet");
                System.out.println("\n");
                currentStake=currentStake+bettingAmount;
                break;
            case 1:
                System.out.println("You have lost the bet ");
                System.out.println("\n");
                currentStake=currentStake-bettingAmount;
                break;
        }
        System.out.println("Your current stake is: " + currentStake);


    }

boolean gameResignCondition()

    {

        fiftyPercentOfTake = (initialStake * 50) / 100;
        float difference = Math.abs(currentStake - initialStake);
        return difference == fiftyPercentOfTake;
    }


    void outcomeSave()
    {
       if(currentStake > initialStake)
       {
           gainAmount=gainAmount + (currentStake-initialStake);


       }
       else
       {
          lossAmount=lossAmount + (initialStake-currentStake);

       }
        System.out.println("Total gain amount is:" +gainAmount);
        System.out.println("Total loss amount is:" +lossAmount);
        initialStake = currentStake = 100;
        counter++;
        System.out.println("The number od days you betted: "+counter);

    }
}
public class GamblingStimulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char playagain = 'Y';

        Gambler g1 = new Gambler();

        while (playagain == 'Y' && g1.counter < 20) {
            while (!g1.gameResignCondition()) {
                g1.outcomeGenerator();
            }
            System.out.println(" The bet has reached the resign conditon ...so further no play");
            g1.outcomeSave();
            System.out.println("Enter Y to continue: ");
            playagain = 'Y';
        }




    }
}
