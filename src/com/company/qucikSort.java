
package com.company;
class quickSort {
        int partition(int arr[], int l, int h) {
            int pivot = arr[h];
            int i = (l - 1);
            for (int j = l; j < h; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[h];
            arr[h] = temp;

            return i + 1;
        }

        void sort(int arr[], int l, int h) {
            if (l< h) {
                int pi = partition(arr, l, h);
                sort(arr, l, pi - 1);
                sort(arr, pi + 1, h);
            }
        }
        static void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
        public static void main(String args[]) {
            int arr[] = {10, 7, 8,1,5,45,34,64,8,9,0,56};
            int n = arr.length;
            System.out.println("unsorted array");
            printArray(arr);

            quickSort ob = new quickSort();
            ob.sort(arr, 0, n - 1);

            System.out.println("sorted array");
            printArray(arr);
        }
    }

