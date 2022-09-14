class LinkedListDemo {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // add - first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == newNode){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // Delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;  // head.next = null --> lastNode = null

        // If null.next --> null pointer exception. So,to avoid this error we have to check head.next == null.
        while(lastNode.next != null){ 
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        
        // Add first Node

        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        
        // Add last Node
        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list. deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
    }
}
