public class Q4 {
   // {لدمج قائمتين مزدوجتين الارتباط L و M، التي تحتوي على رؤوس وعقدة تروس، في قائمة واحدة L'، يمكن تنفيذ الخوارزمية التالية:

        //1. قم بإنشاء قائمة جديدة L' مع رؤوس وعقدة تروس.

       // 2. قم بتعيين رأس L' ليكون هو رأس L.

       // 3. قم بتعيين تروس L' ليكون هو تروس M.

       /// 4. قم بتعيين عقدة تروس L لتشير إلى عقدة تروس M.

       // 5. إذا كانت إحدى القوائم فارغة (يعني لا يوجد عقدة بعد رأسها)، فلا تحتاج إلى تنفيذ الخطوات التالية ويمكنك إرجاع L' كمخرج.

        //6. قم بتعيين عقدة تروس M لتشير إلى العقدة الأخيرة في L.

       // 7. قم بتعيين العقدة التالية لعقدة تروس L لتشير إلى رأس M.

       // 8. إرجاع L' كنتيجة للدمج.

       // وفيما يلي تنفيذ الخوارزمية في شكل الكود:

    //java
        public DoublyLinkedList<E> concatenateLists(DoublyLinkedList<E> L, DoublyLinkedList<E> M) {
        DoublyLinkedList<E> LPrime = new DoublyLinkedList<>();
        LPrime.setHead(L.getHead());
        LPrime.setTrailer(M.getTrailer());

        Node<E> tailL = L.getTrailer().getPrev();
        Node<E> headM = M.getHead().getNext();

        if (tailL == L.getHead() && headM == M.getTrailer()) {
            return LPrime;
        }

        L.getTrailer().setPrev(M.getTrailer());
        M.getTrailer().setNext(L.getTrailer());

        tailL.setNext(headM);
        headM.setPrev(tailL);

        return LPrime;
    }


       // باستخدام هذه الخوارزمية، يمكننا دمج قائمتين مزدوجتين الارتباط L و M في قائمة واحدة L' من خلال تحديد الروابط بين العقد وتروس القائمتين. يتم إنشاء قائمة جديدة L' مع رؤوس وعقدة تروس، وتعيين رأس L' ليكون هو رأس L وتروس L' ليكون هو تروس M. يتم تعيين العقدة التالية لتروس L لتشير إلى رأس M والعكس بالعكس. الناتج النهائي هو القائمة المدموجة L'.
    }

}
