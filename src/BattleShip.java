/**
 * Created by nisarg on 10/31/15.
 */
public class BattleShip {
    private int[][] locationCells;
    private int noOfHits;
    private String shipName;

    public BattleShip(int[][] locationCells, String shipName) {
        this.locationCells = locationCells;
        this.noOfHits = 0;
        this.shipName = shipName;
    }

    public int getNoOfHits() {
        return noOfHits;
    }

    public void setNoOfHits(int noOfHits) {
        this.noOfHits = noOfHits;
    }

    public boolean isBattleShipLocation(int x, int y){
        for(int i = 0; i < locationCells.length; i++){
            if(locationCells[i][0] == x && locationCells[i][1] == y)
                return true;
        }
        return false;
    }

    public String strikeStatus(int x, int y){

        if(isBattleShipLocation(x,y)){
            this.noOfHits++;
            if(this.noOfHits == locationCells.length){
                BattleshipGame.totalShips--;
                return "You Sunk "+this.shipName;
            }else{
                return "It's a Hit!";
            }
        }

        return "It's a Miss!";
    }
}
