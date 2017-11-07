/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
/**
 *
 * @author Appie
 */
public class Main {
    
    public static void main(String[] args){
        
        LinkedList ls = new LinkedList();
        ArrayList al = new ArrayList();
        HashSet hs= new HashSet();
        
        Cat cat1 = new Cat ("Siamese", 5);
        Cat cat2 = new Cat ("Burmese", 7);
        Cat cat3 = new Cat ("Pavement Special", 11);
        Cat cat4 = new Cat ("Norwegian Forest Cat", 12);
        
        ls.add(cat1);
        al.add(cat2);
        hs.add(cat3);
        hs.add(cat4);
    }
    
}
