import java.util.*;

interface Food{
    public String getType();
}

class Pizza implements Food{
    public String getType()
    {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food{
    public String getType(){
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory{
    public Food getFood(String order){
        if (order.equalsIgnoreCase("Pizza"))
        {
            return new Pizza();
        }
        else if(order.equalsIgnoreCase("Cake"))
        {
            return new Cake();
        }
        
        return null;
    }
}

class Main{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        
        FoodFactory obj=new FoodFactory();
        
        Food food=obj.getFood(scan.nextLine());
        System.out.println("The factory returned "+food.getClass());
        
        System.out.println(food.getType());
        
        scan.close();
    }
}