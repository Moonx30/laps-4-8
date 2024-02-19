public class Q1 {//1.	 Consider the implementation of CircularlyLinkedList.addFirst, in Code Fragment 3.16. The else body at
    // lines 39 and 40 of that method relies on a locally declared variable, newest. Redesign that clause to avoid use of any local variable.
   // {لحل هذا السؤال، دعنا نلقي نظرة على تنفيذ دالة addFirst في فئة CircularlyLinkedList كما هو موجود في مقتطف الشفرة 3.16. سنقوم بإعادة تصميم
    // 0الشرط else في الأسطر 39 و 40 من تلك الدالة لتجنب استخدام أي متغير محلي. دعنا نقوم بذلك خطوة بخطوة:

    //java
        public void addFirst(E e) {
        if (size == 0) {
            head = new Node<>(e, null);
            head.setNext(head);
        } else {
            Node<E> newest = new Node<>(e, head);
            head.setNext(newest);
            head = newest;
        }
        size++;
    }


        //نقوم بتحويل هذا الشرط إلى بدون استخدام أي متغيرات محلية. سنقوم بتغيير شرط الـ else على النحو التالي:

    //java
        public void addFirst(E e) {
        if (size == 0) {
            head = new Node<>(e, null);
            head.setNext(head);
        } else {
            head.setNext(new Node<>(e, head.getNext()));
            head = head.getNext();
        }
        size++;
    }


        //الآن، بدلاً من إنشاء متغير newest، نقوم بإنشاء كائن Node جديد مباشرة ونعينه كـ head الجديد. في الخطوة الأخيرة، نعين head ليكون العقدة التي تم تمريرها كمعامل في البداية.

        //بهذا التصميم الجديد، قمنا بتجاوز استخدام أي متغير محلي والتعامل مباشرة مع الخواص والوظائف المتاحة في الهيكل المتصل المدور (CircularlyLinkedList).


    }
