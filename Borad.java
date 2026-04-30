import java.util.*;

public class Borad {
    piece[][] borad = new piece[8][8];

    public void initialize(){

        //black pieces palce 

        borad[0][0] = new piece("Rook","Black");
        borad[0][1] = new piece("Knight","Black");
        borad[0][2] = new piece("Bishop", "Black");
        borad[0][3] = new piece("Queen", "Black");
        borad[0][4] = new piece("King", "Black");
        borad[0][5] = new piece("Bishop", "Black" );
        borad[0][6] = new piece("Knight", "Black" );
        borad[0][7] = new piece("Rook", "Black" );

        for(int i = 0; i< 8; i++){
            borad[1][i] = new piece("pawn", "black");
        }

        //empty area

        for(int i = 2; i<6; i++){
            for(int j =0; j<8; j++);{
                borad[i][0] = null;

            }
        }

        // white now 
        for(int i =0; i<8; i++){
            borad[6][i] = new piece("pawn", "white ");
        }

        borad[7][0] = new piece("Rook", "white");
        borad[7][1] = new piece("Knight","white");
        borad[7][2] = new piece("Bishop", "white");
        borad[7][3] = new piece("Queen","white");
        borad[7][4] = new piece("King","whote");
        borad[7][5] = new piece("Bishop", "white");
        borad[7][6] = new piece("Knight","white");
        borad[7][7] = new piece("Rook", "white");

    }

    public void printBorad(){
        System.out.println("/nBorad:");
        for(int i = 0; i<8; i++){
            System.out.println(i +" ");
            for(int j = 0; j<8; j++){
                if (borad[i][j] == null) {
                    System.out.println("-- ");
                    
                }else{
                    System.out.println(borad[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println("0 1 2 3 4 5 6 7/n");
    }

    public boolean movePice(move move, String Player){
        piece p = borad[move.fromRow][move.fromCol];
        if(p == null) 
            return false;

        if(!p.color.equals(Player)) return false;

        // simple moves 
        borad[move.toRow][move.toCol] = p;
        borad[move.fromRow][move.fromCol] = null;

        return true;
    }
    
}
