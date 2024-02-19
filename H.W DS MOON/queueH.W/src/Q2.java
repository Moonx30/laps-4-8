public class Q2 {



        @SuppressWarnings("unchecked")
        @Override
        public ArrayQueue<E> clone() {
        try {
            ArrayQueue<E> clonedQueue = (ArrayQueue<E>) super.clone();
            clonedQueue.data = data.clone();
            return clonedQueue;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }










        }
    }


    }




}
