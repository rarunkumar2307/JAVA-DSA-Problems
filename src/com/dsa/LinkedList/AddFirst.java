package com.dsa.LinkedList;

public class AddFirst {
    public static class Node{
        int data;
        Node next;

        Node(int val){
            this.data=val;
        }
    }
    public static void main(String[] args){
        Node N1=new Node(10);
        Node N2=new Node(20);
        Node N3=new Node(30);
        Node N4=new Node(40);
        Node N5=new Node(50);

        N2.data=15;
        N1.next=N2;
        N2.next=N3;
        N3.next=N4;
        N4.next=N5;

        Node head=N1;
        print(head);
        print(head=addfirst(head,5));
        print(head);
    }
    public static Node addfirst(Node head,int val){
        Node N=new Node(val);
        N.next=head;
        head=N;
        return head;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
