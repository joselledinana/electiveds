/**
 * @(#)RunPerson.java
 *
 *
 * @author
 * @version 1.00 2017/11/9
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class RunPerson {


    public static void main(String[] args){

        LinkedList personList = new LinkedList();
        ArrayList personAr = new ArrayList();
        HashSet personHs= new HashSet();

        Person person364 = new Person ("Ariel", 35);
        Person person789 = new Person ("KataLea", 77);
        Person person785 = new Person ("Aristide", 17);
        Person person456 = new Person ("Henriette", 12);

        personList.add(person364);
        personAr.add(person789);
        personHs.add(person785);
        personHs.add(person456);
    }


}