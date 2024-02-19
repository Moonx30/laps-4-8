public class Q7 {
   // {لتنفيذ طريقة clone() لفئة DoublyLinkedList، والتي تقوم بإنشاء نسخة مستقلة من القائمة المزدوجة الارتباط الأصلية، يمكن اتباع الخطوات التالية:

      //  1. قم بتعريف فئة جديدة تسمى DoublyLinkedListCloneable وتكون ترث من فئة DoublyLinkedList.

      //  2. في فئة DoublyLinkedListCloneable، قم بتنفيذ طريقة clone() واستبدالها من الفئة الأساسية.

      //  3. في طريقة clone()، قم بإنشاء نسخة جديدة من فئة DoublyLinkedListCloneable.

       // 4. قم بتمرير قيمة كل عنصر في القائمة الأصلية إلى القائمة الجديدة.

       // 5. أعيد القائمة الجديدة كنتيجة من الطريقة clone().

         //   وفيما يلي تنفيذ الخوارزمية في شكل الكود:

       // java
        public class DoublyLinkedListCloneable<E> extends DoublyLinkedList<E> implements Cloneable {
            @Override
            public DoublyLinkedListCloneable<E> clone() {
                DoublyLinkedListCloneable<E> newList = new DoublyLinkedListCloneable<>();

                Node<E> current = head;
                while (current != null) {
                    newList.addLast(current.getElement());
                    current = current.getNext();
                }

                return newList;
            }
        }


       // في هذا الكود، قمنا بتعريف فئة جديدة تسمى DoublyLinkedListCloneable والتي ترث من فئة DoublyLinkedList وتنفذ واجهة Cloneable. ثم قمنا بتنفيذ طريقة clone() واستبدالها من الفئة الأساسية. في هذه الطريقة، قمنا بإنشاء قائمة جديدة ونسخ قيمة كل عنصر في القائمة الأصلية إلى القائمة الجديدة باستخدام طريقة addLast(). أخيرًا، أعدنا القائمة الجديدة كنتيجة من الطريقة clone().

           // باستخدام هذا الكود، يمكننا الآن استخدام طريقة clone() لإنشاء نسخة مستقلة من القائمة المزدوجة الارتباط الأصلية.
    }

}
