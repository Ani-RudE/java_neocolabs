import java.util.*;

class Main{
    public static String NumberConverter (String number, int sBase, int dBase)
    {
        return Integer.toString(Integer.parseInt(number, sBase), dBase);
    }

    public static void main(String[] args)
    {
        // int a, b;
        // NumberConverter number=new NumberConverter();
        Scanner scan=new Scanner(System.in);
        char sBase=scan.nextLine().charAt(0);
        char dBase=scan.nextLine().charAt(0);
        
        String input=scan.nextLine();
        
        if (sBase=='D' || sBase=='d')
            sBase=1;
        else if (sBase=='B' || sBase=='b')
            sBase=2;
        else if (sBase=='O' || sBase=='o')
            sBase=3;
        else if (sBase=='H' || sBase=='h')
            sBase=4;
        
        if (dBase=='D' || dBase=='d')
            dBase=1;
        else if (dBase=='B' || dBase=='b')
            dBase=2;
        else if (dBase=='O' || dBase=='o')
            dBase=3;
        else if (dBase=='H' || dBase=='h')
            dBase=4;
            
        System.out.println(NumberConverter(input, sBase, dBase));
        // System.out.println(ans);
        
        scan.close();
    }
}