package xin.zhang;

import org.junit.Assert;
import org.junit.Test;
import xin.zhang.templateMethodPattern.AbstractStringProcessor;
import xin.zhang.templateMethodPattern.impl.RemoveConsecutiveProcessor;
import xin.zhang.templateMethodPattern.impl.ReplaceWithPrevProcessor;

/**
 * 模板方法模式测试
 */
public class TemplateMethodPatternTest {

    /**
     * 测试移除连续字符
     */
    @Test
    public void testRemoveProcessor() {
        AbstractStringProcessor processor = new RemoveConsecutiveProcessor();
        Assert.assertEquals("d", processor.process("aabcccbbaad"));
        Assert.assertEquals("ab", processor.process("ab"));
        Assert.assertEquals("", processor.process("aaa"));
        Assert.assertEquals("ad", processor.process("acccd"));

    }

    /**
     * 测试替换连续字符
     */
    @Test
    public void testReplaceProcessor() {
        AbstractStringProcessor processor = new ReplaceWithPrevProcessor();
        Assert.assertEquals("d", processor.process("aabcccbbaad"));
        Assert.assertEquals("abc", processor.process("abc"));
        Assert.assertEquals("aa", processor.process("abbccc"));
        Assert.assertEquals("", processor.process("aaa"));
        Assert.assertEquals("abd", processor.process("acccd"));
    }
}
