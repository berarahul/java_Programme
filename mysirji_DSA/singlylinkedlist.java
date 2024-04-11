public class Node {
    public int data;   // Data of the node
    public Node next;   // Reference to the next node in the list

    // Constructor to initialize the node with data and a null next reference
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Additional constructor for convenience if you want to specify both data and next
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
 public static void main(String[] args) {
    // Creating nodes
Node node1 = new Node(42);  // Creates a node with data 42 and a null next reference
Node node2 = new Node(73);  // Creates another node with data 73 and a null next reference
	
}