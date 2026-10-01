class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            Set<Character> s=new HashSet<>();
            for(int j=0;j<9;j++){
                if(s.contains(board[i][j]))
                    return false;
                if(board[i][j]=='.')
                    continue;
                s.add(board[i][j]);
                
            }
        }
        for(int i=0;i<9;i++){
            Set<Character> s=new HashSet<>();
            for(int j=0;j<9;j++){
                if(s.contains(board[j][i]))
                    return false;
                if(board[j][i]=='.')
                    continue;
                s.add(board[j][i]);
                
            }
        }
        for(int r=0;r<9;r+=3){
            for(int c=0;c<9;c+=3){
                Set<Character> hs=new HashSet<>();
                for(int i=r;i<r+3;i++){
                    for(int j=c;j<c+3;j++){
                        if(hs.contains(board[i][j]))
                    return false;
                if(board[i][j]=='.')
                    continue;
                hs.add(board[i][j]);
                    }
                }
            }
        }
        return true;

    }
}
