public class Q3 {
  //  لتنفيذ طريقة equals() في فئة DoublyLinkedList،
    // يجب أن نقارن بين قائمتين للتحقق مما إذا كانت تحتوي على نفس العناصر بنفس الترتيب. يمكن تنفيذ الخوارزمية التالية لطريقة equals():

           // 1. قارن حجم القائمتين. إذا كانا مختلفين بالحجم، فالقوائم ليست متساويتين ويجب إرجاع false.

           // 2. قم بتعيين مؤشرين للعقدة الأولى في كل قائمة.

           // 3. استخدم حلقة للانتقال عبر العقد المتصلة في القوائم وقارن عناصرهما.

          //  4. في كل تكرار من الحلقة، قارن عناصر العقدة في القائمتين. إذا كانت العناصر مختلفة، فالقوائم ليست متساويتين ويجب إرجاع false.

         //   5. استمر في الحلقة حتى يصل أحد المؤشرين إلى نهاية قائمته.

          //  6. إذا تمت المرور عبر كل العقد في القوائم وتمت مقارنة جميع العناصر ولم يتم العثور على اختلاف، فالقوائم متساوية ويجب إرجاع true.

    //وفيما يلي تنفيذ الخوارزمية في شكل الكود:

    //java
    public boolean equals(DoublyLinkedList<E> otherList) {
        if (size() != otherList.size()) {
            return false;
        }

        Node<E> currentThis = head.getNext();
        Node<E> currentOther = otherList.head.getNext();

        while (currentThis != trailer) {
            if (!currentThis.getElement().equals(currentOther.getElement())) {
                return false;
            }

            currentThis = currentThis.getNext();
            currentOther = currentOther.getNext();
        }

        return true;
    }


   // باستخدام هذه الخوارزمية، يمكننا تنفيذ طريقة equals() في فئة DoublyLinkedList. ستقارن الحلقة بين العناصر في القوائم وتتحقق مما إذا كانت متساوية بنفس الترتيب. إذا تم العثور على أي اختلاف في العناصر، يتم إرجاع false. إذا تمت مقارنة جميع العناصر ولم يتم العثور على اختلاف، يتم إرجاع true.
}

}
