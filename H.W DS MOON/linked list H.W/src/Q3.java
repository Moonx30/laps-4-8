public class Q3 {
    //3.	Give an implementation of the size( ) method for the SingularlyLinkedList class,
    // assuming that we did not maintain size as an instance variable.


// قم بتنفيذ دالة size( )لفئهSingularlyLinkedList على افتراض اننا لم نحافظ على الحجم كمتغير مثيل


    public int size() {
        int count = 0;
        Node x = head;

        while (x!= null) {
            count++;
           x= x.next;
        }

        return count;
    }










