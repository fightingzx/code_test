package xin.zhang;

import org.junit.Assert;
import org.junit.Test;
import xin.zhang.strategyPattern.StringProcessor;
import xin.zhang.strategyPattern.strategy.impl.RemoveConsecutiveStrategy;
import xin.zhang.strategyPattern.strategy.impl.ReplaceConsecutiveStrategy;


/**
 * 策略模式测试
 */
public class StrategyPatternTest {
    @Test
    public void testRemoveConsecutive() {
        StringProcessor remover = new StringProcessor(new RemoveConsecutiveStrategy());
        Assert.assertEquals("d", remover.deal("aabcccbbaad"));
        Assert.assertEquals("ab", remover.deal("ab"));
        Assert.assertEquals("", remover.deal("aaa"));
    }

    @Test
    public void testReplaceConsecutive() {
        StringProcessor remover = new StringProcessor(new ReplaceConsecutiveStrategy());
        Assert.assertEquals("d", remover.deal("aabcccbbaad"));
        Assert.assertEquals("abc", remover.deal("abc"));
        Assert.assertEquals("aa", remover.deal("abbccc"));
        Assert.assertEquals("", remover.deal("aaa"));
    }
}
