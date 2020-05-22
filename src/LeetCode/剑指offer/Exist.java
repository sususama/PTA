package LeetCode.剑指offer;

public class Exist {
    private int len ;
    private int wide;
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        len = board.length;
        wide = board[0].length;
        //深度优先搜索
        for (int i = 0; i < len; i++){
            for (int j = 0; j < wide; j++){
                //如果能全部找到就返回正确
                if (dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }
    private boolean dfs(char[][] board,char[] word,int i ,int j ,int k){
        //当数组越界或者字符不匹配直接返回false
        if (i < 0||i >= len||j < 0|| j >= wide|| board[i][j] != word[k]) return false;
        //当找到了所有的单词的时候 k 的长度就是word，length - 1
        if (k == word.length - 1) return true;
        char temp = board[i][j];
        //把当前的字符变为 ‘/’，防止字母重复的时候找到当前下标的字母
        board[i][j] = '/';
        //向四个方向进行判断，判断能否找到下一个字母
        boolean res = (dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1)||
                dfs(board, word, i, j - 1, k + 1)|| dfs(board, word, i, j + 1, k + 1));
        board[i][j] = temp;
        return res;
    }
}
