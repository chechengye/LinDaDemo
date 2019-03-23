package com.example.demo;

/**
 *     *
 *    **
 *   ***
 *  ****
 * *****
 *     A
 *    BBB
 *   CCCCC
 *  DDDDDDD
 * EEEEEEEEE
 */
public class Demo_01 {

    public static void main(String[] args) {
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 5 ; j>= 1 ; j--){
                if(j <= i ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
