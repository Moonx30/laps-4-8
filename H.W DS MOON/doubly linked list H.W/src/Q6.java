public class Q6 {
  //  {لتنفيذ نسخة دائرية من قائمة مزدوجة الارتباط بدون أي عقدة حارسة والتي تدعم جميع السلوكيات العامة للنسخة
    // الأصلية بالإضافة إلى طريقتي تحديث جديدتين وهما rotate() و rotateBackward() ، يمكن اتباع الخطوات التالية:

      //  1. قم بتعريف فئة جديدة تسمى CircularDoublyLinkedList.

      //  2. قم بإنشاء عقدة واحدة واحدة على الأقل لتمثيل العناصر في القائمة. يمكن تسمية هذه العقدة "head" وتعيين قيمتها الأولية إلى null.

        //3. قم بتنفيذ العمليات العامة للقائمة المزدوجة الارتباط مثل إضافة العناصر وإزالتها والوصول إلى العناصر.

       // 4. قم بتنفيذ طريقتين جديدتين: rotate() و rotateBackward().

           // - طريقة rotate(): تقوم بتدوير القائمة في اتجاه عقارب الساعة. يتم تحريك العقدة head إلى العقدة التالية وتحديث روابط العقد المحيطة بالعقدة الجديدة.

           // - طريقة rotateBackward(): تقوم بتدوير القائمة في اتجاه عقارب الساعة المعاكسة. يتم تحريك العقدة head إلى العقدة السابقة وتحديث روابط العقد المحيطة بالعقدة الجديدة.

           // وفيما يلي تنفيذ الخوارزمية في شكل الكود:

       // java
        public class CircularDoublyLinkedList<E> {
            private Node<E> head;

            public CircularDoublyLinkedList() {
                head = null;
            }

            public void addFirst(E element) {
                Node<E> newNode = new Node<>(element);
                if (head == null) {
                    newNode.setNext(newNode);
                    newNode.setPrev(newNode);
                } else {
                    newNode.setNext(head);
                    newNode.setPrev(head.getPrev());
                    head.getPrev().setNext(newNode);
                    head.setPrev(newNode);
                }
                head = newNode;
            }

            public void remove(E element) {
                if (head == null) {
                    return;
                }

                Node<E> current = head;
                do {
                    if (current.getElement().equals(element)) {
                        if (current == head) {
                            head = head.getNext();
                        }
                        current.getPrev().setNext(current.getNext());
                        current.getNext().setPrev(current.getPrev());
                        return;
                    }
                    current = current.getNext();
                } while (current != head);
            }

            public void rotate() {
                if (head != null) {
                    head = head.getNext();
                }
            }

            public void rotateBackward() {
                if (head != null) {
                    head = head.getPrev();
                }
            }

            // الدوال الأخرى...
        }


    //    باستخدام هذا الكود، يمكننا تنفيذ قائمة مزدوجة الارتباط الدائرية بدون عقدة حارسة وتدعم جميع السلوكيات العامة للنسخة الأصلية، بالإضافة إلى طريقتين جديدتين rotate() و rotateBackward() التي تقوم بتدوير القائمة في اتجاه عقارب السالتنفيذ نسخة دائرية من قائمة مزدوجة الارتباط بدون أي عقدة حارسة والتي تدعم جميع السلوكيات العامة للنسخة الأصلية بالإضافة إلى طريقتي تحديث جديدتين وهما rotate() و rotateBackward()، يمكن اتباع الخطوات التالية:

      //  1. قم بتعريف فئة جديدة تسمى CircularDoublyLinkedList.

       // 2. قم بإنشاء عقدتين على الأقل لتمثيل العناصر في القائمة. يمكن تسمية هاتين العقدتين "head" و "tail" وتعيين قيمتهما الأولية إلى null.

        //3. قم بتنفيذ العمليات العامة للقائمة المزدوجة الارتباط مثل إضافة العناصر وإزالتها والوصول إلى العناصر.

       // 4. قم بتنفيذ طريقتين جديدتين: rotate() و rotateBackward().

           // - طريقة rotate(): تقوم بتدوير القائمة في اتجاه عقارب الساعة. يتم نقل العقدة head إلى العقدة التالية وتحديث روابط العقد المحيطة بالعقدة الجديدة.

           // - طريقة rotateBackward(): تقوم بتدوير القائمة في اتجاه عقارب الساعة المعاكسة. يتم نقل العقدة head إلى العقدة السابقة وتحديث روابط العقد المحيطة بالعقدة الجديدة.

           // وفيما يلي تنفيذ الخوارزمية في شكل الكود:

        //java
        public class CircularDoublyLinkedList<E> {
            private Node<E> head;
            private Node<E> tail;

            public CircularDoublyLinkedList() {
                head = null;
                tail = null;
            }

            public void addFirst(E element) {
                Node<E> newNode = new Node<>(element);
                if (head == null) {
                    newNode.setNext(newNode);
                    newNode.setPrev(newNode);
                    head = newNode;
                    tail = newNode;
                } else {
                    newNode.setNext(head);
                    newNode.setPrev(tail);
                    head.setPrev(newNode);
                    tail.setNext(newNode);
                    head = newNode;
                }
            }

            public void remove(E element) {
                if (head == null) {
                    return;
                }

                Node<E> current = head;
                while (current != null) {
                    if (current.getElement().equals(element)) {
                        if (current == head && current == tail) {
                            head = null;
                            tail = null;
                        } else if (current == head) {
                            head = head.getNext();
                            head.setPrev(tail);
                            tail.setNext(head);
                        } else if (current == tail) {
                            tail = tail.getPrev();
                            tail.setNext(head);
                            head.setPrev(tail);
                        } else {
                            current.getPrev().setNext(current.getNext());
                            current.getNext().setPrev(current.getPrev());
                        }
                        return;
                    }
                    current = current.getNext();
                }
            }

            public void rotate() {
                if (head != null) {
                    head = head.getNext();
                    tail = tail.getNext();
                }
            }

            public void rotateBackward() {
                if (head != null) {
                    head = head.getPrev();
                    tail = tail.getPrev();
                }
            }

            // الدوال الأخرى...
        }


       // باستخدام هذا الكود، يمكننا تنفيذ قائمة مزدوجة الارتباط الدائرية بدون عقد
    }

}
