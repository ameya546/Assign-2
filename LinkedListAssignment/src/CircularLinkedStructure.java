public class CircularLinkedStructure {
    private Node head = null;
    private Node tail = null;

    public void newNode (int x){
        Node node = new Node(x);

        if(head == null){
            head = node;
        }else {
            tail.next = node;
        }
        tail = node;
        tail.next = head;
    }

    public void display(){
        Node current = head;
        do {
            System.out.println(current.data);
            current = current.next;
        }while(current != head);
            System.out.println();
    }

    public static void main(String[] args){
        CircularLinkedStructure cl = new CircularLinkedStructure();
        cl.newNode(1);
        cl.newNode(2);
        cl.newNode(3);
        cl.display();
        }
    }




