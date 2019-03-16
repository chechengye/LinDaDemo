package com.entity;

//1,3,5,4,2,3


import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        int[] a = {3,5,4,2,3,3};
        //第一步数组排序
        sortArray(a);
        System.out.println(Arrays.toString(a));
        //第二步
        boolean isTwoExist = false;
        int[] sq = new int[a.length - 2];
        int index = -1;

        for(int i = 0 ; i < a.length -1; i++){
            if(a[i] == a[i+1]){
                isTwoExist = true;
                index = i;
                break;
            }
        }

        for(int i = 0 , j = 0; i< a.length ; i++){
            if(i != index && i != index +1){
                sq[j ++] = a[i];
            }
        }

        System.out.println(Arrays.toString(sq));

        //第三步判断是否为顺子
        if(isSq(sq) && isTwoExist){
            System.out.println("是，顺子加一对！");
        }else{
            System.out.println("不是，顺子加一对！");
        }

    }

    /**
     * 数组排序
     */
    private static void sortArray(int[] a){
        //冒泡排序
        //3,5,4,2,3,1
        //1,5,4,3,3,2 //第一轮
        //1,2,5,4,3,3//第二轮
        //1,2,3,5,4,3 //第三轮
        //1,2,3,3,5,4//第四轮
        //1,2,3,3,4,5 //第五轮
        for (int i = 0; i < a.length; i++) {
            for(int j = i + 1 ; j< a.length ; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

    }

    /**
     * 判断顺子的方法
     */

    private static boolean isSq(int[] sq){
        for(int i = 0 ; i< sq.length - 1; i++){
            if(sq[i+1] - sq[i] != 1){
                return false;
            }
        }
        return true;
    }

}
