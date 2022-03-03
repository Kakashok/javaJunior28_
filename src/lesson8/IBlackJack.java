package lesson8;

public interface IBlackJack {

    void addPlayerToGame(IPlayer player);

    void dealTwoCards();

    void dealRemainingCards();

    void printWinner();


}
