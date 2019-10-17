
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0273898
 */
public class Ch11Arrays {
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        final int ARRAY_SIZE = 6;  //diff format, either would work
        
        int[] numbers = new int[6];
        
        for (int i=0;i<6;i++) {
            numbers[i] = rand.nextInt();
    }
        int[] days = { 1, 2, 3, 4, 5 };
        
        float[] otherNumbers = { 1.1F, 2.4F };
        int arrayLength = otherNumbers.length;
        
        int[] playerScores = {0,0,0,0,0};
        playerScores[0]++;
        
        int bigNumber = rand.nextInt();
        if(bigNumber < 0) {
            bigNumber *=-1;
        }
        
        int[] bigArray = new int[rand.nextInt()]
        
        for (int i=0;i<bigArray.length; i++)
        {
            bigArray[i] = rand.nextInt();
            System.out.println(bigArray)
        }
            }
}
