import java.util.*;
public class vowel {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String v[] = {"a", "e", "i", "o", "u"};
        String alpha = input.nextLine();
        int detect = 0;
        int i = 0;
        while(i<=4){
            if(alpha.equals(v[i])){
                detect = 1;
            }
            i= i + 1;
        }
        if(detect==1){
            System.out.println("vowel");
        }
        else{
            System.out.println("not vowel");
        }
    }
}
