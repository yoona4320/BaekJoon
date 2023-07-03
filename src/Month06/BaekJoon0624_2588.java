package Month06;

import java.util.Scanner;

public class BaekJoon0624_2588
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int three = A*(B%10);           
        int four = A*((B/10)%10);       
        int five = A*(B/100);           
        int six = A*B;

        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
    }
}

//B의 1자리수 : B%10
//B의 10자리수 : (B/10)%10
//B의 100자리수 : B/100