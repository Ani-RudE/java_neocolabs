import java.util.*

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic{
    public int divisorSum(int n){
        int sum=0;
        for (int i=1; i<=n; i++)
        {
            if (n%i==0)
            {
                sum+=i;
            }
        }
        
        return sum;
    }
}

class Main{
    public static void main(String[] args)
    {
        MyCalculator calc=new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(calc);
        
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println(calc.divisorSum(num));
        
        scan.close();
    }

    static void ImplementedInterfaceNames(Object obj){
        Class[] theInterfaces=obj.getClass().getInterfaces();
        for (int i=0; i<theInterfaces.length; i++)
        {
            String interfaceName=theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}