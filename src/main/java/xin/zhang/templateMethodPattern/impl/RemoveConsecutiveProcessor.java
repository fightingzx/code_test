package xin.zhang.templateMethodPattern.impl;

import xin.zhang.templateMethodPattern.AbstractStringProcessor;

/**
 * 移除连续重复字符
 */
public class RemoveConsecutiveProcessor extends AbstractStringProcessor {

    @Override
    protected String deal(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int length = str.length();
        while (i < length) {
            char c = str.charAt(i);
            int count = 1;
            // 统计连续相同字符
            while (i + count < length && str.charAt(i + count) == c) {
                count++;
            }
            // 连续数<3时保留，否则移除
            if (count < 3) {
                sb.append(String.valueOf(c).repeat(count));
            }
            i += count;
        }
        return sb.toString();
    }
}
