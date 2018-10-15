package com.trader.strategy;

/**
 * <u>Overview:</u><br/>
 * At the London open the price often breaks out of the trading range and will trend in the direction of the breakout.
 * <p>
 * <u>Symbols</u><br/>
 * GBPUSD
 * <p>
 * <u>Indicator</u><br/>
 * 1 hour chart<br>
 * Take the max high and the min low of the last 3 candles and that makes the high and low of the breakout channel.
 * <p> 
 * <u>Entry Criteria</u><br>
 * Q: Does the channel have to be greater than or less than a certain amount?<br>
 * Create 2 orders One Cancels Other (OCO) of available<br>
 * <ol>
 * <li>Buy Stop: OPEN - BID (Buy) (lower) price reaches ceiling, TP open plus var[riskReward] ratio multiplied by channel pip size, SL floor open price minus channel pip size pips.</li>
 * <li>Sell Stop: OPEN - ASK (Sell) (higher) price reaches floor, TP open minus var[riskReward] ratio multiplied by channel pip size, SL floor open price plus channel pip size pips.</li>
 * </ol> 
 * <p>
 * <u>Exit Criteria</u><br>
 * TODO
 * <br>TP/SP
 * <br>Close after X hours or end of session
 * <p> 
 * <u>Open Trade adjustments</u><br>
 * TODO
 * <br>Dynamically adjust TP/SL as price moves
 * <p>
 * <u>Variables</u><br>
 * <ul>
 * <li>riskReward - ratio of risk vs reward deemed correct for the strategy</li>
 * </ul>
 */
public class LondonBreakoutStrategy implements Strategy {

	@Override
	public void entry() {
		// TODO Auto-generated method stub

	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void openTrade() {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeTrade() {
		// TODO Auto-generated method stub

	}

}
