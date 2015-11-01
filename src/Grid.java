/**
 * Created by nisarg on 10/31/15.
 */
public class Grid {
    private Block[][] grid;

    public Grid(int rows, int columns) {
        this.grid = new Block[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++ ){
                grid[i][j] = new Block(i+1, j+1,false);
            }
        }
    }

    public int checkGridCells(int x, int y){
        if(x < grid.length && x > 0 && y < grid[0].length && y > 0){
            if(grid[x][y].isVisited())
               return 1;
            grid[x][y].setIsVisited(true);
            return 0;
        }else{
            return 2;
        }
    }
}
