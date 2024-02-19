public class Q5 {
    //5.	Describe an algorithm for concatenating two singly linked lists L and M,
    // into a single list L′ that contains all the nodes of L followed by all the nodes of M.
    //وصف خوارزميه لربط قائمتين ،مرتبطتين بشكلل افردي l,m في قائمه واحده l تحتوي على جميع عقد l متبوعه بجميع عقد m

   // {بالتأكيد! هنا توجد تنفيذية للخوارزمية التي تم وصفها:

       // java
        public SinglyLinkedList concatenateLists(SinglyLinkedList L, SinglyLinkedList M) {
        if (L.isEmpty()) {
            return M;
        }

        Node x = L.head;

        while (x.next != null) {
            x = x.next;
        }

        x.next = M.head;

        return L;
    }


      //  في هذا التنفيذ، يتم استدعاء الدالة concatenateLists على كائنين من فئة SinglyLinkedList وتمريرهما كوسيطتين L و M.

       // إذا كانت القائمة L فارغة (تحتوي على رأس مقداره null)، فإن الدالة تعيد القائمة M بدون أي تعديل.

       // إذا لم تكن القائمة L فارغة، يتم تعيين المؤشر current على الرأس (head) للقائمة L.

         //   ثم يتم تحريك المؤشر current عبر القائمة L حتى يصل إلى العقدة الأخيرة فيها.

           // عند الوصول إلى العقدة الأخيرة في L، يتم تعيين current.next ليشير إلى رأس القائمة M (head of M)، وبذلك يتم ربط قائمة M بعد قائمة L.

       // ثم يتم تحريك المؤشر current عبر القائمة M حتى يصل إلى العقدة الأخيرة فيها.

        //أخيرًا، يتم تعيين current.next في العقدة الأخيرة في M ليشير إلى القيمة null للإشارة إلى نهاية القائمة المجمعة.

           // تُعيد الدالة L كنتيجة، وهي القائمة المجمعة التي تحتوي على جميع العقد في L تليها جميع العقد في M.

           // أتمنى أن يكون هذا المثال مفيدًا. إذا كان لديك أي أسئلة أخرى، فلا تتردد في طرحها.
    }










}
