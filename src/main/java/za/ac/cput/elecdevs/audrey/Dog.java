package za.ac.cput.elecdevs.audrey;

public class Dog {

    private String type;
    private int age;
    
    public Dog(String type, int age)
    {
        this.age=age;
        this.type=type;
    }
    public String getType(){
        return type;
    }
    public int getAge(){
        return age;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setAge(int age){
        this.age=age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return age == dog.age;
    }

    @Override
    public int hashCode() {
        return age;
    }
}
