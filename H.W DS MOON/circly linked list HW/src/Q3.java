public class Q3 {
   // {لتنفيذ طريقة equals() في فئة CircularlyLinkedList،
    // ونفترض أن قائمتين متساويتين إذا كان لديهما نفس تسلسل العناصر، والعناصر المقابلة تكون حاليًا في بداية القائمة، يلزمنا مقارنة
    // القوائم الاثنتين وتحديد ما إذا كانتا تحتويان على نفس تسلسل العناصر. هنا شرح خطوة بخطوة لكيفية القيام بذلك:

   // 1. قم بتعريف طريقة equals() داخل فئة CircularlyLinkedList.

           // java
        public boolean equals(CircularlyLinkedList<E> other) {
        if (size() != other.size()) {
            return false;  // إذا كانت الأحجام مختلفة، فإن القوائم لا يمكن أن تكون متساوية
        }

        Node currentThis = tail;
        Node currentOther = other.tail;

        do {
            currentThis = currentThis.getNext();
            currentOther = currentOther.getNext();

            if (!currentThis.getElement().equals(currentOther.getElement())) {
                return false;  // إذا كانت العناصر مختلفة، فإن القوائم ليست متساوية
            }
        } while (currentThis != tail);

        return true;  // جميع العناصر متساوية
    }


       // 2. تحقق مما إذا كانت أحجام القوائم المقارنة مختلفة. إذا كانت مختلفة، فهذا يعني أن القوائم لا يمكن أن تكون متساوية، لذا قم بإرجاع false.

           // java
        if (size() != other.size()) {
            return false;
        }


        //3. قم بإنشاء متغيرين، currentThis و currentOther، وقم بتعيينهما للعقدة tail في القوائم المقابلة.

           // java
        Node currentThis = tail;
        Node currentOther = other.tail;


       // 4. استخدم حلقة do-while للتكرار عبر القوائم. تستمر الحلقة حتى يصبح currentThis هو العقدة tail مرة أخرى.

        //java
        do {
            // ...
        } while (currentThis != tail);


        //5. داخل الحلقة، انتقل بالعقدتين currentThis و currentOther إلى العقدتين التاليتين باستخدام طريقة getNext().

           // java
        currentThis = currentThis.getNext();
        currentOther = currentOther.getNext();


        //6. قم بمقارنة العناصر في العقدتين الحاليتين باستخدام طريقة equals()، إذا كانت غير متساوية، فهذا يعني أن القوائم ليست متساوية، لذا قم بإرجاع false.

           // java
        if (!currentThis.getElement().equals(currentOther.getElement())) {
            return false;
        }


        //7. بمجرد انتهاء الحلقة، يعني ذلك أن جميع العناصر المقابلة في القوائم متساوية. قم بإرجاع true للإشارة إلى أن القوائم متساوية.

//```java
        return true;
       //هذا كل شيء! ستقوم طريقة equals() بمقارنة تسلسل العناصر في قائمتين متصلتين دوريًا وتحديد ما إذا كانتا متساويتين.
    }

}
