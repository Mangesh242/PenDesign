package org.example.pen.penFactory;

import org.example.Enums.*;
import org.example.pen.*;

public class PenFactory {
    public static Pen createPen(PenType penType) {
        if(penType==PenType.BALL){
            return new BallPen("Gripper","Cello",10,PenType.BALL, ClosingType.CAP);
        }
        else if(penType==PenType.GEL){
            return new GelPen("Trimax","Cello",60,PenType.GEL, ClosingType.CLICK);
        }else {
            return new FountainPen("Blue Fountain","Cello",40,PenType.FOUNTAIN, ClosingType.ROTATE);
        }

    }
}
