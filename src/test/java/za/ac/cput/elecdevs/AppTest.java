package za.ac.cput.elecdevs;


public class Person {

public class Person {

    private String name;
    private int age;

    public Person(String name, int age)
    {
    	this.name=name;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }



    public boolean equals(Object e) {
        if (this == e) return true;
        if (e == null || getClass() != o.getClass()) return false;

        Person per = (Person) o;

        return age == per.age;
    }


    public int hashCode() {
        return age;
    }

}
