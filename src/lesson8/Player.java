package lesson8;

public class Player implements IPlayer {
    private ICard[] hand = new ICard[20];


    @Override
    public void addCardToHand(ICard card) {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] == null) {
                hand[i] = card;
                break;
            }

        }
    }

    @Override
    public boolean needMoreCards() {
        return false;
    }

    @Override
    public void openHand() {
        for (int i = 0; i < hand.length; i++) {
            if (hand[i] != null) {
                hand[i].open();
            } else {
                break;
            }

        }

    }
}
