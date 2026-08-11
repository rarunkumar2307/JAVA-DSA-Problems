package com.dsa.LinkedList;

public class Mid {
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
        Node N6=new Node(60);

        N1.next=N2;
        N2.next=N3;
        N3.next=N4;
        N4.next=N5;
        N5.next=N6;

        Node head=N1;
        Mid(head);
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void Mid(Node head){
        Node s=head;
        Node f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        System.out.println("Middle: "+s.data);
    }
}
