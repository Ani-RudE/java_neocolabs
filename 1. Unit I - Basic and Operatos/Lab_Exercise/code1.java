import java.util.*;

class hello{
     public static void main(String[] args){
          String name, type;
          int num;
          char A;
          double exp;
          Scanner scan=new Scanner(System.in);

          name=scan.nextLine();
          type=scan.nextLine();
          num=scan.nextInt();
          A=scan.next().charAt(0);
          exp=scan.nextDouble();

          System.out.println("Event Name : "+name);
          System.out.println("Event Type : "+type);
          System.out.println("Expected Count : "+num);
          System.out.println("Paid Entry : 11 "+A);
          System.out.println("Projected Expense : "+exp+"L");

          scan.close();
     }
}