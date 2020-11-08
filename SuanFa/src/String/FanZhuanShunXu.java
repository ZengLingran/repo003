package String;

/**
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。句子中单词以空格符隔开。
 * 为简单起见，标点符号和普通字母一样处理。
 * 例如输入“I am a student.”，则输出“student. a am I”。
 *
 * 借鉴字符串旋转的方法，我们先颠倒句子中的所有字符。
 * 这时，不但翻转了句子中单词的顺序，而且单词内字符也被翻转了。
 * 我们再颠倒每个单词内的字符。
 * 由于单词内的字符被翻转两次，因此顺序仍然和输入时的顺序保持一致。
 * 还是以上面的输入为例子。翻转“I am a student.”中所有字符得到“.tneduts a ma I”，
 * 再翻转每个单词中字符的顺序得到“students. a am I”，正是符合要求的输出。
 */
public class FanZhuanShunXu {
    // 字符反转的方法
    private void swap(char[] c, int front, int end) {
        if (front > end || end >= c.length) {
            return;
        }
        while (front < end) {
            char tmp = c[front];
            c[front] = c[end];
            c[end] = tmp;
            front++;
            end--;
        }
    }
    public String swapStr(String str) {
        char[] cArr = str.toCharArray();
        // 整个字符串的字符反转
        swap(cArr, 0, cArr.length - 1); // 反转整个字符串中的所有字母，how are you -> uoy era woh
        int begin = 0;
        // 对字符串中的每个单词反转，除了最后一单词
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] == ' ') {
                swap(cArr, begin, i - 1);
                begin = i + 1;
            }
        }
        // 最后一个单词的反转
        swap(cArr, begin, cArr.length - 1);
        return new String(cArr);
    }
    public static void main(String[] args) {
        String str = "how are you I'm Fine Thank you";
        System.out.println(new  FanZhuanShunXu().swapStr(str));
    }
}
