package lesson8;

import java.util.ArrayList;

public class BlackJack implements IBlackJack {
    private Koloda koloda = new Koloda();
    private ArrayList<IPlayer> players = new ArrayList<>();


    @Override
    public void addPlayerToGame(IPlayer player) {
        players.add(player);
    }

    @Override
    public void dealTwoCards() {
        for (IPlayer player : players) {
            player.addCardToHand(koloda.randomCard());
            player.addCardToHand(koloda.randomCard());
        }
    }

    @Override
    public void dealRemainingCards() {
        for (IPlayer player : players) {
            while (player.needMoreCards()) {
                player.addCardToHand(koloda.randomCard());
            }
        }
    }

    @Override
    public void printWinner() {
        // 19  19  23  21
        // 19  19  23  10
        // 29  29  23  23
        // 29  29  13  23

        //выключили всех у кого больше 21
        for (IPlayer player : players) {
            if (player.valuesHand() > 21) {
                player.setCanWin(false);
            }
        }
        // если никого не осталось в игре, печатаем карты крупье
        if (this.countWinners() == 0) {
            System.out.println("--- Выиграл крупье!!! ---");
            for (IPlayer player : players) {
                if (player instanceof Dealer) {
                    player.openHand();
                }
            }
        }
        // 12  17  26  10
        int valueWinner = -1;  // = 12  = 17
        for (IPlayer player: players){
            if(player.isCanWin()){
                if(player.valuesHand() > valueWinner){
                    valueWinner = player.valuesHand();
                }
            }
        }

        for (IPlayer player: players){
            if (player.valuesHand() == valueWinner){
                System.out.println("ПОБЕДИТЕЛЬ");
                player.openHand();
            }
        }
    }


    public int countWinners() {
        int count = 0;
        for (IPlayer player : players) {
            if (player.isCanWin()) {
                count++;
            }
        }
        return count;
    }
}
