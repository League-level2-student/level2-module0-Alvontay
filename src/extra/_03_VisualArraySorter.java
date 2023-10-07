package extra;

import java.util.Random;

import processing.core.PApplet;

public class _03_VisualArraySorter extends PApplet {
    static final int WIDTH = 500;
    static final int HEIGHT = 500;
    
    int[] intArray;
    Random r = new Random();
    
    @Override
    public void settings() {
    	size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        intArray = new int[50];
        
        for (int i = 0; i < intArray.length; i++) {
        	intArray[i] = r.nextInt(HEIGHT);
        }      
        noStroke();
    }
    
    public void mousePressed() {
    	for (int i = 0; i < intArray.length; i++) {
        	intArray[i] = r.nextInt(HEIGHT);
        }  
    }
    

    @Override
    public void draw() {
        background(20,30,40);

        for( int i = 0; i < intArray.length; i++) {
        	rect(i*WIDTH/intArray.length,HEIGHT, WIDTH/intArray.length,-intArray[i]);
//            fill(r.nextInt(25) + 25,r.nextInt(25) + 25,r.nextInt(25) + 25);
        	fill(35,45,55);
        }
        stepSort(intArray);
    }

    static public void main(String[] passedArgs) {
        PApplet.main(_03_VisualArraySorter.class.getName());
    }
    
    /*********************** DO NOT MODIFY THE CODE BELOW ********************/
    
    int startIndex = 1;

    void stepSort(int[] arr) {
      for (int i = startIndex; i < arr.length; i++) {
        if (arr[i - 1] > arr[i]) {
          int t = arr[i];
          arr[i] = arr[i - 1];
          arr[i - 1] = t;

          startIndex = i;
          return;
        }
      }
      startIndex = 1;
    }
}
