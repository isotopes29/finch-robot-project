package com.fish;

import com.birdbrain.Finch;

public class Example {
    public static void main(String[] args) {
        Finch turbo = new Finch();

        // ITS TIME TO GET FUNKY
        
        
        /** 
         * TO THE LEFT
         * finch bird's beak will light up every time it is in motion
         * moves to the left by 90 degrees and then forward to correspond with the song lyric
         * then will return to the normal standing by going right by 90 degrees
         * */
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("L", 90, 100);
        turbo.setMove("Forward", 2, 100);
        turbo.pause(.01);
        turbo.setBeak(0, 0, 0);
        turbo.setTurn("R", 90, 100);
        turbo.pause(.01);
        
        /** 
         * TAKE IT BACK NOW YALL
         * moves backwards by 1, pauses briefly, then backwards again
         * */
        turbo.setBeak(231, 115, 44);
        turbo.setMove("Backward", 1, 100);
        turbo.setBeak(0, 0, 0);
        turbo.pause(0.01);
        turbo.setBeak(231, 115, 44);
        turbo.setMove("Backward", 1, 100);
        turbo.setBeak(0, 0, 0);
        turbo.pause(.3);
        
        /** 
         * ONE HOP THIS TIME
         * finch birds cannot hop
         * so i made turbo spin to the left instead
         * */
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("L", 360, 100);
        turbo.setBeak(0, 0, 0);
        turbo.pause(.1);

        /** 
         * RIGHT FOOT LETS STOMP
         * again these birds have no legs. so he just looks to the right very briefly before turning to the left
         * */
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("R", 45, 100);
        turbo.setBeak(0, 0, 0);
        turbo.setTurn("L", 45, 100);
        turbo.pause(.01);

        /** 
         *  ELFT FOOT LETS STOMP
         * same thing as the right but. to the left. who wouldve guessed.
         * */
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("L", 45, 100);
        turbo.setBeak(0, 0, 0);
        turbo.setTurn("R", 45, 100);
        turbo.pause(.1);

        
        /** 
         * cha cha real smooth
         * bird moves back and forth in rapid succession
         * */
        turbo.setBeak(231, 115, 44);
        turbo.setMove("Forward", 2, 100);
        turbo.setMove("Backward", 2, 100);
        turbo.setMove("Forward", 2, 100);
        turbo.setMove("Backward", 2, 100);
        turbo.setMove("Forward", 2, 100);
        turbo.setMove("Backward", 2, 100);
        turbo.setBeak(0, 0, 0);
        turbo.pause(.9);

        //TO THE LEFT
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("L", 90, 100);
        turbo.setMove("Forward", 2, 100);
        turbo.pause(.01);
        turbo.setBeak(0, 0, 0);
        turbo.setTurn("R", 90, 100);
        turbo.pause(.01);
    
        //TAKE IT BACK NOW YALL
        turbo.setBeak(231, 115, 44);
        turbo.setMove("Backward", 1, 100);
        turbo.setBeak(0, 0, 0);
        turbo.pause(0.01);
        turbo.setBeak(231, 115, 44);
        turbo.setMove("Backward", 1, 100);
        turbo.setBeak(0, 0, 0);
        turbo.pause(.3);

        // ONE HOP THIS TIME
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("L", 360, 100);
        turbo.setBeak(0, 0, 0);
        turbo.pause(.1);

        //right foot LETS STOMP
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("R", 45, 100);
        turbo.setBeak(0, 0, 0);
        turbo.setTurn("L", 45, 100);
        turbo.pause(.01);

        // ELFT FOOT LETS STOMP
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("L", 45, 100);
        turbo.setBeak(0, 0, 0);
        turbo.setTurn("R", 45, 100);
        turbo.pause(.1);

        
        // cha cha real smooth
        turbo.setBeak(231, 115, 44);
        turbo.setMove("Forward", 2, 100);
        turbo.setMove("Backward", 2, 100);
        turbo.setMove("Forward", 2, 100);
        turbo.setMove("Backward", 2, 100);
        turbo.setBeak(0, 0, 0);
        turbo.pause(.7);

        //NOW ITS TIME TO GET FUNKYYYYY

        // TO THE RIGHT NOW
        /**
         * briefly turns to the right and blinks
         */
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("R", 30, 100);
        turbo.setBeak(0, 0, 0);

        /**
         * to the left
         * turns extra left to compensate the right it just went
         * then return to normal direction
         */
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("L", 120, 100);
        turbo.setBeak(0, 0, 0);
        turbo.setTurn("R", 90, 100);

        //its literally just the same stuff that can't be looped because the timing is different
        // bear with me
        turbo.setBeak(231, 115, 44);
        turbo.setMove("Backward", 1, 100);
        turbo.setMove("Backward", 1, 100);
        turbo.setBeak(0, 0, 0);

        // ONE HOP THIS TIME
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("L", 360, 100);
        turbo.setBeak(0, 0, 0);

        // ONE HOP THIS TIME
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("L", 360, 100);
        turbo.setBeak(0, 0, 0);

        // RIGHT FOOT TWO STOMPS
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("R", 22, 100);
        turbo.setBeak(0, 0, 0);
        turbo.setTurn("R", 22, 100);
        turbo.setTurn("L", 44, 100);


        // LEFT FOOT TWO STOMPS
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("L", 22, 100);
        turbo.setBeak(0, 0, 0);
        turbo.setTurn("L", 68, 100);
        turbo.pause(.1);

        //SLIDE TO THE LEFT
        turbo.setBeak(231, 115, 44);
        turbo.setMove("Forward", 2, 100);
        turbo.setBeak(0, 0, 0);

         //SLIDE TO THE RIGHT
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("R", 180, 100);
        turbo.setMove("Forward", 2, 100);
        turbo.setBeak(0, 0, 0);
        turbo.pause(.5);

        /**
         * see this one is actually new
         * goes backwards twice
         * small pause
         */
        turbo.setBeak(231, 115, 44);
        turbo.setMove("B", 1, 100);
        turbo.setMove("B", 1, 100);
        turbo.setBeak(0, 0, 0);
        turbo.pause(.1);

        //CRISS CROSS
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("L", 180, 100);
        turbo.setMove("B", 1, 100);
        turbo.setMove("B", 1, 100);
        turbo.setBeak(0, 0, 0);
        turbo.setTurn("R", 90, 100);
        turbo.pause(.3);

        //cha cha real smooth
        turbo.setBeak(231, 115, 44);
        turbo.setMove("Forward", 2, 100);
        turbo.setMove("Backward", 2, 100);
        turbo.setMove("Forward", 2, 100);
        turbo.setMove("Backward", 2, 100);
        turbo.setBeak(0, 0, 0);
        turbo.pause(.7);

    }
}
