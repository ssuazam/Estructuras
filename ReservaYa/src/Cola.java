import java.util.ArrayList;


public class Cola{
    // Declaring the class variables.
    public int size, front, tail;

    // Declaring array list of integer type.
    public ArrayList<Integer> queue = new ArrayList<Integer>();

    // Constructor
    Cola(int size){
        this.size = size;
        this.front = this.tail = -1;
        }

    // Method to insert a new element in the queue.
        public void enQueue(int data)
        {

            // Condition if queue is full.
            if((front == 0 && tail == size - 1) ||
                    (tail == (front - 1) % (size - 1)))
            {
                System.out.print("Queue is Full");
            }

            // condition for empty queue.
            else if(front == -1)
            {
                front = 0;
                tail = 0;
                queue.add(tail, data);
            }

            else if(tail == size - 1 && front != 0)
            {
                tail = 0;
                queue.set(tail, data);
            }

            else
            {
                tail = (tail + 1);

                // Adding a new element if
                if(front <= tail)
                {
                    queue.add(tail, data);
                }

                // Else updating old value
                else
                {
                    queue.set(tail, data);
                }
            }
        }

        public int size(){
            return size;
    }

        // Function to dequeue an element
// form th queue.
        public int deQueue()
        {
            int temp;

            // Condition for empty queue.
            if(front == -1)
            {
                System.out.print("Queue is Empty");

                // Return -1 in case of empty queue
                return -1;
            }

            temp = queue.get(front);

            // Condition for only one element
            if(front == tail)
            {
                front = -1;
                tail = -1;
            }

            else if(front == size - 1)
            {
                front = 0;
            }
            else
            {
                front = front + 1;
            }

            // Returns the dequeued element
            return temp;
        }

        // Method to display the elements of queue
        public void displayQueue()
        {

            // Condition for empty queue.
            if(front == -1)
            {
                System.out.print("Queue is Empty");
                return;
            }

            // If tail has not crossed the max size
            // or queue tail is still greater then
            // front.
            System.out.print("Elements in the " +
                    "circular queue are: ");

            if(tail >= front)
            {

                // Loop to print elements from
                // front to tail.
                for(int i = front; i <= tail; i++)
                {
                    System.out.print(queue.get(i));
                    System.out.print(" ");
                }
                System.out.println();
            }

            // If tail crossed the max index and
            // indexing has started in loop
            else
            {

                // Loop for printing elements from
                // front to max size or last index
                for(int i = front; i < size; i++)
                {
                    System.out.print(queue.get(i));
                    System.out.print(" ");
                }

                // Loop for printing elements from
                // 0th index till tail position
                for(int i = 0; i <= tail; i++)
                {
                    System.out.print(queue.get(i));
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

        // Driver code

    }

