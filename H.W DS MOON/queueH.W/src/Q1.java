public class Q1 {



        public void rotate() {
        if (size <= 1) {
            return; // لا تفعل شيئًا إذا كان الحجم أقل من أو يساوي 1
        }

        E first = data[front]; // احتفظ بقيمة العنصر الأول

        // انقل باقي العناصر إلى اليسار بمقدار واحد
        for (int i = 0; i < size - 1; i++) {
            int current = (front + i) % data.length;
            int next = (current + 1) % data.length;
            data[current] = data[next];
        }

        // ضع العنصر الأول في الموضع الأخير
        int last = (front + size - 1) % data.length;
        data[last] = first;
    }


    }



    }

}

