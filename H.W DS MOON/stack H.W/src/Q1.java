public class Q1 {
   // {لتنفيذ الطريقة transfer(S, T) التي تقوم بنقل جميع
    // العناصر من الستاك S إلى الستاك T، حيث يتم إدراج العنصر الذي يبدأ في أعلى S أولاً في T
    // ، والعنصر الذي يكون في أسفل S ينتهي في أعلى T، يمكن اتباع الخطوات التالية:

       // 1. تأكد من أن الستاكين S و T غير فارغين.

       // 2. قم بإنشاء مستودع مؤقت TempStack لتخزين العناصر المؤقتة أثناء النقل.

       // 3. استخدم حلقة while لنقل العناصر من S إلى TempStack، وذلك عن طريق إزالة العنصر الأعلى في كل تكرار وإضافته في أعلى TempStack.

       // 4. بعد الانتهاء من نقل العناصر إلى TempStack،
    // استخدم حلقة while أخرى لنقل العناصر من TempStack إلى T، وذلك عن طريق إزالة العنصر الأعلى في كل تكرار وإضافته في أعلى T.

        //5. بعد الانتهاء من نقل العناصر إلى T، يكون النقل قد تم بنجاح.

           //وفيما يلي تنفيذ الخوارزمية في شكل الكود (باستخدام لغة Java كمثال):

       // java
import java.util.Stack;

        public class StackTransfer {
            public static void transfer(Stack<Integer> S, Stack<Integer> T) {
                if (S.isEmpty() || T.isEmpty()) {
                    throw new IllegalArgumentException("Both stacks must not be empty.");
                }

                Stack<Integer> TempStack = new Stack<>();

                while (!S.isEmpty()) {
                    TempStack.push(S.pop());
                }

                while (!TempStack.isEmpty()) {
                    T.push(TempStack.pop());
                }
            }
        }


       // في هذا الكود، قمنا بتعريف فئة StackTransfer وتنفيذ الطريقة transfer() بوضعها كطريقة ثابتة. في الطريقة transfer()، قمنا بتحقيق الشروط المطلوبة حيث يجب ألا تكون الستاكين فارغتين، ثم قمنا بإنشاء مستودع TempStack لتخزين العناصر المؤقتة. في الحلقة الأولى، قمنا بنقل العناصر من S إلى TempStack باستخدام دالة push() لإضافة العنصر في أعلى TempStack ودالة pop() لإزالة العنصر الأعلى في S. ثم في الحلقة الثانية، قمنا بنقل العناصر من TempStack إلى T بنفس الطريقة.

           // باستخدام هذا الكود، يمكنك الآن استخدام طريقة transfer(S, T) لنقل العناصر من ستاك S إلى ستاك T بالترتيب المطلوب.
    }

}
