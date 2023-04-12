//IPL Season and Preity's favourite team.
import java.util.Scanner;

class Main{
     public static void main (String[] args)
     {
          Scanner scan = new Scanner(System.in) ;
          int day = scan.nextInt();
          int month =scan.nextInt();
          String sign="";

          if((day<1) ||(day>31) || (month<1) ||(month>12))
          {
               System.out.print("Invalid Date/Month");
          }
          else
          {
               if (month==1)
               {
                    if (day<20)
                    sign="Capricorn";
               }
               else
               {
                    sign="Aquarius";
               } 
               if (month==2)
               {
                    if (day<19)
                    {
                         sign="Aquarius";
                    }
               }
               else
               {
                    sign="Pisces";
               } 
               if (month==3)
               {
                    if (day<21)
                    sign="Pisces";
               }
               else
               {
                    sign="Aries";
               }
               if (month==4)
               {
                    if (day<20)
                    sign="Aries";
               }
               else
               {
                    sign="Taurus";
               }
               if (month==5)
               {
                    if (day<21)
                    {
                         sign = "Taurus";
                    }
               }
               else
               {
                    sign = "Gemini";
               }
               if (month==6)
               {
                    if (day<21)
                    {
                         sign="Gemini";
                    }
               }
               else
               {
                    sign="Cancer";
               }
               if (month == 7)
               {
                    if (day < 23)
                    {
                         sign = "Cancer";
                    }
               }
               else
               {
                    sign = "Leo";
               }
               if( month == 8)
               {
                    if (day < 23)
                    {
                         sign = "Leo";
                    }
               }
               else
               {
                    sign = "Virgo";
               }
               if (month == 9)
               {
                    if (day < 23)
                    {
                         sign = "Virgo";
                    }
               }
               else
               {
                    sign = "Libra";
               }
               if (month == 10)
               {
                    if (day < 23)
                    {
                         sign = "Libra";
                    }
               }
               else
               {
                    sign = "Scorpio";
               } 
               if (month == 11)
               {
                    if (day < 22)
                    sign = "scorpio";
               }
               else
               {
                    sign = "Sagittarius";
               }
               if (month == 12)
               {
                    if (day < 22)
                    sign = "Sagittarius";
               }
               else
               {
                    sign ="Capricorn";
               }

               System.out.print("Astrological sign for " + day + "-" + month + " is " + sign );
          }

          scan.close();
     }
}