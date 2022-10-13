package stack;

public class StackUsingArray {
    public class TwoStack {
        int[] arr;
        int front;
        int rear;
        int n;

        public TwoStack(int s) {
            n = s;
            rear = n;
            front = -1;
            arr = new int[n];

        }

        // Push in stack 1.
        public void push1(int num) {
            if (front < rear - 1) {
                front++;
                arr[front] = num;
            }

        }

        // Push in stack 2.
        public void push2(int num) {
            if (front < rear - 1) {
                rear--;
                arr[rear] = num;
            }

        }

        // Pop from stack 1 and return popped element.
        public int pop1() {
            if (front == -1) {
                return -1;
            } else {
                return arr[front--];
            }

        }

        // Pop from stack 2 and return popped element.
        public int pop2() {
            if (rear != n)
                return arr[rear++];
            return -1;

        }
    }
}
