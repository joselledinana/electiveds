/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 208108874
 */
public class Food {
    
    private String foodName;
    private double price;
    private String orderDate;
    
    
   public  Food(String nm, String date, double pr){ 
    foodName = nm;
    orderDate = date;
    price = pr;
}
   
public String getFoodName(){
    return foodName;

}

public String getOrderdate(){
    return orderDate;

}
    
public void setFoodName(String nm){
    foodName=nm;
}
    
public void setOrderDate(String date){
    orderDate=date;
}

public double getPrice(){
    return price;

}
    
public void setPrice(double pr){
    price=pr;
}
    @Override
    public String toString(){
    String str = "Food Name:"+foodName +"/tOrder Date:"+orderDate+"/tPrice:"+price;
    return str;
}

}