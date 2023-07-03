package Month06;

import java.util.Scanner;

public class BaekJoon0701_2525 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int cl = sc.nextInt();  //clock

        int tot = h * 60 + m;
        tot = tot + cl;

        int hour = (tot / 60) % 24;
        int min = tot % 60;

        System.out.println(hour + " " + min);

    }   
}
