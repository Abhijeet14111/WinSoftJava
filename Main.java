import java.util.*;
import java.lang.*;

public class Main
{
    public static void main(String[] args)
    {
        String str = "Abhijeet Sinha";
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                System.out.println("Duplicate character: " + c);
            }
        }
    }
}