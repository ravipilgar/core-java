class Tile{
    private int edgeLength;
    Tile(){}
    Tile(int edgeLength){
       this.edgeLength=edgeLength;
    }
   int getLength(){
        return edgeLength;
    }
}

class Floor extends Tile{
    private int length;
    private int width;

    Floor(){

    }
    Floor(int length,int width){
        this.length=length;
        this.width=width;
    }

    void totalTiles(Tile t){
       int areaTile=t.edgeLength*t.edgeLength;
       
    }
}

class Q42{
    public static void main(String args[]) {
        Floor f=new Floor(2,4);
        Tile t=new Tile(6);
        //f.Floor(2,4);
       f.totalTiles(t);
    }
}