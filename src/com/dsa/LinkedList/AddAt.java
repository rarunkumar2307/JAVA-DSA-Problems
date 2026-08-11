package com.dsa.LinkedList;

class AddAt {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        Node N1=new Node(10);
        Node N2=new Node(20);
        Node N3=new Node(30);
        Node N4=new Node(40);
        Node N5=new Node(50);

        N1.next=N2;
        N2.next=N3;
        N3.next=N4;
        N4.next=N5;

        Node head=N1;//Node=DataType, head=Variable Name
        print(head);
        print(AddAt(head,25,2));
        print(head);
    }
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data);
            if(head.next!=null) System.out.print("->");
            head=head.next;
        }
        System.out.println();
    }
    public static Node AddAt(Node head, int val, int index){
        Node temp=head;
        Node N=new Node(val);
        for(int j=0;j<index-1;j++) temp=temp.next;

        Node temp2=temp.next;
        temp.next=N;
        N.next=temp2;

        return head;
    }
}
