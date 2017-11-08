package za.ac.cput.elecdevs.joselle; /**
 * @(#)MainEmpCls.java
 *
 *
 * @author
 * @version 1.00 2016/9/26
 */
import java.util.*;

public class MainEmpCls {

   static Scanner con= new Scanner(System.in);

    public static void main(String[] args)
    {
       EmpCls myEmpCls = new EmpCls();
       String name;
       String ext;
       int yearStarted;

      myEmpCls.setEmployerDetails("Joselle","x500",2016);

      System.out.println(" Name:"+name);
      System.out.println(" Ext:" +ext);
      System.out.println(" Year Started:"+ yearStarted);
    }

}
