package core.list.linked;

public class LinkedList {

	static Node head1, head2;

	static class Node {
		int data;
		Node next;

		Node(int item) {
			data = item;
			next = null;
		}
	}

	Node addTwoLists(Node first, Node second) {
		Node result = null;
		Node previous = null;
		Node temp = null;
		int carry = 0, sum;

		while (first != null || second != null) {

			sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);

			carry = (sum >= 10) ? 1 : 0;

			sum = sum % 10;

			temp = new Node(sum);

			if (result == null) {
				result = temp;
			} else {
				previous.next = temp;
			}

			previous = temp;

			if (first != null) {
				first = first.next;
			}

			if (second != null) {
				second = second.next;
			}
		}

		if (carry < 0) {
			temp.next = new Node(carry);
		}

		return result;
	}

	void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println(" ");
	}

	Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	Node addItem(Node head, int[] items, int start, int size) {
		/*
		 * for(int i=1;i<items.length;i++){ head.next = new Node(items[i]); }
		 */

		head = new Node(items[0]);
		System.out.println("* start " + start + " size " + size);

		while (start < size) {
			
		}

		head.next = new Node(items[start]);
		System.out.println("** data ");
		return addItem(head.next, items, start + 1, size - 1);
	}

	public static void main(String[] args) {

		System.out.println("-------------------------------");
		LinkedList list = new LinkedList();
		int[] arr1 = { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		// LinkedList.head1 = new Node(arr1[0]);
		Node head1 = list.addItem(LinkedList.head1, arr1, 1, arr1.length - 1);
		list.printList(head1);
		System.out.println("-------------------------------");

		/*
		 * LinkedList.head1 = new Node(7); LinkedList.head1.next = new Node(5);
		 * LinkedList.head1.next.next = new Node(9);
		 * LinkedList.head1.next.next.next = new Node(4);
		 * LinkedList.head1.next.next.next.next = new Node(6); head1 =
		 * list.reverse(head1); System.out.println("First List is ");
		 * list.printList(head1);
		 * 
		 * 
		 * LinkedList.head2 = new Node(8); LinkedList.head2.next = new Node(4);
		 * head2 = list.reverse(head2); System.out.println("Second List is ");
		 * list.printList(head2);
		 * 
		 * Node result = list.addTwoLists(head1, head2); result =
		 * list.reverse(result); System.out.println("Result List is ");
		 * list.printList(result);
		 */

		/**
		 * 75946 84 50056
		 * 
		 * 75946 84 76030
		 */

	}

}
