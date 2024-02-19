public class Q2 {
   // {لحل سؤالك وتنفيذ طريقة size() في فئة CircularlyLinkedList في لغة الجافا بدون الحفاظ على متغير الحجم كمتغير فردي،
    // يتطلب علينا أن نقوم بتجويف قائمة الارتباط الدائرية بالكامل وعد العناصر فيها. هنا شرح خطوة بخطوة لكيفية القيام بذلك:



        public int size() {
        Node x = tail;
        int count = 0;

        if (x!= null) {
            count = 1;
            x = x.getNext();
        }

        while (x != tail) {
            count++;
            x = x.getNext();
        }

        return count;
    }



        }

    }
