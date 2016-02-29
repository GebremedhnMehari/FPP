package programmingAss4;

/*public class DivideSort {
	public String divideSort(String s){
		int m=s.length()/2;
		if(s.length()==0||s.length()==1)
			return s;
		else
			
			divideSort(s.substring(0, m));
			divideSort(s.substring(m, s.length()));
	}
	public static void main(String args[]) {
		DivideSort input = new DivideSort();

}
}*/
//package com.java2novice.sorting;

public class DivideSort {
     
	public static void main(String args[]) {
		DivideSort input = new DivideSort();
		input.divideSort("calculate");
    }	
     
   /* public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        divideSort(0, length - 1);
    }*/
	 public void sort(String s) {
    this.s = s;
    this.length = s.length;
    char[] c = s.toCharArray();
    this.tempMergArr = new int[length];
    divideSort(0, length - 1);
}
 
    private void divideSort(String s) {
        
    	int lowerIndex=0;
    	int higherIndex=s.length();
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            divideSort(s.substring(0, middle));
            // Below step sorts the right side of the array
            divideSort(s.substring(middle+1));
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }
}
