
package preparationwithraf;


public class PreparationWithRaf {


    public static void main(String[] args) {
        String name = "rafiaah";
//        String names = new StringBuilder(name).reverse().toString();
//                System.out.println(names);
//                
                System.out.println(reverseString(name));
      
    }
      static String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
