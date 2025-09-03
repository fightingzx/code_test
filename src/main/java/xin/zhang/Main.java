package xin.zhang;

import xin.zhang.strategyPattern.strategy.impl.RemoveConsecutiveStrategy;
import xin.zhang.strategyPattern.strategy.impl.ReplaceConsecutiveStrategy;
import xin.zhang.strategyPattern.StringProcessor;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcd");
        //sb.replace(1,2+1,"g");
        sb.delete(1,2);
        System.out.println(sb.toString());
        //testStrategy();
        //testTemplate();
    }

    public static void testTemplate(){
        // 测试“阶段1：移除连续重复字符”
        StringProcessor remover = new StringProcessor(new RemoveConsecutiveStrategy());
        String input1 = "aabcccbbaad";
        String output1 = remover.deal(input1);
        System.out.println("Stage 1 Input: " + input1);
        System.out.println("Stage 1 Output: " + output1); // 输出: d

        // 测试“阶段2：替换连续重复字符”
        StringProcessor replacer = new StringProcessor(new ReplaceConsecutiveStrategy());
        String input2 = "abcccbad";
        String output2 = replacer.deal(input2);
        System.out.println("Stage 2 Input: " + input2);
        System.out.println("Stage 2 Output: " + output2); // 输出: d
    }

    public static void testStrategy(){
        // 测试“阶段1：移除连续重复字符”
        StringProcessor remover = new StringProcessor(new RemoveConsecutiveStrategy());
        String input1 = "aabcccbbaad";
        String output1 = remover.deal(input1);
        System.out.println("Stage 1 Input: " + input1);
        System.out.println("Stage 1 Output: " + output1); // 输出: d

        // 测试“阶段2：替换连续重复字符”
        StringProcessor replacer = new StringProcessor(new ReplaceConsecutiveStrategy());
        String input2 = "abcccbad";
        String output2 = replacer.deal(input2);
        System.out.println("Stage 2 Input: " + input2);
        System.out.println("Stage 2 Output: " + output2); // 输出: d
    }
}