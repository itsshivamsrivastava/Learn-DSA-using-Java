public class LL {
    
    private Node head;
    private Node tail;
    public int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void display(){
        // Node temp = head;
        while(head != null){
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        // public Node(int value, Node next) {
        //     this.value = value;
        //     this.next = next;
        // }

        
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        
        list.display();
    }
}
