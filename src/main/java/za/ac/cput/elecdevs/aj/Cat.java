/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//**
 *
 * @author AJ
 */
public class Cat {

    private String type;
    private int age;
    
    public Cat(String type, int age)
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

        Cat cat = (Cat) o;

        return age == cat.age;
    }

    @Override
    public int hashCode() {
        return age;
    }
}

