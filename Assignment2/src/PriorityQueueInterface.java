public abstract class PriorityQueueInterface<A> {
    // Retrieve and remove the highest priority account
    public abstract Account poll();

    // Peek at the highest priority account without removing it
    public abstract Account peek();

    // Get the size of the queue
    public abstract int size();

    // Check if the queue is empty
    public abstract boolean isEmpty();
}
