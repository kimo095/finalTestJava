package finalTestaa;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuestionAnswerProgram {
    public static void main(String[] args) {
        Map<Integer, String> questionMap = new HashMap<>();
        Map<Integer, String> answerMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        
        questionMap.put(1, "What is Java what are its characteristics?");
        questionMap.put(2, "what are the cycles of java?");
        questionMap.put(3, "what are the conditions of java?");
        questionMap.put(4, "what are the methods and what are the classes and objects and what these two elements have in common in java?");
        questionMap.put(5, "what are the three basic rules which are and what is the fourth in java?");

        answerMap.put(1, "Java is a widely used, object-oriented programming language known for "
        		+ "its platform independence, simplicity, and robustness. "
        		+ "It has a clear and familiar syntax, automatic memory management, "
        		+ "and a rich standard library. Java supports object-oriented programming principles,"
        		+ " multithreading, and provides strong security features. It has a large and active "
        		+ "community and is commonly used for enterprise development.");
        answerMap.put(2, "In Java, cycles refer to the control structures that allow you to execute a block "
        		+ "of code repeatedly based on a certain condition or loop: "
        		+ "1- The for loop is used when you know the number"
        		+ " of iterations in advance."
        		+ " It consists of an initialization expression, a condition expression, an update expression, and a "
        		+ "loop body. The loop will continue executing as long as the condition is true "
        		+ "2- while loop: The while loop is used when the number of iterations is not known in advance. "
        		+ "It repeatedly executes a block of code as long as the specified condition is true. The condition is"
        		+ " checked before each iteration."
        		+ "3- do-while loop: The do-while loop is similar to the while loop, but the condition is "
        		+ "checked after the loop body has executed. "
        		+ "This means that the loop body will always execute at least once.");
        answerMap.put(3, "1- if statement: The if statement is used to execute a block of code if a specified "
        		+ "condition is true. It can be followed by an optional else block to execute a different block of "
        		+ "code if the condition is false"
        		+ "2- else if statement: The else if statement allows you to check multiple conditions in sequence. "
        		+ "It is used when you have more than two possible outcomes. The else if statement is placed between"
        		+ " the if and else blocks"
        		+ "3- switch statement: The switch statement allows you to select one of many code blocks to be executed."
        		+ " It evaluates an expression and matches it against multiple case labels. Once a match is found, "
        		+ "the corresponding block of code is executed");
        answerMap.put(4, "    Methods: Methods in Java are blocks of code that perform specific tasks."
        		+ " They are defined within classes and can be called to execute their functionality. "
        		+ "Methods can have parameters (inputs) and return values. They encapsulate behavior and "
        		+ "allow code reuse.\n"
        		+ "\n"
        		+ " Classes: Classes in Java are blueprints or templates for creating objects. "
        		+ "They define the properties (attributes) and behaviors (methods) that objects of that "
        		+ "class will have. Classes act as a blueprint for creating multiple instances of objects.\n"
        		+ "\n"
        		+ "    Objects: Objects are instances of classes. They represent specific entities or "
        		+ "concepts and have their own state (attribute values) and behavior (methods). Objects "
        		+ "are created from classes using the new keyword and can interact with each other by "
        		+ "invoking methods or accessing attributes.\n"
        		+ "\n"
        		+ "Commonalities: Methods, classes, and objects are interconnected in Java:\n"
        		+ "\n"
        		+ "    Methods are defined within classes and encapsulate behavior.\n"
        		+ "    Classes define the structure and behavior of objects.\n"
        		+ "    Objects are instances of classes and can invoke methods defined in their class.\n"
        		+ "\n"
        		+ "In essence, methods enable code to perform specific tasks, classes define the "
        		+ "blueprint for creating objects with shared properties and behaviors, and objects "
        		+ "are the actual instances that interact with each other through method calls and "
        		+ "attribute access.");
        answerMap.put(5, "In Java, there are four fundamental rules that govern the language:\n"
        		+ "\n"
        		+ "    Java is case-sensitive: Java differentiates between uppercase and lowercase letters. "
        		+ "This applies to variables, methods, class names, and other identifiers. For example, myVariable and myvariable are considered different variables in Java.\n"
        		+ "\n"
        		+ "    Java uses a fixed syntax: Java has a specific syntax that must be followed. "
        		+ "It includes rules for declaring variables, defining methods, using control structures, "
        		+ "and more. Deviating from the syntax will result in compilation errors.\n"
        		+ "\n"
        		+ "    Java programs are executed sequentially: Java programs are executed in a "
        		+ "sequential order, statement by statement, from top to bottom. Control structures "
        		+ "such as loops and conditional statements allow for altering the program's flow.\n"
        		+ "\n"
        		+ "    Java is an object-oriented programming language: This is not necessarily "
        		+ "a rule but a fundamental characteristic of Java. Java follows the principles "
        		+ "of object-oriented programming, which involves the use of classes, objects, inheritance, "
        		+ "encapsulation, and polymorphism.\n"
        		+ "\n"
        		+ "Object-oriented programming enables modular and reusable code by organizing data and "
        		+ "behavior into classes and objects. It promotes code readability, reusability, "
        		+ "and maintainability.\n"
        		+ "\n"
        		+ "These rules and characteristics define the core principles and behavior of the "
        		+ "Java programming language.");

        System.out.print("Enter the key or ID of the question: ");
        int questionKey = scanner.nextInt();

     
        String question = questionMap.get(questionKey);
        String answer = answerMap.get(questionKey);

        if (question != null && answer != null) {
            System.out.println("Question: " + question);
            System.out.println("Answer: " + answer);

            System.out.println("Select an option:");
            System.out.println("1. Show answer ");
            System.out.println("2. Edit question");
            System.out.println("3. Edit answer");
            int option = scanner.nextInt();
            scanner.nextLine(); 
            switch (option) {
                case 1:
                    System.out.println("Answer: " + answer);
                    break;
                case 2:
                    System.out.print("Enter the new question: ");
                    String newQuestion = scanner.nextLine();
                    questionMap.put(questionKey, newQuestion);
                    System.out.println("Question updated successfully!");
                    break;
                case 3:
                    System.out.print("Enter the new answer: ");
                    String newAnswer = scanner.nextLine();
                    answerMap.put(questionKey, newAnswer);
                    System.out.println("Answer updated successfully!");
                    break;
                default:
                    System.out.println("Invalid option. No changes made.");
            }

            System.out.println("Updated Question: " + questionMap.get(questionKey));
            System.out.println("Updated Answer: " + answerMap.get(questionKey));
        } else {
            System.out.println("Question not found for the given key or ID.");
        }
    }
}
