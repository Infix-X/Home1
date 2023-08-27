import java.util.ArrayList;

public class Heapdiary {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int x = arr.size() - 1; // Updated index
            int parent = (x - 1) / 2;
            while (x > 0 && arr.get(x) < arr.get(parent)) { // Fixed the condition
                int temp = arr.get(x);
                arr.set(x, arr.get(parent));
                arr.set(parent, temp);
                x = parent;
                parent = (x - 1) / 2;
            }
        }

        private void heapify(int idx) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int minidx = idx;
            if (left < arr.size() && arr.get(left) < arr.get(minidx)) {
                minidx = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(minidx)) {
                minidx = right;
            }
            if (minidx != idx) {
                int temp = arr.get(idx);
                arr.set(idx, arr.get(minidx));
                arr.set(minidx, temp);
                heapify(minidx);
            }
        }

        public int delete() {
            int data = arr.get(0);
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);
            arr.remove(arr.size() - 1);
            heapify(0); // Fixed the method call
            return data;
        }

        public int peek() {
            return arr.get(0);
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.delete();
        }
    }
}


