import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=String.format("%-15s", sc.next());
                int x=sc.nextInt();
                System.out.format(s1);
                System.out.format("%03d", x);
                System.out.println("");
                
            }
            System.out.println("================================");

    }
}