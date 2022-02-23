public class LinkedListAssignment {

    private static Node createNode(int x) {
        Node dummy = new Node(' ');
        dummy.data = x;
        dummy.next = null;

        return dummy;
    }

    private static void printList (Node node){
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    private static Node mergeNodes (Node l1, Node l2){
        if (l1.next == null){
            l1.next = l2;
            return l1;
        }
        Node prev = l1, curr = l1.next;
        Node prev2 = l2, curr2 = l2.next;

        while (curr != null && prev2 != null){
            if ((prev2.data) >= (prev.data) && (prev2.data) <= (curr.data)){
                curr2 = prev2.next;
                prev.next = prev2;
                prev2.next = curr;

                prev = prev2;
                prev2 = curr2;
            }else {
                if (curr.next != null){
                    curr = curr.next;
                    prev = prev.next;
                }else {
                    curr.next =prev2;
                    return l1;
                }
            }
        }return l1;
    }

    public static Node merge (Node l1, Node l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if (l1.data < l2.data){
            return mergeNodes(l1,l2);
        }else return mergeNodes(l2, l1);
    }



    public static void main(String[] args){
        Node list1 = createNode(1);
        list1.next = createNode(3);
        list1.next.next = createNode(5);
        list1.next.next.next = createNode(7);

        Node list2 = createNode(2);
        list2.next = createNode(4);
        list2.next.next = createNode(6);
        list2.next.next.next = createNode(8);
        list2.next.next.next.next = createNode(10);

        Node mergedLists = merge(list1,list2);
        printList(mergedLists);
        }
    }


