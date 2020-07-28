import java.util.InputMismatchException;
import java.util.Scanner;

class Functions {

    public static boolean validUserInput()
    { Scanner input = new Scanner(System.in);
        boolean valid = false;
        try
        {
            if (input.hasNextInt())
            {
                System.out.println("Please enter a number:");
                int num1 = input.nextInt();
                System.out.println("Please enter another number:");
                int num2 = input.nextInt();
                valid = true;
            }else
                {
                    System.out.println("Error Please enter a valid number");
                }
        } catch(Exception e)
        {
            System.out.println("Error with number input. Please enter a valid number.");
        }
        return valid;
    }

    // Addition Method
    public static int add(int num1, int num2)
    {
        int answer = num1 + num2;
        return answer;
    }

    // Subtraction Method
    public static int minus(int num1, int num2)
    {
        int answer = num1 - num2;
        return answer;
    }

    // Multiplication Method
    public static int multiply(int num1, int num2)
    {
        int answer = num1 * num2;
        return  answer;
    }

    // Division Method
    public static int divide(int num1, int num2)
    {
        if (num2 != 0)
        {
        int answer = num1 / num2;
        return answer;
        }else
            {
                System.out.println("Cannot divide by zero. Please enter another number:");
                Scanner in = new Scanner(System.in);
                num2 = in.nextInt();
                int answer = num1 / num2;
                return answer;
            }
    }
}

public class Calculator extends Functions {
    public static void main(String[] args) {

        // Initialized constants
        int num1 = 0, num2 = 0, answer = 0;
        char operand;

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        try
        {
            System.out.println("Please enter a number or enter:");
            num1 = input.nextInt();

            System.out.println("Please enter another number:");
            num2 = input.nextInt();

        } catch(Exception e)
        {
            System.out.println("Error with number input. Please enter a valid number.");
            System.exit(0);
        }

            // Prompts the user for input
            System.out.println("Please select an operation you'd like to perform");
            System.out.println("+ - Addition\n(-) - Subtraction\n* - Multiplication\n/ - Division\n");
        System.out.println("Please enter your choice: ");
            operand = input.next().charAt(0);

            // Handles the user's choice of operation
            switch (operand)
            {
                case '+':
                    answer = add(num1, num2);
                    System.out.println("Answer: " + answer);
                    break;
                case '-':
                    answer = minus(num1, num2);
                    System.out.println("Answer: " + answer);
                    break;
                case '*':
                    answer = multiply(num1, num2);
                    System.out.println("Answer: " + answer);
                    break;
                case '/':
                        answer = divide(num1, num2);
                        System.out.println("Answer: " + answer);
                    break;
                default:
                    System.out.println("Sorry, This calculator is not that advanced. Please try again.");
            }
    }
}


