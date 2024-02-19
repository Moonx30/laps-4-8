public class Q5 {


import java.util.LinkedList;
import java.util.Queue;

        public class RoundRobinScheduling {
            public static void schedule(Queue<String> tasks, int quantum) {
                while (!tasks.isEmpty()) {
                    String task = tasks.remove();
                    System.out.println("Executing task: " + task);

                    if (task.length() <= quantum) {

                        System.out.println("Task " + task + " completed.");
                    } else {

                        System.out.println("Task " + task + " partially completed. Adding it back to the queue.");
                        tasks.add(task.substring(quantum));
                    }
                }
            }


            }
        }



    }

}
