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

    }
}
