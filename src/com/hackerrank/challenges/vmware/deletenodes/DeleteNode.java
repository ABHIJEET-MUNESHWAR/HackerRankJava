package com.hackerrank.challenges.vmware.deletenodes;

import java.util.Scanner;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetashokmuneshwar,
 * Date:    18/08/18,
 * Time:    8:50 PM
 * Delete LinkedList nodes greater than X
 */
public class DeleteNode {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void push(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
    }

    private void printList() {
        if (head == null) {
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteNode deleteNode = new DeleteNode();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            deleteNode.push(sc.nextInt());
        }
        deleteNode.delete(3);
        deleteNode.printList();
    }

    private Node delete(int x) {
        if(head == null) return head;

        if(head.data > x && head.next == null) return null;

//find first head node
        Node cur = head;
        Node prev = null;

//4,5,3,2,1,6 --- where x = 2
        while(cur != null && cur.data > x) {
            prev = cur;
            cur = cur.next;
        }

        if(prev != null) prev.next = null;

        Node newHead = cur;

        while(cur.next != null) {
            if(cur.next.data > x) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return newHead;
    }
}
