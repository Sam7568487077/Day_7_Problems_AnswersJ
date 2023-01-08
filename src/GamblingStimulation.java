
class Gambler {

    int stake = 100;
    int bettingAmount = 1;



    Gambler() {
        System.out.print("The initial stake is : " + stake + "\n");
        System.out.print("The betting amount in every game is : " + bettingAmount + "\n");
    }


    public void outcomeGenerator () {

        System.out.println(" ================== YOU ARE PLACING THE BET ==================" + " \n");

        int outcome = (int) Math.floor(Math.random() * 10) % 2;
        switch (outcome){

            case 0:
                System.out.println("You have won the bet");
                System.out.println("\n");
                stake=stake+bettingAmount;
                break;
            case 1:
                System.out.println("You have lost the bet ");
                System.out.println("\n");
                stake=stake-bettingAmount;
                break;
        }
        System.out.println("Your current stake is: " + stake);


    }

}
public class GamblingStimulation {

    public static void main(String[] args) {

        Gambler g1 = new Gambler();
        g1.outcomeGenerator();



    }
}
