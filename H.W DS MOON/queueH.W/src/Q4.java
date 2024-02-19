public class Q4 {



import java.util.LinkedList;
import java.util.Queue;

        public class JosephusProblem {
            public static int josephus(int n, int k) {
                Queue<Integer> queue = new LinkedList<>();


                for (int i = 1; i <= n; i++) {
                    queue.add(i);
                }

                while (queue.size() > 1) {

                    for (int i = 0; i < k - 1; i++) {
                        int person = queue.remove();
                        queue.add(person);
                    }


                    queue.remove();
                }


                return queue.peek();
            }
    }



}

