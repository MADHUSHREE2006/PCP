import java.util.*;
public class Main {
    public static void main(String[] args) {
        String a = "METRO";
        char[] a1 = {'q', 'w', 'e','r', 'y'};
        String b = new String(a1,1,4);
        System.out.println(Arrays.toString(a1));
        System.out.println(b);
    }
}
