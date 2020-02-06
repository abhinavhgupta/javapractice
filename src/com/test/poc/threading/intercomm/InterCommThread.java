package com.test.poc.threading.intercomm;

/**
 * 2 thread try to communicate, if 1st one is doing something after that 2nd
 * thread to do something, then after 2nd has done its work not its time for 1st
 * thread do to once again. So that means 2 thread are communicating so that
 * they can work properly. Now how we can achieve 2 threads are interacting?
 * 
 * @author abhinav gupta
 *
 */
public class InterCommThread {

	public static void main(String[] args) {
		Q q = new Q();
		new Consumer(q);
		new Producer(q);
	}

}
