/**
 * @(#)EmpCls.java
 *
 *
 * @ Name: Joselle Nelcia Dinana Niangui 216002982
 * @ Name: Abraham J wiese 210149612
 * @ Group: 1A
 * @version 1.00 2016/10/10
 */


public class EmpCls {
    private String name;
    private String ext;
    private int yearStarted;
    
    public EmpCls()
    {
    	name= null;
    	ext= null;
    	yearStarted=0;
    }
    public void setEmployerDetails(String inName, String inExt, int inYearStarted)
    {
    	name= inName;
    	ext= inExt;
    	yearStarted= inYearStarted;
    }
    public String getName()
    {
    	return name;
    }
    public String getExt()
    {
    	return ext;
    }
    public int getYearStarted()
    {
    	return yearStarted;
    }
    public void displayDetails()
    {
    	System.out.println("Name:" + name);
    	System.out.println("Ext:" + ext);
    	System.out.println("YearStarted:" + yearStarted);
    }
}
