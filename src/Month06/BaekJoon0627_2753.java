package Month06;

import java.util.Scanner;

public class BaekJoon0627_2753 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if(year%400==0)                         //400의 배수
        {System.out.println("1");}
        else if(year%4==0 && year%100!=0)       //4의 배수이면서 100의 배수가 아님
        {System.out.println("1");}
        else
        {System.out.println("0");}            //나머지
    }    
}
