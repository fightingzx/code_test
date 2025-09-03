package xin.zhang.strategyPattern.strategy.impl;

import xin.zhang.strategyPattern.strategy.DealStringStrategy;

/**
 * 移除连续重复字符
 */
public class RemoveConsecutiveStrategy implements DealStringStrategy {

    @Override
    public String deal(String input) {
        // 参数校验
        if (input == null || input.length() < 3) {
            return input;
        }

        StringBuilder result = new StringBuilder(input);
        boolean changed;
        do {
            changed = false;
            int i = 0;
            while (i < result.length()) {
                char current = result.charAt(i);
                int count = 1;
                int j = i + 1;
                // 统计连续相同字符的长度
                while (j < result.length() && result.charAt(j) == current) {
                    count++;
                    j++;
                }
                // 若连续≥3个，则删除，并将标志位更改为true
                if (count >= 3) {
                    result.delete(i, j);
                    changed = true;
                } else {
                    i = j; // 移动到下一个不同字符
                }
            }
        } while (changed); // 直到无变化为止
        return result.toString();
    }
}