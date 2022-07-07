
// a Singly Linked List 
public class LinkedList { 
    
    Node head; // head of list 
    
    // Linked list Node. 
    static class Node { 
    
        int data; 
        Node next; 
    
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node new_node = new Node(data); 
        new_node.next = null; 
    
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
    
            last.next = new_node; 
        } 
    
        return list; 
    } 
    
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
     
        System.out.print("LinkedList: "); 
     
        while (currNode != null) { 
            System.out.print(currNode.data + " "); 
            currNode = currNode.next; 
        } 
        System.out.println( " "); 
    } 
     
    public void reverse(){
		Node previous = null;
		Node current = head;
		Node next = head.next;
		
		while(current != null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
	}

    // Driver code 
    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList(); 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
    
        // Print the LinkedList 
        printList(list); 
        list.reverse();

        System.out.println("\nReversed Linked list  ");
        printList(list);
    

    } 
}