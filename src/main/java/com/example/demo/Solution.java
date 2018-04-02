package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
        stack2.pop();
    }

    public int pop() {

        return stack2.push(stack1.pop());
    }

    private static String sdsd;

    public boolean Find(int target, int[][] array){
        int len = array.length-1;
        int i = 0;
        while((len >= 0)&& (i < array[0].length)){
            if(array[len][i] > target){
                len--;
            }else if(array[len][i] < target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }

    public static String replaceSpace(StringBuffer str) {
        char[] ar = str.toString().toCharArray();
        ArrayList<Integer> ki =new ArrayList<Integer>();
        for (int i=0;i<ar.length;i++) {
            if(ar[i]==' '){
                ki.add(i);
            }
        }
        for(int j=ki.size()-1;j>-1;j--){
            str.replace(ki.get(j),ki.get(j)+1,"%20");
        }
        return str.toString();
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        if(listNode==null){}else{
            while(listNode.next!=null){
                ar.add(listNode.val);
                listNode = listNode.next;

            }
            ar.add(listNode.val);
            Collections.reverse(ar);
        }
        return ar;
    }
    public static void main(String... args){
        StringBuffer hh = new StringBuffer("hello  world");
        String dd=replaceSpace(hh);
        System.out.println(dd);
        hh=null;
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next=l2;
        l2.next=l3;
        l1=null;
        l2=null;
        l3=null;
        ArrayList<Integer> ar=printListFromTailToHead(l1);
        System.out.println(ar.get(2));
        ar=null;
//        ArrayList<String> tt1 = new ArrayList<String>();
//        Scanner scanner =new Scanner(System.in);
//        while( scanner.hasNext()){
//           String hsh = scanner.next();
//            tt1.add(hsh);
//            System.out.println(hsh);
//        }
        String a1 = "ddd"; String a2 = "ddd";
        if(a1.length()!=a2.length()){
            System.out.println(false);
        }else{
            if(a1.equals(a2)){
                System.out.println(true);
            }
            else{

            }
        }


    }
    public int doLog(ArrayList<String> arrayList){
        String as =arrayList.get(0);
        int length = as.length();




        return 0;
    }
}
