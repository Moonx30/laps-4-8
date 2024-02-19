public class Q5 {

       // لتنفيذ برنامج يستطيع قراءة تعبير بتوطين اللاحقة وإخراج قيمته، يمكن اتباع الخطوات التالية:

       // 1. قم بتعريف فئة جديدة وسمِّها PostfixEvaluator.

       // 2. قم بتنفيذ طريقة رئيسية (main) في فئة PostfixEvaluator.

       // 3. قم بطلب إدخال التعبير المكتوب بتوطين اللاحقة من المستخدم.

        //4. قم بتقسيم التعبير إلى عناصر منفصلة بناءً على المسافات بينها (الأعداد والعمليات).

       // 5. قم بإنشاء كائن من فئة Stack لتتبع الأعداد المؤقتة والنتائج الجزئية.

        //6. لكل عنصر في التعبير:
       // - إذا كان العنصر عددًا أو متغيرًا، قم بإضافته إلى الستاك.
       // - إذا كان العنصر عملية، قم بإزالة أعدادين (أو متغيرين) من الستاك، ثم قم بتنفيذ العملية على الأعداد المزيلة. ثم قم بإضافة الناتج إلى الستاك.

        //7. بعد الانتهاء من العمليات، ستكون النتيجة النهائية متاحة في الستاك. قم بإزالة العنصر الوحيد المتبقي في الستاك للحصول على النتيجة النهائية للتعبير.

       // 8. قم بطباعة النتيجة النهائية.

       // وفيما يلي تنفيذ هذا الألگوريتم في شكل الكود (باستخدام لغة Java كمثال):

       // java
import java.util.Scanner;
import java.util.Stack;

        public class PostfixEvaluator {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a postfix expression: ");
                String expression = scanner.nextLine();
                scanner.close();

                double result = evaluatePostfix(expression);
                System.out.println("Result: " + result);
            }

            public static double evaluatePostfix(String expression) {
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
                } }}

            private static double performOperation(String operator, double operand1, double operand2) {
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


       // في هذا الكود، قمنا بتعريف فئة PostfixEvaluator وتنفيذ الطريقة الرئيسية (main). داخل الطريقة الرئيسية، قمنا بطلب إدخال التعبير المكتوب بتوطين اللاحقة من المستخدم وتخزينه في المتابعة:

        //الطريقة evaluatePostfix تقوم بتقييم التعبير المكتوب بتوطين اللاحقة. تقوم بتقسيم التعبير إلى عناصر منفصلة بناءً على المسافات بينها باستخدام الدالة split(). ثم تقوم بإنشاء كائن من فئة Stack لتتبع الأعداد المؤقتة والنتائج الجزئية.

           // بعد ذلك، تقوم بالمرور على كل عنصر في التعبير، إذا كان العنصر عددًا أو متغيرًا، يتم إضافته إلى الستاك. وإذا كان العنصر عملية، يتم إزالة أعدادين (أو متغيرين) من الستاك، ثم تنفيذ العملية على الأعداد المزيلة، ومن ثم يتم إضافة الناتج إلى الستاك.

           // بعد الانتهاء من العمليات، يتواجد النتيجة النهائية في الستاك. يتم إزالة العنصر الوحيد المتبقي في الستاك للحصول على النتيجة النهائية للتعبير.

       // أخيرًا، يتم طباعة النتيجة النهائية.

      //  على سبيل المثال، إذا تم إدخال التعبير المكتوب بتوطين اللاحقة "5 3 +"، فسيتم تقديره على النحو التالي:

    //1. يتم وضع الأعداد 5 و 3 في الستاك.
       // 2. يتم إزالة العددين 5 و 3 من الستاك، ويتم إجراء العملية الجمع بينهما للحصول على النتيجة 8.
      //  3. يتم وضع النتيجة 8 في الستاك.
       // 4. يتم إزالة العنصر النهائي المتبقي في الستاك، وهو النتيجة 8.
        //5. يتم طباعة النتيجة 8.

       // أتمنى أن يكون هذا واضحًا ومفهومًا! إذا كان لديك أي أسئلة إضافية، فلا تتردد في طرحها.
    }

}
}