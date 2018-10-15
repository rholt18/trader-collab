package com.trader.strategy;

public class AutoTrader {

	public static void main(String[] args) {
		System.out.println("AutoTrader Starting");
		AutoTrader autoTrader = new AutoTrader();
		autoTrader.execute();
		System.out.println("AutoTrader Ending");
	}

	public boolean execute() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return false;
	}

}
