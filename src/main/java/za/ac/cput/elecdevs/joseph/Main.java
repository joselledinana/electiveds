
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Created by Joseph on 08-11-2017
 */
public class Main {



    public static void main(String[] args) {

        LinkedList linkedlist=new LinkedList();

        List arrayList=new ArrayList();

        Set hashSet=new HashSet();

        Person a=new Person();
        a.setFirstName("poulo");
        a.setLastName("Mibatu");

        Person b=new Person();

        b.setFirstName("Joselle");
        b.setLastName("dinana");

        Person c=new Person();

        c.setFirstName("joseph");
        c.setLastName("ngana");

        Person d=new Person();

        d.setFirstName("Qasim");
        d.setLastName("Wentzel");

        Person e=new Person();
        e.setFirstName("Elisa");
        e.setLastName("Ibrahim");

        arrayList.add(b);
        System.out.println("the person is"+arrayList.size());

        linkedlist.add(a);
        System.out.println("the person is"+linkedlist.size());

        hashSet.add(c);
        System.out.println("the person is"+hashSet.size());

        hashSet.add(d);
        System.out.println("the person is"+hashSet.size());
        hashSet.add(e);
        System.out.println("the person is"+hashSet.size());



    }
}
