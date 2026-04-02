/*
Name: Taphanatu Sesay
Date: 04/02/2026
Assignment: SDC230 5.2 Final Project
Description: Main class for running calculator application.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int choice = 0;

        while (choice != 11) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Add number to list");
            System.out.println("6. Display list");
            System.out.println("7. Remove number");
            System.out.println("8. Sum");
            System.out.println("9. Average");
            System.out.println("10. Difference");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = input.nextInt();

                switch (choice) {
                    case 1: {
                        System.out.print("Enter first number: ");
                        double num1 = input.nextDouble();
                        System.out.print("Enter second number: ");
                        double num2 = input.nextDouble();
                        System.out.println("Result: " + Calculator.add(num1, num2));
                        break;
                    }

                    case 2: {
                        System.out.print("Enter first number: ");
                        double num1 = input.nextDouble();
                        System.out.print("Enter second number: ");
                        double num2 = input.nextDouble();
                        System.out.println("Result: " + Calculator.subtract(num1, num2));
                        break;
                    }

                    case 3: {
                        System.out.print("Enter first number: ");
                        double num1 = input.nextDouble();
                        System.out.print("Enter second number: ");
                        double num2 = input.nextDouble();
                        System.out.println("Result: " + Calculator.multiply(num1, num2));
                        break;
                    }

                    case 4: {
                        System.out.print("Enter first number: ");
                        double num1 = input.nextDouble();
                        System.out.print("Enter second number: ");
                        double num2 = input.nextDouble();

                        if (num2 == 0) {
                            System.out.println("Error: Cannot divide by zero.");
                        } else {
                            System.out.println("Result: " + Calculator.divide(num1, num2));
                        }
                        break;
                    }

                    case 5: {
                        if (numbers.size() >= 10) {
                            System.out.println("Error: List is full. You can only store up to 10 numbers.");
                        } else {
                            System.out.print("Enter number to add to list: ");
                            int num = input.nextInt();
                            numbers.add(num);
                            System.out.println("Number added successfully.");
                        }
                        break;
                    }

                    case 6: {
                        if (numbers.isEmpty()) {
                            System.out.println("The list is empty.");
                        } else {
                            System.out.println("Numbers in the list: " + numbers);
                        }
                        break;
                    }

                    case 7: {
                        if (numbers.isEmpty()) {
                            System.out.println("The list is empty. Nothing to remove.");
                        } else {
                            System.out.print("Enter number to remove: ");
                            int removeNum = input.nextInt();

                            if (numbers.remove(Integer.valueOf(removeNum))) {
                                System.out.println("Number removed successfully.");
                            } else {
                                System.out.println("Number not found in the list.");
                            }
                        }
                        break;
                    }

                    case 8: {
                        if (numbers.isEmpty()) {
                            System.out.println("The list is empty. Cannot calculate sum.");
                        } else {
                            int sum = 0;
                            for (int n : numbers) {
                                sum += n;
                            }
                            System.out.println("Sum: " + sum);
                        }
                        break;
                    }

                    case 9: {
                        if (numbers.isEmpty()) {
                            System.out.println("The list is empty. Cannot calculate average.");
                        } else {
                            int sum = 0;
                            for (int n : numbers) {
                                sum += n;
                            }
                            double average = (double) sum / numbers.size();
                            System.out.println("Average: " + average);
                        }
                        break;
                    }

                    case 10: {
                        if (numbers.isEmpty()) {
                            System.out.println("The list is empty. Cannot calculate difference.");
                        } else {
                            int difference = numbers.get(0);
                            for (int i = 1; i < numbers.size(); i++) {
                                difference -= numbers.get(i);
                            }
                            System.out.println("Difference: " + difference);
                        }
                        break;
                    }

                    case 11: {
                        System.out.println("Exiting program...");
                        break;
                    }

                    default: {
                        System.out.println("Invalid choice. Please enter a number from 1 to 11.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter numbers only.");
                input.nextLine();
            }
        }

        input.close();
    }
}