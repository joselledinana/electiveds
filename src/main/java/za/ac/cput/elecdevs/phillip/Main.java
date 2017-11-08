
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 208108874
 */
public class Main {
   
    public static void main(String[] args) {
        
        Food name1=new Food("pie", "12 October", 30);
        
        Food name2=new Food("samoosa", "10 October", 10);
        
        Food name3=new Food("dohgnut", "9 October", 20);
        
        Food name4=new Food("burger", "3 October", 50);
        
        LinkedList link = new LinkedList();
        link.add(name1);
        link.add(name2);
        link.add(name3);
        
        ArrayList arraylist=new ArrayList();
        arraylist.add(name1);
        arraylist.add(name2);
        arraylist.add(name3);
        
        HashSet hash=new HashSet();
        hash.add(name1);
        hash.add(name2);
        hash.add(name3);
        
        
    }
    
}
