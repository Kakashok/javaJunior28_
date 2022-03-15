package lesson8;

public class Dealer extends Player implements  IDealer{

    @Override
    public boolean needMoreCards() {
        if(this.valuesHand() < 18){
            return true;
        }
        return false;
    }
}
