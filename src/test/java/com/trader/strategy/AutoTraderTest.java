package com.trader.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutoTraderTest {

	@Test public void testExecuteMethod() {
        AutoTrader classUnderTest = new AutoTrader();
        assertTrue("execute should return 'true'", classUnderTest.execute());
    }
}
