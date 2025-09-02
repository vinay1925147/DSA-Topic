class Rotatedarray {
    public static int search(int arr[], int target, int si, int ei) {
        //  4 5 6 7 0 1 2
        if (si > ei) {
            return -1;
        }
        int mid = (si + ei) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        // mid on line 1
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                return search(arr, target, mid + 1, ei);
            }

        }
        // mid on line 2
        else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                return search(arr, target, si, mid - 1);
            }
        }

    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(arr, 9, 0, arr.length - 1));

    }
}
