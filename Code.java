package Assignment_1;
import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Part1{
    public static int fact(int number) {

        if (number == 1 || number == 0) {
            return 1;
        }

        return number * fact(number - 1);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n"+"-------------Assignment Part-1---------------");
            System.out.println("1)Command line args");
            System.out.println("2)Scanner");
            System.out.println("3)Buffer Reader");
            System.out.println("4)DataInputStream");
            System.out.println("5)Console");
            System.out.println("Enter choice : ");
            String x = scanner.nextLine();
            if (Objects.equals(x,"end"))
                break;
            else
            {
                int y = Integer.parseInt((x));
                if (y <= 5 && y > 0)
                {
                    switch(y)
                    {
                        case 1:
                            for(String i :args)
                            {
                                System.out.println("Factorial for argument "+ i +" : "+fact(Integer.parseInt(i)));
                            }
                            break;
                        case 2:
                            System.out.println("Enter the number : ");
                            int num = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Factorial for input "+ num +" : "+fact(num));
                            break;
                        case 3:
                            InputStreamReader in = new InputStreamReader(System.in);

                            BufferedReader reader = new BufferedReader(in);
                            System.out.println("Enter the number :");
                            String num_2 = reader.readLine();
                            System.out.println("Factorial for input  "+ num_2 +" : "+fact(Integer.parseInt(num_2)));
                            break;
                        case 4:
                            DataInputStream dis = new DataInputStream(System.in);
                            System.out.print("Enter the number : ");
                            String num_3 = dis.readLine();
                            System.out.println("Factorial for input  "+ Integer.parseInt(num_3) +" : "+fact(Integer.parseInt(num_3)));

                            break;
                        default:
                            Console console = System.console();
                            if(console!=null) {
                                String input = console.readLine("Enter the number : ");
                                System.out.println("factorial for input : " + Integer.parseInt(input) + " : " + fact(Integer.parseInt(input)));
                            }
                            else {
                                System.out.println("Null encountered .");
                            }
                            break;
                    }
                }
                else
                    System.out.println(("Enter valid number ."));
            }
        } while (true);
        scanner.close();
    }
}












Calculator 

package Assignment_1;
import java.util.Scanner;
public class Calculator {
    // Addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero!");
            return Double.NaN; // Not a Number
        }
    }

    // Square Root
    public static double squareRoot(double num) {
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Cannot calculate square root of a negative number!");
            return Double.NaN;
        }
    }

    // Power
    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    // Mean
    public static double mean(double[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }

    // Variance
    public static double variance(double[] numbers) {
        if (numbers.length <= 1) {
            System.out.println("Variance requires at least two numbers.");
            return Double.NaN;
        }

        double mean = mean(numbers);
        double sumSquaredDifferences = 0;

        for (double num : numbers) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }

        return sumSquaredDifferences / (numbers.length - 1);
    }
}
package Assignment_1;

import java.util.Objects;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorApp {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double[] numbers;

        do {
            System.out.println("-------------------Calculator-----------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");

            System.out.print("Choose an operation: ");
            String ch;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ch = reader.readLine();

            if (Objects.equals(ch, "end")) {
                break;
            }
            int choice = Integer.parseInt(ch);

            double num1;

            double num2;

            switch (choice) {
                case 1:
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter num2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.add(num1, num2));
                    break;
                case 2:
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter num2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.subtract(num1, num2));
                    break;
                case 3:
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter num2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.multiply(num1, num2));
                    break;
                case 4:
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter num2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.divide(num1, num2));
                    break;
                case 5:
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter num2: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.squareRoot(num1));
                    break;
                case 6:
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    int exponent = scanner.nextInt();
                    System.out.println("Result: " + Calculator.power(num1, exponent));
                    break;
                case 7:

                    System.out.println("Enter numbers (type 'end' to finish): ");
                    numbers = readNumbersFromInput(scanner);
                    System.out.println("Result: " + Calculator.mean(numbers));
                    break;
                case 8:

                    System.out.println("Enter numbers (type 'end' to finish): ");
                    numbers = readNumbersFromInput(scanner);
                    System.out.println("Result: " + Calculator.variance(numbers));
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (true);
        numbers = readNumbersFromInput(scanner);
        System.out.println("Average: " + Calculator.mean(numbers));
        scanner.close();
    }

    private static double[] readNumbersFromInput(Scanner scanner) {
        String input;
        double[] numbers = new double[0];

        while (!(input = scanner.next()).equals("end")) {
            double number;
            try {
                number = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid numbers or 'end' to finish.");
                continue;
            }

            double[] newNumbers = new double[numbers.length + 1];
            System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
            newNumbers[numbers.length] = number;
            numbers = newNumbers;
        }

        return numbers;
    }}
