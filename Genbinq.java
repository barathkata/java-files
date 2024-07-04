package datastructures;

import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

public class GeneratebinarynumbyusingQueue {
public void genbin() {
	String[] str=new String[5];
	Queue<String> q=new LinkedList<>();
		q.offer("1");
		for(int i=0;i<5;i++) {
			str[i]=q.poll();//[1]
			String s1=str[i]+"0";//[10]
			String s2=str[i]+"1";//[11]
			q.offer(s1);//1o
			q.offer(s2);//11,10
		}
		System.out.println(Arrays.toString(str));

	}
public static void main(String[] args) {
	GeneratebinarynumbyusingQueue bi=new GeneratebinarynumbyusingQueue();
	bi.genbin();
}
}

