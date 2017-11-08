package za.ac.cput.elecdevs.phumelela;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import za.ac.cput.elecdevs.phumelela.Vehicles;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
/**
 *
 * @author Phumelela
 */
public class Main {
    
    public static void main(String[] args){
        
        LinkedList ls = new LinkedList();
        ArrayList al = new ArrayList();
        HashSet hs= new HashSet();
        
        Vehicles car1 = new Vehicles ("Nissan", 5);
        Vehicles car2 = new Vehicles ("Sudan", 7);
        Vehicles car3 = new Vehicles ("SUV", 11);
        Vehicles car4 = new Vehicles ("BMW", 12);
        
        ls.add(car1);
        al.add(car2);
        hs.add(car3);
        hs.add(car4);
    }
    
}
