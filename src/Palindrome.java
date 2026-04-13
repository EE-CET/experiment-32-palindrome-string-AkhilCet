import java.util.Scanner;
public class Palindrome {
    
       public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);

		String str1;
        StringBuilder rev = new StringBuilder();

		str1 = sc.nextLine();

        for(int i = str1.length() - 1; i >= 0; i--){
            rev.append(str1.charAt(i));
        }
        
        if(str1.equalsIgnoreCase(rev.toString())){
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();

	}
}
