package hashset;
import java.util.*;


public class RemoveDuplicates
{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String str = sc.nextLine();
        HashSet<Character> h1=new HashSet<Character>();
        for(int i=0;i<str.length();i++)
        {
            h1.add(str.charAt(i));
        }
        System.out.println(h1.toString());


    }

}