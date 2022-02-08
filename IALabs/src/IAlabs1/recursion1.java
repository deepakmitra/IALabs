package IAlabs1;

import java.util.Scanner;

public class recursion1 {
    public static long sum(int i)
    {
        long s=0;
        if(i>0)
            return(i + sum(i-1));
        else
            return(0);
    }
     static String rev_string(String st, int length){
        if(length > 0){
            return (st.charAt(length-1) + rev_string(st,length-1));
        }
        else{
            return " ";
        }
    }
    public static void main(String[] args) {
        System.out.println("\n Sum = " + sum(10));
        System.out.println("Enter string here : ");
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(rev_string(st,st.length()));
    }
}
