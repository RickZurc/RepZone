/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.gud.nuice.m9.very.wellz;

import java.util.Random;

/**
 * Im a banana
 * @author 2160472
 */
public class ApplicationGudNuiceM9VeryWellz {
    static Random randomNum = new Random();

           public static void main(String[] args){
              for(int i=0; i< 5; i++){
                   System.out.println("Random number is : " + genRandom());
              }
           }    // i do wat i want

           public static int genRandom(){
              return randomNum.nextInt(100);
           }
}
//Osama Spin Laden Dropping the beats like the twin towers
//tehreelsupahsand waz here
//https://www.youtube.com/watch?v=22bfsbEhle8