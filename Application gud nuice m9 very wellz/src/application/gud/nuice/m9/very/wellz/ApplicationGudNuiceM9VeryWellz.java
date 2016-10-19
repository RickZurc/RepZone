/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.gud.nuice.m9.very.wellz;

import java.util.Random;

/**
 *
 * @author 2160472
 */
public class ApplicationGudNuiceM9VeryWellz {
    static Random randomNum = new Random();

           public static void main(String[] args){
              for(int i=0; i< 5; i++){
                   System.out.println("Random number is : " + genRandom());
              }
           }

           public static int genRandom(){
              return randomNum.nextInt(100);
           }
}
