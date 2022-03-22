package lesson13;

import java.util.Comparator;

public class SortByDiameterFromToComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        //o1 - первая монета
        //o2 - вторая монета

        if(o1.getDiameter() != o2.getDiameter()){
            return Double.compare(o1.getDiameter(), o2.getDiameter());
        }

        if (o1.getYear() != o2.getYear()){
            return o1.getYear() - o2.getYear();
        }

        if (o1.getNominal() != o2.getNominal()){
            return o1.getNominal() - o2.getNominal();

        }



        if (!o1.getMetal().equals(o2.getMetal())){
            return o1.getMetal().compareTo(o2.getMetal());

        }
        return 0;
    }


}
