package com.fish;

import com.birdbrain.Finch;

public class Example {
    public static void main(String[] args) {
        Finch fish = new Finch();

        fish.setMove("Forward", 50.0, 50.0);
        fish.setTurn("L", 180, 90);
        fish.setMove("Forward", 4.0, 4.0);
        fish.playNote(60, 0.6);
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