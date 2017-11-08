/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    
    public static void main(String[] args){
        
        LinkedList ls = new LinkedList();
        ArrayList al = new ArrayList();
        HashSet hs= new HashSet();
        
        Bicycle bike1 = new Bicycle ("BMX", 5);
        Bicycle bike2 = new Bicycle ("Ford", 6);
        Bicycle bike3 = new Bicycle ("Scot", 8);
        Bicycle bike4 = new Bicycle ("PS", 4);
        
        ls.add(bike1);
        al.add(bike2);
        hs.add(bike3);
        hs.add(bike4);
    }
    
}