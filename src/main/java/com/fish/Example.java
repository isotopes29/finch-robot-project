package com.fish;

import com.birdbrain.Finch;

public class Example {
    public static void main(String[] args) {
        Finch turbo = new Finch();

        /**boolean workshop = true;
        for (int i = 0; i < 5; i++){
            //turbo.setTail("all", 0, 255, 255);
            turbo.setBeak(231, 115, 44);
            
            turbo.setMove("Forward", 4.0, 50.0);
            turbo.setTurn("L", 180, 90);
            turbo.setMove("Forward", 4.0, 50.0);
    
            //turbo.setTail("all", 0, 0, 0);
            turbo.setBeak(0, 0, 0);
            turbo.pause(0.3);
        }*/

        // ITS TIME TO GET FUNKY


        // TO THE LEFT
            turbo.setBeak(231, 115, 44);
            turbo.setTurn("L", 90, 100);
            turbo.setMove("Forward", 4, 100);
            turbo.pause(.1);
            turbo.setBeak(0, 0, 0);
            turbo.setTurn("R", 90, 100);
            turbo.pause(.1);
        
        //TAKE IT BACK NOW YALL
        turbo.setBeak(231, 115, 44);
        turbo.setMove("Backward", 4, 100);
        turbo.setBeak(0, 0, 0);
        turbo.pause(0.2);
        turbo.setBeak(231, 115, 44);
        turbo.setMove("Backward", 4, 100);
        turbo.setBeak(0, 0, 0);
        turbo.pause(.1);
        
        // ONE HOP THIS TIME
        turbo.setTurn("L", 360, 100);


    }
}
/**
     * Set the specified tail led to the specified rgb color.
     * @param ledNum - led to set (Range: 1 to 4)
     * @param red - red intensity (Range: 0 to 100)
     * @param green - green intensity (Range: 0 to 100)
     * @param blue - blue intensity (Range: 0 to 100)
     */
    //public void setTail(int ledNum, int red, int green, int blue) {