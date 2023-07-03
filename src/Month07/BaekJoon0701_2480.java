package Month07;

import java.util.Scanner;

public class BaekJoon0701_2480 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //변수가 모두 다른경우
        if(a!=b && b!=c && c!=a)
        {
            int max=0;    //최대값

            if(a>b)
            {
                if(a>c)
                {max = a;}  //a>b a>c
                else    //a<c  
                {max = c;}  //c>a>b
            }
            else if(b>a)
            {
                if(b>c)
                {max = b;}  //b>a b>c
                else    //b<c
                {max = c;}  //c>b>a
            }
            
            System.out.println(max * 100);
        }

        //같은 변수가 있는 경우
        else
        {
            //모두 같은 변수
            if(a==b && b==c && c==a)    //3개다 같은경우
            {System.out.println(10000 + a*1000);}
            else    //2개 같은경우
            {
                if(a==b || a==c)
                {System.out.println(1000 + a*100);}
                else
                {System.out.println(1000 + b*100);}
            }
        }
    
    }    
}
