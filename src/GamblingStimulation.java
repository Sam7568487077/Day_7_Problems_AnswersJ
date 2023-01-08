
class Gambler {

    int initialStake = 100;
    int currentStake=0;
    int bettingAmount = 1;



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
        float fiftyPercentOfTake;
        fiftyPercentOfTake = (initialStake * 50) / 100;
        float difference = Math.abs(currentStake - initialStake);
        return difference == fiftyPercentOfTake;
    }

}
public class GamblingStimulation {

    public static void main(String[] args) {

        Gambler g1 = new Gambler();
        while (!g1.gameResignCondition()) {
            g1.outcomeGenerator();
        }
        System.out.println(" The bet has reached the resign conditon ...so further no play");



    }
}
