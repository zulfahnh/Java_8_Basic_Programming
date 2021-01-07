import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        
        for(int j = 0; j < t; j++) {
            String s = sc.nextLine();
            List<String> types = new ArrayList<String>();
            try {
                long e = Long.parseLong(s);
                types.add("long");
                int d = Integer.parseInt(s);
                types.add("int");
                short c = Short.parseShort(s);
                types.add("short");
                byte b = Byte.parseByte(s);
                types.add("byte");
                if(s.equals("1") || s.equals("0")) types.add("boolean");
            } catch(Exception exc) {
                
            } finally {
                if(types.size() == 0) System.out.println(s+" can't be fitted anywhere.");
                else {
                    System.out.println(s+" can be fitted in:");
                    for(int i = types.size()-1; i >= 0; i--) {
                        System.out.println("* "+types.get(i));
                    }
                }
            }
        }
    }
}