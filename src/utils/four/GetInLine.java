package utils.four;

import java.util.*;

public class GetInLine {
	public static void main(String[] args) throws InterruptedException {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("banana");
		pq.add("pear");
		pq.add("apple");
		System.out.println(pq.poll() + " " + pq.peek());
		
		TreeSet<Integer> i = new TreeSet<Integer>();
		
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("OLA");
			}
		});
		
		t.start();
		t.wait();
		t.join();
		
		i.add(500);
		i.add(501);
		i.add(502);
		i.add(503);
		i.add(504);
		Set<Integer> subSet = i.subSet(500, true, 501, true);
		
	}
}