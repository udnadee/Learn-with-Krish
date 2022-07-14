public class palindrom {

    Node head;

    static class Node{
        String data;
        Node next;

        Node(String d){
            data = d;
            next = null;
        }
    }

    public static palindrom insert( palindrom list, String  data) 
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
     public static void printList(palindrom list) 
     { 
         Node currNode = list.head; 
      
         System.out.print("LinkedList: "); 
      
         while (currNode != null) { 
             System.out.print(currNode.data + " "); 
             currNode = currNode.next; 
         } 
         System.out.println( " "); 
     } 

     public static String isPalindrome(palindrom list){
        Node slowNode = list.head;
        Node fastNode = list.head;

        while(fastNode != null && fastNode.next != null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        // reverse last half of the list
        Node prvNode = null;
        Node currNode = slowNode;
        Node nextNode = slowNode.next;

        while(currNode != null){
            nextNode = currNode.next;
            currNode.next = prvNode;
			prvNode = currNode;
			currNode = nextNode;
        }
        slowNode = prvNode;
        fastNode = list.head;
        //check is it palindrome or not
		while(slowNode != null){
			if(slowNode.data != fastNode.data){
				return "List is not a palindrome";
			}

			slowNode = slowNode.next;
			fastNode = fastNode.next;
		}

        return "List is palindrome";
    }

    public static void main(String[] args){
		
		palindrom list = new palindrom();
		list = insert(list,"A");
        list = insert(list,"B");
        list = insert(list,"C");
        list = insert(list,"B");
        list = insert(list,"A");
        
        System.out.println("The linked list:  ");
		printList(list);
        
        System.out.println(isPalindrome(list)); 
        System.out.println();

        palindrom list1 = new palindrom();
		list1 = insert(list1,"A");
        list1 = insert(list1,"B");
        list1 = insert(list1,"C");
        list1 = insert(list1,"C");
        list1 = insert(list1,"B");
        
        System.out.println("The linked list:  ");
		printList(list1);

       System.out.println(isPalindrome(list1)); 
       System.out.println();

       palindrom list3 = new palindrom();
       list3 = insert(list3,"A");
       list3 = insert(list3,"B");
       list3 = insert(list3,"A");
       list3 = insert(list3,"B");
       list3 = insert(list3,"A");
       list3 = insert(list3,"B");
       System.out.println("The linked list:  ");
       printList(list3);

      System.out.println(isPalindrome(list3)); 
      System.out.println();
    
    }
}
