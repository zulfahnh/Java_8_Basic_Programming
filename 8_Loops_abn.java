import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            loop(a,b,n);
        }
        in.close();
    }            
    static void loop(int a, int b, int n){
        int jum=a;
        for(int j=0; j<n; j++){
            jum += b * (1<<j);
            System.out.print(jum+" ");
        }
        System.out.println();
    }
}
