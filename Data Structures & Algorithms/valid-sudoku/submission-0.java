class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
            Set<Character>st = new HashSet<>();
            for(int col=0;col<9;col++){
                if(board[row][col]=='.') continue;
                if(st.contains(board[row][col])) return false;
                st.add(board[row][col]);
            }
        }
        
        for(int col=0;col<9;col++){
   
            Set<Character>st = new HashSet<>();
                 for(int row=0;row<9;row++){
                if(board[row][col]=='.') continue;
                if(st.contains(board[row][col])) return false;
                st.add(board[row][col]);
            }
        }
                for(int square = 0; square < 9; square++) {

            Set<Character> st = new HashSet<>();

            for(int row = 0; row < 3; row++) {

                for(int col = 0; col < 3; col++) {

                    int r = (square / 3) * 3 + row;
                    int c = (square % 3) * 3 + col;

                    if(board[r][c] == '.') continue;

                    if(st.contains(board[r][c])) {
                        return false;
                    }

                    st.add(board[r][c]);
                }
            }
        }

        return true;
    }
}