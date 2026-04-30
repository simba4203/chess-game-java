import java.util.*;

public class piece {

    String type; // pawn rook and other things 
    String color;  // White or Black
    

    public piece(String type, String color){
        this.type = type;
        this.color = color;
    }

    public String toString(){
        return color.charAt(0)+ type.substring(0,1);
    }
}