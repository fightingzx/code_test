package xin.zhang.strategyPattern;

import xin.zhang.strategyPattern.strategy.DealStringStrategy;

/**
 * 字符串处理器
 */
public class StringProcessor {
    private DealStringStrategy strategy;

    public StringProcessor(DealStringStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(DealStringStrategy strategy) {
        this.strategy = strategy;
    }

    public String deal(String input) {
        return strategy.deal(input);
    }
}
