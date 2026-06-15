class QueueADT {
    int[] queue;
    int front;
    int rear;
    int size;

    QueueADT(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return rear == size - 1;
    }

    boolean isEmpty() {
        return front == -1 || front > rear;
    }

    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        queue[rear] = value;
        System.out.println(value + " inserted");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(queue[front] + " deleted");
        front++;
    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Front element = " + queue[front]);
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        QueueADT q = new QueueADT(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();

        q.peek();
    }
}