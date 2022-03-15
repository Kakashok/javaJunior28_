package lesson8;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {
    private ArrayList<ICard> hand = new ArrayList<>();
    private boolean canWin = true;

    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    @Override
    public void addCardToHand(ICard card) {
        hand.add(card);
    }

    @Override
    public boolean needMoreCards() {
        System.out.println("Ваши карты: ");
        this.openHand();
        System.out.println("Нужна ли еще карта? (да/нет)");

        Scanner scanner = new Scanner(System.in);
        if (scanner.next().equalsIgnoreCase("да")) {
            return true;
        }
        return false;
    }

    @Override
    public void openHand() {
        for (ICard card : hand) {
            card.open();
        }
    }

    @Override
    public int valuesHand() {
        int summ = 0;
        for (ICard card:hand) {
            summ += card.getValue();

        }
        return summ;
    }

}
