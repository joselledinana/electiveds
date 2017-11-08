
/**
** @author 216021987
*/
public class Bicycle {

    private String type;
    private int gear;
    
    public Bicycle(String type, int gear)
    {
        this.gear=gear;
        this.type=type;
    }
    public String getType(){
        return type;
    }
    public int getGear(){
        return age;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setGear(int gear){
        this.gear=gear;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bicycle bike = (bike) o;

        return bike == bicycle.bike;
    }

    @Override
    public int hashCode() {
        return gear;
    }
}
