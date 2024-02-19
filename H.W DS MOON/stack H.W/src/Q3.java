 public class Q3 {
     // java
import java.util.Stack;

     public class operations {
         public static double operations(String expression) {
             Stack<Double> stack = new Stack<>();

             String[] elements = expression.split(" ");

             for (String element : elements) {
                 if (isNumeric(element)) {
                     stack.push(Double.parseDouble(element));
                 } else {
                     double operand2 = stack.pop();
                     double operand1 = stack.pop();
                     double result = performOperation(element, operand1, operand2);
                     stack.push(result);
                 }
             }

             return stack.pop();
         }

         private static boolean isNumeric(String str) {
             try {
                 Double.parseDouble(str);
                 return true;
             } catch (NumberFormatException e) {
                 return false;
             }
         }

         private static double operations(String operator, double operand1, double operand2) {
             switch (operator) {
                 case "+":
                     return operand1 + operand2;
                 case "-":
                     return operand1 - operand2;
                 case "*":
                     return operand1 * operand2;
                 case "/":
                     return operand1 / operand2;
                 default:
                     throw new IllegalArgumentException("Invalid operator: " + operator);
             }
         }
     }


 }

}
