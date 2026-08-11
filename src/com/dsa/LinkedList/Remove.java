package com.dsa.LinkedList;

public class Remove {
    public static  class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
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

        Node head=N1;
        print(head);
        print(head=RemoveFirst(head));
        print(head);
        RemoveLast(head);
        print(head);
        RemoveAt(head,1);
        print(head);
    }
    public static void print(Node head){
        if(head==null) {
            System.out.print("null");
            return;
        }
        while(head!=null) {
            System.out.print(head.data);
            if(head.next!=null) System.out.print("->");
            head=head.next;
        }
        System.out.println();
    }
    public static Node RemoveFirst(Node head){
        if(head==null || head.next==null) return null;
        head=head.next;
        return head;
    }
    public static void RemoveLast(Node head){
        if(head==null || head.next==null){
            System.out.println("null");
            return;
        }
        Node temp=head;
        while(temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
        print(head);
    }
    public static void RemoveAt(Node head,int ind){
        if(head==null || head.next==null) {
            System.out.println("null");
            return ;
        }
        if(ind==0){
            head=RemoveFirst(head);
            print(head);
            return;
        }
        Node temp=head;
        for(int i=0;i<ind-1;i++) temp=temp.next;
        temp.next=temp.next.next;
        print(head);
    }
}
