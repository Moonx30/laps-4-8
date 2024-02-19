public class Q4 {
    //{لتنفيذ طريقة clone() لفئة ArrayStack، يجب تنفيذ الخطوات التالية:

      //  1. قم بتعريف فئة جديدة تكون تطابق فئة ArrayStack. سنسميها ArrayStackClone.

       // 2. قم بتنفيذ طريقة clone() في فئة ArrayStackClone واجعلها ترجع نسخة مستقلة (deep copy) من الكائن الحالي.

       // 3. داخل طريقة clone()، قم بإنشاء كائن جديد من فئة ArrayStackClone.

      //  4. قم بتعيين قيمة المتغير top من الكائن الجديد بقيمة المتغير top من الكائن الحالي.

      //  5. قم بإنشاء مصفوفة جديدة لتخزين العناصر، بحجم يساوي حجم المصفوفة في الكائن الحالي.

    //  6. قم بنسخ العناصر من المصفوفة في الكائن الحالي إلى المصفوفة في الكائن الجديد.

       // 7. قم بتعيين المصفوفة المنسوخة في الكائن الجديد إلى المصفوفة المحتوية على العناصر المنسوخة.

      //  8. أخيرًا، قم بإرجاع الكائن الجديد من طريقة clone().

           // وفيما يلي تنفيذ هذا الألگوريتم في شكل الكود (باستخدام لغة Java كمثال):

        //java
import java.util.Arrays;

        public class ArrayStackClone implements Cloneable {
            private Object[] elements;
            private int top;

            public ArrayStackClone(int capacity) {
                elements = new Object[capacity];
                top = -1;
            }

            public void push(Object element) {
                if (top == elements.length - 1) {
                    throw new StackOverflowError();
                }
                top++;
                elements[top] = element;
            }

            public Object pop() {
                if (isEmpty()) {
                    throw new IllegalStateException("Stack is empty");
                }
                Object element = elements[top];
                elements[top] = null;
                top--;
                return element;
            }

            public boolean isEmpty() {
                return top == -1;
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                ArrayStackClone clonedStack = (ArrayStackClone) super.clone();
                clonedStack.elements = Arrays.copyOf(elements, elements.length);
                return clonedStack;
            }
        }


       // في هذا الكود، قمنا بتعريف فئة ArrayStackClone التي تنسخ فئة ArrayStack. في طريقة clone()، قمنا بإنشاء كائن جديد من فئة ArrayStackClone وتعيين قيمة المتغير top من الكائن الجديد بقيمة المتغير top من الكائن الحالي. ثم قمنا بإنشاء مصفوفة جديدة ونسخ العناصر من المصفوفة في الكائن الحالي إلى المصفوفة في الكائن الجديد باستخدام Arrays.copyOf(). أخيرًا، قمنا بإرجاع الكائن الجديد من طريقة clone().

           // باستخدام هذا الكود، يمكنك الآن استخدام طريقة clone() لنسخ كائن ArrayStack والحصول على نسخة مستقلة منه.
    }

}
