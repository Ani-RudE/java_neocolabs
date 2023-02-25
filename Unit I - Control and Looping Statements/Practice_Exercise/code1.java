//Ticket Types.

import java.util.*;

class hello{
    public static void main(String[] args)
    {
        char tick;
        Scanner scan=new Scanner(System.in);
        tick=scan.next().charAt(0);
        
        switch(tick)
        {
            case 'E':
            case 'e':
                System.out.println("Early Bird Ticket");
                break;
            case 'D':
            case 'd':
                System.out.println("Discount Ticket");
                break;
            case 'V':
            case 'v':
                System.out.println("VIP Ticket");
                break;
            case 'S':
            case 's':
                System.out.println("Standard Ticket");
                break;
            case 'C':
            case 'c':
                System.out.println("Children Ticket");
                break;
            default:
                System.out.println("Invalid Case!");
        }
        
        scan.close();
    }
}