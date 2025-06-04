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
        turbo.setMove("Forward", 2, 100);
        turbo.setMove("Backward", 2, 100);
        turbo.setBeak(0, 0, 0);
        turbo.pause(.9);

        // TO THE LEFT
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
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("R", 30, 100);
        turbo.setBeak(0, 0, 0);

        // TO THE LEFT
        turbo.setBeak(231, 115, 44);
        turbo.setTurn("L", 120, 100);
        turbo.setBeak(0, 0, 0);
        turbo.setTurn("R", 90, 100);

        //TAKE IT BACK NOW YALL
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

        //CRISS CROSS
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
