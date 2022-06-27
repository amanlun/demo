package com.lun.bito.api.demo.interViewTest;

import java.io.*;
import java.util.stream.IntStream;

class SinglyLinkedListNodee {
    public int data;
    public SinglyLinkedListNodee next;

    public SinglyLinkedListNodee(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedListt {
    public SinglyLinkedListNodee head;
    public SinglyLinkedListNodee tail;

    public SinglyLinkedListt() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNodee node = new SinglyLinkedListNodee(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }

    public SinglyLinkedListNodee sortList(SinglyLinkedListNodee head) {
        if(head == null) return head;
        if (head.next != null) {
            compareAll(head);
            sortList(head.next);
        }
        return head;
    }

    private void compareAll(SinglyLinkedListNodee head) {
        if(head.next!=null){
            if(head.data > head.next.data){
                int tem  = head.data ;
                head.data = head.next.data;
                head.next.data = tem;
            }
            compareAll(head.next);
        }
    }
}

class SinglyLinkedListPrintHelperr {
    public static void printList(SinglyLinkedListNodee node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}



class Resultt {

    /*
     * Complete the 'condense' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST head as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNodee condense(SinglyLinkedListNodee head) {
//        SinglyLinkedListNodee node = head;
//        SinglyLinkedListNodee nextNode =null;
//        while (head != null) {
//            nextNode =head.next ;
//            if (nextNode ==null){
//                node =null;
//            } else if (node.data == nextNode.data) {
//                node.next = nextNode.next;
//            }else {
//                node =node.next;
//            }
//        }
        return head;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\temp\\面試題目\\Open\\ans.txt"));

        SinglyLinkedListt head = new SinglyLinkedListt();

//        int headCount =  Integer.parseInt(bufferedReader.readLine());
        int []intArray = {3,4,3,2,6,1,2,6};
//        System.out.println(headCount);
        IntStream.range(0, intArray.length).forEach(i -> {
//            try {
//                int headItem = Integer.parseInt(bufferedReader.readLine());
//                System.out.println(headItem);

//                for (int j = 0; j < intArray.length-1; j++) {
                    head.insertNode(intArray[i]);
//                }

//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }

        });
        head.sortList(head.head);
        SinglyLinkedListNodee result = Resultt.condense(head.head);

        SinglyLinkedListPrintHelperr.printList(result,"\n",bufferedWriter);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}

