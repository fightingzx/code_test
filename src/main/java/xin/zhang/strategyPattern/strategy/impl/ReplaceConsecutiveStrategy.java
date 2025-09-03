package xin.zhang.strategyPattern.strategy.impl;

import xin.zhang.strategyPattern.strategy.DealStringStrategy;

/**
 * 替换连续字符串为前一个字母
 */
public class ReplaceConsecutiveStrategy implements DealStringStrategy {

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
                // 若连续≥3个，替换为前一个字母,如果当前字母是a则直接删除
                if (count >= 3) {
                    if(current > 'a') {
                        result.replace(i, j+1, String.valueOf((char) (current - 1)));
                    } else {
                        result.delete(i,j);
                    }
                    changed = true;
                } else {
                    i = j; // 移动到下一个不同字符
                }
            }
        } while (changed); // 直到无变化为止

        return result.toString();
    }
}