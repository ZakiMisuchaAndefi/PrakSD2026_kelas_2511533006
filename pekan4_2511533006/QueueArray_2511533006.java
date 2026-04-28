package pekan4_2511533006;

public class QueueArray_2511533006 {
	int front_3006, rear_3006, size_3006;
	int capacity_3006;
	int array_3006[];
	
	public QueueArray_2511533006(int capacity_3006) {
		this.capacity_3006 = capacity_3006;
		front_3006 = this.size_3006 = 0;
		rear_3006 = capacity_3006 -1;
		array_3006 = new int[this.capacity_3006];
	}
	
	boolean isFull_3006(QueueArray_2511533006 queue) {
		return (queue.size_3006 == queue.capacity_3006);
	}
	
	boolean isEmpty_3006(QueueArray_2511533006 queue) {
		return (queue.size_3006 == 0);
	}
	
	void enqueue_3006(int item) {
		if (isFull_3006(this))
			return;
		this.rear_3006 = (this.rear_3006 + 1) % this.capacity_3006;
		this.array_3006[this.rear_3006] = item;
		this.size_3006 = this.size_3006 + 1;
		System.out.println(item + " enqueued to queue");
	}
	
	int dequeue_3006() {
		if(isEmpty_3006(this))
			return Integer.MIN_VALUE;
		int item_3006 = this.array_3006[this.front_3006];
		this.front_3006 = (this.front_3006 + 1) % this.capacity_3006;
		this.size_3006 = this.size_3006 - 1;
		return item_3006;
	}
	int front_3006() {
		if(isEmpty_3006(this))
			return Integer.MIN_VALUE;
		
		return this.array_3006[this.front_3006];
	}
	int rear_3006() {
		if(isEmpty_3006(this))
			return Integer.MIN_VALUE;
		return this.array_3006[this.rear_3006];
	}
		//mencetak elemen antrian
	void display_3006() {
		int i;
		if (front_3006 == rear_3006) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		// Kunjungi dari belakang dan cetak
		for (i = front_3006; i < rear_3006; i++) {
			System.out.printf(" %d <-- ", array_3006[i]);
		}
		return;
	}

}
