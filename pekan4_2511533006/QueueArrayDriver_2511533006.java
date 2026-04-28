package pekan4_2511533006;

public class QueueArrayDriver_2511533006 {
	public static void main(String[] args) {
		QueueArray_2511533006 queue = new QueueArray_2511533006(1000);
		queue.enqueue_3006(10);
		queue.enqueue_3006(20);
		queue.enqueue_3006(30);
		queue.enqueue_3006(40);
		System.out.println("Item di depan " + queue.front_3006());
		System.out.println("item paling belakang " + queue.rear_3006());
		System.out.println("tampilkan queue");
		queue.display_3006();
		System.out.println();
		System.out.println(queue.dequeue_3006() + " dihapus dari queue");
		System.out.println("item di depan:" + queue.front_3006());
		System.out.println("item dibekalang:" + queue.rear_3006());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue.display_3006();
	}
}