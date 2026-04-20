class QueueDemo {
    int front = 0, rear = -1, size = 5;
    int[] arr = new int[size];

    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Overflow");
            return;
        }
        arr[++rear] = x;
    }

    int dequeue() {
        if (front > rear) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[front++];
    }

    void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        QueueDemo q = new QueueDemo();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();
    }
}