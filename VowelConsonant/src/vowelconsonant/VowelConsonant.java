
package vowelconsonant;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
        String letter = input.next().toLowerCase();
        
        if(letter.equals("a")||letter.equals("e")||letter.equals("i")||letter.equals("o")||letter.equals("u")){
            System.out.println(letter + " Is a Vowel");
        }else{
             System.out.println(letter + " Is a Consonant");
        }
    }
    
}
