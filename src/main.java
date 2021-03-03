

//import com.HappyWeb.Main.Main;x

import java.util.Scanner;

public class main {
    private  static int checkParenthesis(String str,char ch)
    {
        int num=0;
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)==ch)
                num++;
        return num;
    }
    public  static  void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
        System.out.println(checkParenthesis(str,'('));

    }
}
