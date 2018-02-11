package com.windforce.common.scheduler;

import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.windforce.common.scheduler.impl.FixScheduledThreadPoolExecutor;

public class ScheduleTest {
	public static void main(String[] args) {
		// ScheduledExecutorService service = new ScheduledThreadPoolExecutor(10);
		FixScheduledThreadPoolExecutor service = new FixScheduledThreadPoolExecutor(10, 0l);
		service.scheduleWithFixedDelay(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getId() + " " + new Date());
				try {
					Thread.sleep(3 * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					throw new RuntimeException("任务执行错误!");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}, 0, 1, TimeUnit.HOURS);

		// service.scheduleAtFixedRate(new Runnable() {
		//
		// @Override
		// public void run() {
		// System.out.println(Thread.currentThread().getId() + " " + new Date());
		// try {
		// Thread.sleep(3 * 1000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// throw new RuntimeException("任务执行错误!");
		// }
		// }, 0, 1000, TimeUnit.MILLISECONDS);
	}
}
