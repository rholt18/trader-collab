package com.trader.strategy;

public interface Strategy {

	void entry();
	
	void exit();
	
	void openTrade();
	
	void closeTrade();
	 
}
