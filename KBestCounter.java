import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class KBestCounter<T extends Comparable<? super T>> {

	PriorityQueue<T> heap;
	int k;

	/**creates a counter that holds the k-best elements of a set of elements
	 * with k equal to an integer n and a priority queue of size k
	 * @param n k (number of best elements held in the counter)**/
	public KBestCounter(int n) {
		k = n;
		heap = new PriorityQueue<T>(k);
	}

	/**adds elements to the priority queue. if the priority queue is not full, 
	 * it adds the element. if the priority queue is full, it checks if the new
	 * element is greater than the min element and adds the new element if so
	 * @param x element to add to the priority queue**/
	public void count(T x) {
		if (heap.size() < k) {
			heap.add(x);
		} else if (heap.peek().compareTo(x) < 0) {
			heap.remove();
			heap.add(x);
		}
	}

	/**returns a list of the k-best elements in the set of elements. if there are
	 * no elements, it returns an error message. otherwise, each min is removed
	 * from the heap and added to the front of a linked list until there is no
	 * minimum left, sorting the elements in descending order. then the elements 
	 * are added back to the priority queue in ascending order.
	 * @return descending list of k greatest elements in the priority queue**/
	public List<T> kbest() {
		if (heap.isEmpty()) {
			System.out.println("Heap is empty");
			return null;
		} else {
			LinkedList<T> sortedElements = new LinkedList<T>();
			while (!heap.isEmpty()) {
				sortedElements.addFirst(heap.remove());
			}
			for (int k = sortedElements.size() - 1; k >= 0; k--) {
				heap.offer(sortedElements.get(k));
			}
			return sortedElements;
		}
	}
}