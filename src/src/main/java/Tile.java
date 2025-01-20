public class Tile {
    private String terrainType = null;

    public Tile(String terrainType){
        this.terrainType = terrainType;
    }

    public String getTerrain(){
        return this.terrainType;
    }

    public void setTerrainType(String terrainType){
        this.terrainType = terrainType;
    }
}
