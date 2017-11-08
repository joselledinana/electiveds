package za.ac.cput.elecdevs.audrey;

import za.ac.cput.elecdevs.audrey.Dog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
 
public class Main {
    
    public static void main(String[] args){
        
        LinkedList ls = new LinkedList();
        ArrayList al = new ArrayList();
        HashSet hs= new HashSet();
        
        Dog dog1 = new Dog ("Sporty", 5);
        Dog dog2 = new Dog ("Tiger", 7);
        Dog dog3 = new Dog ("Lux", 11);
        Dog dog4 = new Dog ("Socks", 12);
        
        ls.add(dog1);
        al.add(dog2);
        hs.add(dog3);
        hs.add(dog4);
    }
    
}
