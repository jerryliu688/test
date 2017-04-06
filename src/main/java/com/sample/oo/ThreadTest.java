package com.sample.oo;

class MyThread extends Thread {
	private String name;

	public MyThread(String name) {
		this.name = name;
	}

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1; i++) {
			System.out.println(name + "-----" + i);
		}
		super.run();
	}

}

class MyRunnable implements Runnable {
	private String name;

	public MyRunnable(String name) {
		this.name = name;
	}

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1; i++) {
			// 得到当前线程的名称；
			System.out.println(Thread.currentThread().getName() + "---" + i);
		}
	}

}

class MyRunnable2 implements Runnable {
	private int ticket = 10;

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
//			synchronized (this) {
				if (ticket > 0) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("车票" + ticket--);
				}
//			}

		}
	}

}

public abstract class ThreadTest {

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable("runnable-A");
		MyRunnable r2 = new MyRunnable("runnable-B");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

		MyThread mt1 = new MyThread("thread-A");
		MyThread mt2 = new MyThread("thread-B");
		mt1.start();
		mt2.start();
	}

}