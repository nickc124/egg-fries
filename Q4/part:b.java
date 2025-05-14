public boolean clearPair(int row, int col){
  int num = puzzle[row][col];
  for(int rows=row;rows<puzzle.length;rows++){
    for(int cols=0;cols<puzzle[0].length;cols++){
      if(num==puzzle[rows][cols] && (rows!=row || cols!=col)){
        puzzle[row][col]=0;
        puzzle[rows][cols]=0;
        return true;
      }
    }
  }
  return false;
}
