public class Q2 {
    //2.	Give an algorithm for finding the second-to-last node in a singly linked list in which the
    // last node is indicated by a null next reference.
    //اعط خوارزميه للعثور على العقده الثانيه الى الاخيره في قائمه مرتبطه بشكلل فردي  حيث تتم الاشاره الى العقده  الاخيره بمرجع تالي فارغ ؟


    //{بالتأكيد! هنا خوارزمية لإيجاد العقدة قبل الأخيرة في قائمة مرتبطة مفردة حيث يتم تمثيل العقد الأخير بإشارة next تساوي null.

    while (head.next()!=null)
    { if (head.next().next()=!null)
       head=head.next}
       else
           return head.next()}




    }







}
