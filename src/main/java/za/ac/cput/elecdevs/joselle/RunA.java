/**
 * @(#)RunA.java
 *
 *
 * @author
 * @version 1.00 2017/11/9
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class RunA {
//main class

    public static void main(String[] args){

        LinkedList anList = new LinkedList();
        ArrayList anAr = new ArrayList();
        HashSet anHs= new HashSet();

        Animal animal2 = new Animal ("Japhet", 55);
        Animal animal6 = new Animal ("Rowan", 7);
        Animal animal61 = new Animal ("Bod", 187);
        Animal animal11 = new Animal ("Bosky", 11);

        anList.add(animal2);
        anAr.add(animal6);
        anHs.add(animal61);
        anHs.add(animal11);

        System.out.println("Name: "+animal2.getName()+"\tAge: "+animal2.getAge());
        System.out.println("Name: "+animal6.getName()+"\t\tAge: "+animal6.getAge());
        System.out.println("Name: "+animal61.getName()+"\t\tAge: "+animal61.getAge());
        System.out.println("Name: "+animal11.getName()+"\t\tAge: "+animal11.getAge());
    }


}
