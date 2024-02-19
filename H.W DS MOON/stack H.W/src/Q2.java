public class Q2 {

    import java.util.Stack;

        public class StackRemoval {
            public static void removeElements(Stack<Integer> stack) {
                if (stack.isEmpty()) {
                    return false; // الستاك فارغ، انتهاء العملية
                }

                stack.pop(); // إزالة العنصر الأعلى من الستاك
                removeElements(stack); // استدعاء العاودة لإزالة العناصر المتبقية في الستاك
            }
        }
    }

}
