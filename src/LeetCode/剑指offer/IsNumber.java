package LeetCode.剑指offer;

public class IsNumber {
    public boolean isNumber(String s) {
        // \\s*\\s*$
        // 可以以空白字符开头结尾
        // [+-]?(\d+\.?\d*
        // 可能有+-号，后接数字或 . 加数字
        // \.\d+)(e[+-]?\d+)
        // 或者接 . 接数字，接 e 再接e后面的数值
        String regex = "\\s*[+-]?(\\d+\\.?\\d*|\\.\\d+)(e[+-]?\\d+)?\\s*$";
        return s.matches(regex);
    }
}
