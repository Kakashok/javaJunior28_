package lesson8;

public class Main {
    public static void main(String[] args) {
        BlackJack blackJack = new BlackJack();

        Dealer dealer = new Dealer();
        Player player1 = new Player();
        Player player2 = new Player();

        blackJack.addPlayerToGame(dealer);
        blackJack.addPlayerToGame(player1);
        blackJack.addPlayerToGame(player2);

        blackJack.dealTwoCards();
        blackJack.dealRemainingCards();
        blackJack.printWinner();

        Koloda koloda = new Koloda();
        System.out.println(koloda.randomCard());
        System.out.println(koloda.randomCard());
        System.out.println(koloda.randomCard());

        player1.addCardToHand(koloda.randomCard());
        player1.addCardToHand(koloda.randomCard());
        player1.addCardToHand(koloda.randomCard());
        player1.openHand();


    }
}
