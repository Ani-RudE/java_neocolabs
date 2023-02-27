//Box Class and a Main Class
import java.util.*

class Box{
    double w, h, d;
}

class Main{
    public static void main(String[] args)
    {
        Box myBox=new Box();
        double vol;
        Scanner scan=new Scanner(System.in);
        myBox.w=scan.nextDouble();
        myBox.h=scan.nextDouble();
        myBox.d=scan.nextDouble();
        
        if (myBox.w>0 && myBox.h>0 && myBox.d>0)
        {
            vol=myBox.w*myBox.h*myBox.d;
            System.out.printf("%.2f", vol);
        }
        else
        {
            System.out.println("Invalid");
        }
        
        scan.close();
    }
}