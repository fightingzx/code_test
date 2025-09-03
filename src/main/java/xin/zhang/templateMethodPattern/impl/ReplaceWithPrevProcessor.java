package xin.zhang.templateMethodPattern.impl;

import xin.zhang.templateMethodPattern.AbstractStringProcessor;

/**
 * 将3个及以上连续字符替换为前一个字符的具体实现
 */
public class ReplaceWithPrevProcessor extends AbstractStringProcessor {

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
            // 连续数≥3时替换为前一个字符，否则保留
            if (count >= 3) {
                // 如果为a，则直接去掉
                if (c != 'a') {
                    // 否则替换为前一个字符
                    char replacement = (char) (c - 1);
                    sb.append(replacement);
                }
            } else {
                sb.append(String.valueOf(c).repeat(count));
            }
            i += count;
        }
        return sb.toString().trim();
    }
}