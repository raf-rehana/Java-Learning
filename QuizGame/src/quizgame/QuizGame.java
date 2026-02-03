
package quizgame;

import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] questions = {"Which of the following is the correct way to declare the main method in Java? ",
                               "Which of these is not a primitive data type in Java? ",
                               "Java supports which of the following features? ",
                               "What keyword is used to call a superclass constructor in Java? ",
                               "Which loop is guaranteed to execute at least once, even if the condition is false? "
                                };
        
        
        
       
        String[][] options ={{"1. public void main(String[] args)", "2. public static void main(String[] args)",
                            "3. static void main(String args)", "4. public main(String[] args)"},
                            {"1. int", "2. boolean", "3. String", "4. double"},
                            {"1. Inheritance", "2. Encapsulation", "3. Polymorphism", "4. All of the above"},
                            {"1. this", "2. super", "3. parent", "4. base"},
                            {"1. for loop", "2. while loop", "3. do-while loop", "4. foreach loop"}
        };

        int[] trueAnswers ={2, 3, 4, 2, 3};
        int score = 0;
        int answer;
        
        System.out.println("*********************Welcome to Java Quiz Game!*********************");
        System.out.println(" ");
        
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            
            for(String option: options[i]){
                System.out.println(option);
                
            }
            System.out.print("Enter Your Answer: ");
            answer = scanner.nextInt();
            
            if(answer == trueAnswers[i]){
                System.out.println("Correct!");
                score++;
            }else{
                System.out.println("Wrong!");
            }
            
        }
        System.out.println("Your Final Score Is: " + score + " out of " + questions.length);
    }
    
}
