import java.io.*;
import java.util.*;
/**
 * The benchmarkTest class contains the main method
 * To compare the two sorting algorithms, quicksort and mergesort
 * By using the stopwatch class, and comparing the run times
 * To different arrays to sort
 * @author Ethan Hartfield
 * 10/26/2022 
 */
public class benchmarkTest{
   
   public static void main(String[] args)throws IOException{
        //Create reader to read input from txt file
        BufferedReader f = new BufferedReader(new FileReader("testcases.txt"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int numberOfArrays = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(f.readLine());
        //Create an array of arrays so we can create arrays inside a for loop
        int[][] arrayOfArrays = new int[numberOfArrays][];
        //Populate arrays from txt file
        for(int i = 0; i < numberOfArrays; i++){ 
            int elementsInArray = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(f.readLine());
            arrayOfArrays[i] = new int[elementsInArray];
            for(int j = 0; j < elementsInArray; j++){
                arrayOfArrays[i][j] = Integer.parseInt(st.nextToken());
                st = new StringTokenizer(f.readLine());
            }
        }
        //Clone array so we can sort each one indivdually
        int clone[][] = arrayOfArrays.clone();
        Mergesort m = new Mergesort();
        Quicksort q = new Quicksort();
        Stopwatch clock = new Stopwatch();
        //Print out to console
        System.out.println("Almost sorted array of 10 elements");
        clock.start();
        m.mergesort(arrayOfArrays[0], 0, arrayOfArrays[0].length-1);
        clock.stop();
        System.out.println("Mergesort " + clock.toString());
        clock.start();
        q.quicksort(clone[0], 0, clone[0].length-1);
        clock.stop();
        System.out.println("Quicksort " + clock.toString());
        System.out.println("Randomly sorted array of 10 elements");
        clock.start();
        m.mergesort(arrayOfArrays[1], 0, arrayOfArrays[1].length-1);
        clock.stop();
        System.out.println("Mergesort " + clock.toString());
        clock.start();
        q.quicksort(clone[1], 0, clone[1].length-1);
        clock.stop();
        System.out.println("Quicksort " + clock.toString());
        System.out.println("Almost sorted array of 100 elements");
        clock.start();
        m.mergesort(arrayOfArrays[2], 0, arrayOfArrays[2].length-1);
        clock.stop();
        System.out.println("Mergesort " + clock.toString());
        clock.start();
        q.quicksort(clone[2], 0, clone[2].length-1);
        clock.stop();
        System.out.println("Quicksort " + clock.toString());
        System.out.println("Randomly sorted array of 100 elements");
        clock.start();
        m.mergesort(arrayOfArrays[3], 0, arrayOfArrays[3].length-1);
        clock.stop();
        System.out.println("Mergesort " + clock.toString());
        clock.start();
        q.quicksort(clone[3], 0, clone[3].length-1);
        clock.stop();
        System.out.println("Quicksort " + clock.toString());
        System.out.println("Almost sorted array of 1000 elements");
        clock.start();
        m.mergesort(arrayOfArrays[4], 0, arrayOfArrays[4].length-1);
        clock.stop();
        System.out.println("Mergesort " + clock.toString());
        clock.start();
        q.quicksort(clone[4], 0, clone[4].length-1);
        clock.stop();
        System.out.println("Quicksort " + clock.toString());
        System.out.println("Randomly sorted array of 1000 elements");
        clock.start();
        m.mergesort(arrayOfArrays[5], 0, arrayOfArrays[5].length-1);
        clock.stop();
        System.out.println("Mergesort " + clock.toString());
        clock.start();
        q.quicksort(clone[5], 0, clone[5].length-1);
        clock.stop();
        System.out.println("Quicksort " + clock.toString());
        System.out.println("Almost sorted array of 10000 elements");
        clock.start();
        m.mergesort(arrayOfArrays[6], 0, arrayOfArrays[6].length-1);
        clock.stop();
        System.out.println("Mergesort " + clock.toString());
        clock.start();
        q.quicksort(clone[6], 0, clone[6].length-1);
        clock.stop();
        System.out.println("Quicksort " + clock.toString());
        System.out.println("Randomly sorted array of 10000 elements");
        clock.start();
        m.mergesort(arrayOfArrays[7], 0, arrayOfArrays[7].length-1);
        clock.stop();
        System.out.println("Mergesort " + clock.toString());
        clock.start();
        q.quicksort(clone[7], 0, clone[7].length-1);
        clock.stop();
        System.out.println("Quicksort " + clock.toString());
    }
}
