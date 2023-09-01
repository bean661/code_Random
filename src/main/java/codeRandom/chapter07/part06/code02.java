package codeRandom.chapter07.part06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-01 21:39
 **/
public class code02 {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for (char[] chars : chessboard) {
            Arrays.fill(chars, '.');
        }
        backTrack(chessboard, n, 0);
        return res;
    }

    private void backTrack(char[][] chessboard, int n, int row) {
        if (row == n) {
            res.add(Array2List(chessboard));
            return;
        }
        for (int col = 0; col < n; ++col) {
            if (isValid(row, col, n, chessboard)) {
                chessboard[row][col] = 'Q';
                backTrack(chessboard, n, row + 1);
                chessboard[row][col] = '.';
            }
        }


    }

    private boolean isValid(int row, int col, int n, char[][] chessboard) {
        for (int i = 0; i < row; i++) {
            if (chessboard[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j <= chessboard.length - 1; i--, j++) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }

        return true;


    }

    private List Array2List(char[][] chessboard) {
        List<String> list = new ArrayList<>();
        for (char[] chars : chessboard) {
            list.add(String.valueOf(chars));
        }
        return list;
    }
}
