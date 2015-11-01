/**
 * Created by nisarg on 10/31/15.
 */
public class Block {
    private int x;
    private int y;
    private boolean isVisited;

    public Block(int x, int y, boolean isVisited) {
        this.x = x;
        this.y = y;
        this.isVisited = isVisited;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
