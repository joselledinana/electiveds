package za.ac.cput.elecdevs.qasim;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<DVD> dvdLinkedList = new LinkedList<DVD>();
        List<DVD> dvdArrayList = new ArrayList<DVD>();
        Set<DVD> dvdHashSet = new HashSet<DVD>();

        DVD dvd1 = new DVD(1, "Star Wars IV", 121);
        DVD dvd2 = new DVD(2, "Pineapple Express", 112);
        DVD dvd3 = new DVD(3, "Spider Man: Homecoming", 133);

        //Add to the LinkedList
        dvdLinkedList.add(dvd1);
        dvdLinkedList.add(dvd2);
        dvdLinkedList.add(dvd3);

        //Add to ArrayList
        dvdArrayList.add(dvd1);
        dvdArrayList.add(dvd2);
        dvdArrayList.add(dvd3);

        //Add to set
        dvdHashSet.add(dvd1);
        dvdHashSet.add(dvd2);
        dvdHashSet.add(dvd3);
    }
}
