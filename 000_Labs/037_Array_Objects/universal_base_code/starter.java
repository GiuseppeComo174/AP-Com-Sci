/*
 *	Author:  Giuseppe Como
 *  Date: 11/14/2024
*/

import pkg.*;
import java.util.*;

class starter {
    public static void main(String args[]) {
        int i = 0;
        int q = 0;
        Wizard[] x = new Wizard[100];
        Warrior[] y = new Warrior[100];

        for(i = 0; i < x.length; i++) {
            x[i] = new Wizard();
        }
        
        for(q = 0; q < y.length; q++) {
            y[q] = new Warrior();
        }
        
        while(true) {
            int wiz = 100;  
            int war = 100;
            int a = (int)(Math.random() * 20) + 1;
            int b = (int)(Math.random() * 2);
            for(int e = 0; e < y.length; e++) {
                if(!y[e].isDead()) {
                    war--;
                }
            }
            for(int e = 0; e < x.length; e++) {
                if(!x[e].isDead()) {
                    wiz--;
                }
            }
            if(b == 0) {
                System.out.println("Wizards won with " + a + " wizards left!");
                break;
            }
            if(b == 1) {
                System.out.println("Warriors won with " + a + " warriors left!");
                break;
            }
            if(i >= x.length || q >= y.length) {
                break;  
            }
            boolean h = x[i].isDead();  
            boolean o = y[q].isDead();  
            x[i].attack(y[q]);
            if(o) {
                while (q < y.length && y[q].isDead()) {
                    q++;
                }
            }
            y[q].attack(x[i]);
            if(h) {
                while (i < x.length && x[i].isDead()) {
                    i++;
                }
            }
            if(o) {
                q++;
            }
            if(h) {
                i++;
            }
        }
    }
}
