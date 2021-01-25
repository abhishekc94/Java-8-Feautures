package com.ak.lamba.expressions;

public class ExampleWithCreatingThread {

	public static void main(String[] args) {
		
		Runnable runnable1 = new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1;i<=5;i++) {
					try {
						System.out.println("Thread 1 "+i);
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread thread1 = new Thread(runnable1);
		thread1.start();
		
		Runnable runnable2 = () -> {
			for(int i = 11;i<=15;i++) {
				try {
					System.out.println("Thread 2 "+i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread thread2 = new Thread(runnable2);
		thread2.start();
	}

}
