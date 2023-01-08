import java.util.Scanner;
class Gambler {

    float initialStake = 100;
    float currentStake=0;
    int bettingAmount = 1;
    float fiftyPercentOfTake;
    float gainAmount = 0;
    float lossAmount = 0;
    int counter= 0;
    int daysWon = 0;
    int daysLost = 0;



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
            gainAmount = gainAmount + (currentStake-initialStake);
            daysWon =daysWon + 1;


        }
        else
        {
            lossAmount = lossAmount + (initialStake-currentStake);
            daysLost = daysLost + 1;

        }
        System.out.println("Total gain amount is:" +gainAmount);
        System.out.println("Total loss amount is:" +lossAmount);
        initialStake = currentStake = 100;
        counter++;
        System.out.println("The number of days you betted: "+counter);
        System.out.println("The days you won in a month is :" +daysWon);
        System.out.println("The days you lost in a month is :" +daysLost);

    }

}
public class GamblingStimulation {

    public static void main(String[] args) {

        Gambler g1 = new Gambler();

        Scanner sc = new Scanner(System.in);
        char playagain = 'Y';


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

