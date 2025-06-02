package com.fish;

import com.birdbrain.Finch;

public class Example {
    public static void main(String[] args) {
        Finch turbo = new Finch();

        boolean workshop = true;
        while (workshop){
            turbo.setTail("all", 0, 255, 255);
            turbo.setBeak(231, 115, 44);
            
            turbo.setMove("Forward", 4.0, 50.0);
            turbo.setTurn("L", 180, 90);
            turbo.setMove("Forward", 4.0, 50.0);
    
            turbo.setTail("all", 0, 0, 0);
            turbo.setBeak(0, 0, 0);

        }
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