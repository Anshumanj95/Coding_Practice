package Heap;
/*
use of binary heap
in heap sort
used in priority queue implement->
                    min heap(smallest at top)
                    max heap(highest at top)
    Binary heap is a complete binary tree means all level of tree are completely filled
    except possibly the last level and last level has to be filled from left to right not
    having gap in between

    complete binary tree can be represented in array without wasting any space
    left(i)=2i+1
    right(i)=2i+2
    parent(i)=floor((i-1)/2)

    min/max heap condition
    1. it is completely binary tree
    2. every node has value smaller(min heap) and greater(max heap) than its descendants(contains itself and lower nodes)
 */
public class BinaryHeap {
    static class MinHeap{
        int[] arr;
        int size;
        int capacity;
        MinHeap(int c){
            arr=new int[c];
            capacity=c;
            size=0;
        }
        int left(int i){
            return 2*i+1;
        }
        int right(int i){
            return 2*i+2;
        }
        int parent(int i){
            return (i-1)/2;
        }
        void insert(int x){
            if(size>capacity)
                return;
            size++;
            arr[size-1]=x;
            //for max head we just reverse the 2 condition
            for (int i=size-1;i!=0&&arr[parent(i)]>arr[i];){
                swap(arr[i],arr[parent(i)]);
                i=parent(i);
            }
        }
        void swap(int i,int j){
            int temp=i;
            i=j;
            j=temp;
        }
        void minHeapify(int i){
            int smallest=i;
            int lt=left(i);
            int rt=right(i);
            //just simply find the smallest element among element at given index and its both left and right child if exits
            // if smallest come out to be given index than we just return it because it heapify it is assume that given node
            // is violating min heap property
            //then simply swap that given element with the smallest one and then call recursively for its child.
            if(lt<size&&arr[lt]<arr[i])
                smallest=lt;
            if(rt<size&&arr[rt]<arr[smallest])
                smallest=rt;
            if(smallest!=i){
                swap(arr[i],arr[smallest]);
                minHeapify(smallest);
            }
        }
        // it just swaps root node with last node and then call min heapify in remaining tree
        // in min heap we know thar root is min minimum value
        // extract min just remove min value and remaining tree should follow mean heap property
        int extractMin(){
            if(size==0)
                return Integer.MAX_VALUE;
            if(size==1){
                size--;
                return arr[0];
            }
            swap(arr[0],arr[size-1]);
            size--;
            minHeapify(0);
            return arr[size];
        }
        // insert given key at given index and maintain min heap property
        void decreasekey(int i,int x){
            arr[i]=x;
            while (i!=0 && arr[i]<arr[parent(i)]){
                swap(arr[i],arr[parent(i)]);
                i=parent(i);
            }
        }
        void delete(int i){
            if(size== 0|| i<0|| i>size-1)
                return;
            if(size== 1){
                size--;
            } else {
                decreasekey(i, arr[--size]);
                minHeapify(i);
            }
        }
        //time complexity is O(N)
        void buildHeap(){
            for (int i=(size-2)/2;i>=0;i--)
                    minHeapify(i);
        }
    }

}
