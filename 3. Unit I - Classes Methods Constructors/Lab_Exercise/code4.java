//Vowel or Consonant
import java.util.*

class Main{
    void alph(char ch)
    {
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            System.out.println(ch+" :vowel");
        else
            System.out.println(ch+" :consonant");
    }
    
    public static void main(String[] args)
    {
        char ch;
        Scanner scan=new Scanner(System.in);
        ch=scan.next().charAt(0);
        Main obj=new Main();
        obj.alph(ch);
        
        scan.close();
    }
}