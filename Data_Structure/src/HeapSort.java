class HeapSort {
    void heapify(int[] a, int n, int i) {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && a[l] > a[largest]) largest = l;
        if (r < n && a[r] > a[largest]) largest = r;

        if (largest != i) {
            int t = a[i];
            a[i] = a[largest];
            a[largest] = t;
            heapify(a, n, largest);
        }
    }

    void sort(int[] a) {
        int n = a.length;

        for (int i = n/2 - 1; i >= 0; i--)
            heapify(a, n, i);

        for (int i = n-1; i > 0; i--) {
            int t = a[0];
            a[0] = a[i];
            a[i] = t;
            heapify(a, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        HeapSort hs = new HeapSort();
        hs.sort(arr);
        for (int i : arr) System.out.print(i + " ");
    }
}