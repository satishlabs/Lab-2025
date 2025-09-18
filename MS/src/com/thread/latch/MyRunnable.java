package com.thread.latch;

import java.util.concurrent.CountDownLatch;

public class MyRunnable implements Runnable{
	CountDownLatch countDownLatch;
	
	public MyRunnable(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		for(int i=2; i>=0; i--) {
			countDownLatch.countDown();
			System.out.println(Thread.currentThread().getName()+" has reduced latch count to :"+i);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
