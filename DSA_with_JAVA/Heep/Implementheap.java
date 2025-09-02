import java.util.*;
public class Implementheap {
   
    static class Heap {
        ArrayList<Integer> list = new ArrayList<>();

        public void insert(int data) {
            list.add(data);

            int Cidx = list.size() - 1;
            int Pidx = (Cidx - 1) / 2;
            while (list.get(Cidx) < list.get(Pidx)){
                int temp = list.get(Cidx);
                list.set(Cidx, list.get(Pidx));
                list.set(Pidx, temp);

                Cidx = Pidx;
                Pidx = (Cidx - 1) / 2;
            }
        }
/// heapify krna means  heap ko fix krna 
        private void heapify(int idx) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int minIdx = idx;

            if (left < list.size() && list.get(minIdx)>list.get(left)) {
                minIdx = left;
            }
            if (right < list.size() && list.get(minIdx) > list.get(right) ) {
                minIdx = right;
            }
            if (minIdx != idx) {
                // swap
                int temp = list.get(idx);
                list.set(idx, list.get(minIdx));
                list.set(minIdx, temp);
                  heapify(minIdx);
            }
           
        }

        public int remove() {
            int data = list.get(0);//1 3 4 5

            // swap
            int temp = list.get(0);//1
            list.set(0, list.get(list.size() - 1)); //0-5
            list.set(list.size() - 1, temp); //4-1
            // delete last node
           list.remove(list.size() - 1);
            // step3
            heapify(0);
            return data;
        }

        public int peek() {
            return list.get(0);
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }

    }

    public static Boolean ArrytoHeap(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= (n - 2) / 2; i++) {
            if (arr[i] < arr[2 * i + 1]) {// left child
                return false;
            }
            if ((2 * i + 2) < n && arr[i] < arr[2 * i + 2]) {// right child
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.insert(3);
        h.insert(4);
        h.insert(1);
        h.insert(5);
        // while (!h.isEmpty()) {
        //     System.out.println(h.peek());
        //     h.remove();
        // }
        System.out.print(h.remove());

        // int arr[] = { 90, 15, 10, 7, 12, 14 };
        // System.out.println(ArrytoHeap(arr));

    }
}
