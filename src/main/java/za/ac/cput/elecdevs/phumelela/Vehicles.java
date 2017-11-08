/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author 212195131
 */
public class Vehicles {

    private String model;
    private int topspeed;
    
    public Vehicles(String model, int topspeed)
    {
        this.topspeed=topspeed;
        this.model=model;
    }
    public String getType(){
        return model;
    }
    public int getAge(){
        return topspeed;
    }
    public void setType(String type){
        this.model=type;
    }
    public void setAge(int age){
        this.topspeed=topspeed;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicles cat = (Vehicles) o;

        return topspeed == cat.topspeed;
    }

    @Override
    public int hashCode() {
        return topspeed;
    }
}
