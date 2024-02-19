public class Q5 {
   // {لإعادة تنفيذ فئة DoublyLinkedList باستخدام عقدة حارسة واحدة فقط بدلاً من عقدتين حارستين (رأس وتروس)، يمكن اتباع الخوارزمية التالية:

       // 1. قم بإنشاء فئة جديدة تسمى DoublyLinkedList وضمّن فيها عقدة واحدة تعمل كعقدة حارسة. يمكن تسمية هذه العقدة "sentinel".

       // 2. في البداية، تعيين عقدة الحارس لتشير إلى نفسها في الاتجاهين (العقدة التالية والعقدة السابقة).

       // 3. تنفيذ العمليات المختلفة مثل إضافة العناصر وإزالتها والوصول إلى العناصر باستخدام العقدة الحارسة.

       // 4. لإضافة عنصر جديد في بداية القائمة، أنشئ عقدة جديدة وقم بتعيين عقدة الحارس كعقدة التالية للعقدة الجديدة، وقم بتعيين العقدة الجديدة كعقدة السابقة لعقدة الحارس.

       // 5. لإضافة عنصر جديد في نهاية القائمة، أنشئ عقدة جديدة وقم بتعيين العقدة الحارس كعقدة السابقة للعقدة الجديدة، وقم بتعيين العقدة الجديدة كعقدة التالية لعقدة الحارس.

       // 6. لإزالة عنصر من القائمة، قم بتحديد العقدة التي تحتوي على العنصر المراد إزالته وتحديد العقدة التالية والعقدة السابقة لهذه العقدة، ثم قم بتعديل روابط العقد المحيطة لتجاوز العقدة المحذوفة.

           // وفيما يلي تنفيذ الخوارزمية في شكل الكود:

       // java
        public class DoublyLinkedList<E> {
            private Node<E> sentinel;

            public DoublyLinkedList() {
                sentinel = new Node<>(null, null, null);
                sentinel.setNext(sentinel);
                sentinel.setPrev(sentinel);
            }

            // إضافة عنصر في بداية القائمة
            public void addFirst(E element) {
                Node<E> newNode = new Node<>(element, sentinel.getNext(), sentinel);
                sentinel.getNext().setPrev(newNode);
                sentinel.setNext(newNode);
            }

            // إضافة عنصر في نهاية القائمة
            public void addLast(E element) {
                Node<E> newNode = new Node<>(element, sentinel, sentinel.getPrev());
                sentinel.getPrev().setNext(newNode);
                sentinel.setPrev(newNode);
            }

            // إزالة عنصر من القائمة
            public void remove(E element) {
                Node<E> current = sentinel.getNext();

                while (current != sentinel) {
                    if (current.getElement().equals(element)) {
                        Node<E> prevNode = current.getPrev();
                        Node<E> nextNode = current.getNext();
                        prevNode.setNext(nextNode);
                        nextNode.setPrev(prevNode);
                        break;
                    }

                    current = current.getNext();
                }
            }

            // الدوال الأخرى...
        }


       // مع استخدام عقدة حارسة واحدة فقط، يمكننا تنفيذ فئة DoublyLinkedList باستخدام العقدة الحارسة المشتركة لحفظ رؤوس وتروس القائمة. يتم إنشاء العقدة الحارسة في البداية وتعيين روابطها للإشارة إلى نفسها في الاتجاهين. ثم يمكننا تنفيذ العمليات المختلفة للقائمة باستخدام هذه العقدة الحارسة فقط، وذلك عن طريق تعيين الروابط المناسبة بين العقد التالية والسابقة للعقدة الحالية.
    }

}
