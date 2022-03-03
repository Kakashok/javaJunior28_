package lesson8;

public interface IPlayer {

    void addCardToHand(ICard card);

    boolean needMoreCards();

    void  openHand();
}
