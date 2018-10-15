package com.trader.strategy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AutoTrader {
	
	public static String dateTime() {
		return SimpleDateFormat.getDateTimeInstance(SimpleDateFormat.SHORT, SimpleDateFormat.LONG).format(new Date());
	}

	public static void main(String[] args) {
		System.out.println(dateTime() + ": AutoTrader Starting");
		AutoTrader autoTrader = new AutoTrader();
		autoTrader.execute();
		System.out.println(dateTime() + ": AutoTrader Ending");
	}

	public boolean execute() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

}
