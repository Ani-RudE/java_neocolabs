//BO Class
import java.util.*
// import java.io.*;
import java.text.*;
// import java.lang.Math.*;

class ItemType{
    public String name;
    public double deposit;
    public double costPerDay;
    
    // public String getName()
    // {
    //     return name;
    // }
    
    // public void setName(String name)
    // {
    //     this.name=name;
    // }
    
    // public double getDeposit(){
    //     return deposit;
    // }
    
    // public void setDeposit(double deposit)
    // {
    //     this.deposit=deposit;
    // }
    
    // public double getCostPerday()
    // {
    //     return costPerDay;
    // }
    
    // public void setCostPerDay(double costPerDay)
    // {
    //     this.costPerDay=costPerDay;
    // }
    
    public ItemType()
    {
        this.name=null;
        this.deposit=0;
        this.costPerDay=0;
    }
    
    public ItemType(String name, Double deposit, Double costPerDay)
    {
        this.name=name;
        this.deposit=deposit;
        this.costPerDay=costPerDay;
        System.out.println(this.name);
        System.out.println(this.deposit);
        System.out.println(this.costPerDay);
    }
}
    
class ItemTypeBO{
    public Double calculateCost(Date start, Date end, ItemType typeIns)
    {
        long diff=(start.getTime()-end.getTime())/86400000;
        double result=diff*typeIns.costPerDay;
        return result;
    }
}

class Main{
    public static void main(String[] args) throws ParseException{
        ItemType i=new ItemType();
        Scanner scan=new Scanner(System.in);
        DecimalFormat dd=new DecimalFormat("0.0");
        i.name=scan.nextLine();
        i.deposit=Double.parseDouble(scan.nextLine());
        i.costPerDay=Double.parseDouble(scan.nextLine());
        String date1=scan.nextLine();
        String date2=scan.nextLine();
        ItemType i1=new ItemType(i.name, i.deposit, i.costPerDay);
        Date start=new SimpleDateFormat("dd/MM/yyyy").parse(date1);
        Date end=new SimpleDateFormat("dd/MM/yyyy").parse(date2);
        ItemTypeBO iBO=new ItemTypeBO();
        double result=iBO.calculateCost(start, end, i1);
        System.out.println(dd.format(Math.abs(result)));
        
        scan.close();
    }
}