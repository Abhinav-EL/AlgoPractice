public class QueuePractice {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push("1");
        queue.push("2");
        queue.push("3");
        queue.push("4");
        queue.push("5");

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}

class Queue {
    Node head;
    Node tail;

    public void push(String val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public String pop(){
        if(head == tail) {
            return head.val;
        }
        String returnVal = head.val;
        head = head.next;
        return returnVal;
    }
}

class Node {
    String val;
    Node next;

    Node(String val){
        this.val = val;
    }
}
