import java.util.*;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
    }
}

class MyBook extends Book{
    @Override
    void setTitle(String s)
    {
        this.title=s;
    }
}

public class Main{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String title=scan.nextLine();
        MyBook novel=new MyBook();
        novel.setTitle(title);
        System.out.println("The title is: "+novel.getTitle());
        
        scan.close();
    }
}