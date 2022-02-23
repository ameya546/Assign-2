public class LastNode {

    private static void traverse(Node head){
        Node p = head;
        Node q = null;

        while (p != null ){
            q = p;
            p = p.next;
        }
        if (p == null) {
            System.out.println(p);
        }
    }


    public static void main(String[] args){
        Node head = new Node(10);
        Node n1 = new Node(20);
        head.next = n1;
        Node n2 = new Node(30);
        n1.next = n2;
        Node n3 = new Node(40);
        n2.next = n3;
        traverse(head);

    }//I'm not sure where to go from here
}
