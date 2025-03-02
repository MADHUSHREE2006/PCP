import java.util.*;
public class Main {
    public static void main(String[] args) {
        String a = "aaabbbbbccdddaaaa";
        int c = 1;
        String res = "";
        for(int i = 0; i<a.length(); i++){
           if((i+1) < a.length() && a.charAt(i) == a.charAt(i+1))
           {
               c++;
           }
           else{
               res = res + a.charAt(i);
               res = res + c;
               c = 1;
           }
        }
        System.out.println(res);
    }
}
