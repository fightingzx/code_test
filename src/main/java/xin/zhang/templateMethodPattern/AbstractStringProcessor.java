package xin.zhang.templateMethodPattern;

/**
 * 处理字符串模板类
 */
public abstract class AbstractStringProcessor {
    /**
     * 处理字符串，模板方法
     */
    public final String process(String input) {
        // 参数校验
        if (input == null || input.length() < 3) {
            return input;
        }
        String current = input;
        String next;
        do {
            next = deal(current); // 调用具体处理逻辑
            if (current.equals(next)) {
                break; // 无变化时终止
            }
            current = next;
        } while (true);
        return current;
    }

    /**
     * 抽象方法：具体的字符处理逻辑（由子类实现）
     */
    protected abstract String deal(String str);
}