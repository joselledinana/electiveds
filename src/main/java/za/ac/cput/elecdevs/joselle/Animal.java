/**
 * @(#)Animal.java
 *
 *
 * @author
 * @version 1.00 2017/11/9
 */

public class Animal {

  private String name;
    private int age;

    public Animal(String nm, int ag)
    {
    	name=nm;
        age=ag;
    }
       public void setAge(int ag){
        age=ag;
    }
    public int getAge(){
        return age;
    }

    public void setName(String nm){
       name=nm;
    }
    public String getName(){
        return name;
    }
     public int hashCode() {
        return age;
    }
    public boolean equals(Object moi) {
        if (this == moi) return true;
        if (moi == null || getClass() != moi.getClass()) return false;

        Animal animal = (Animal) moi;

        return age == animal.age;
    }

}

