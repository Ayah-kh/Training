package HashTables;

import java.util.Arrays;

public class HashFunction {
    String[] theArray;
    int arraySize;
    int itemsInArray=0;

    public static void main(String[] args) {
        HashFunction theFunc=new HashFunction(30);
        String[] elementsToAdd={"1","5","17","21","26"};
        theFunc.hashFunction1(elementsToAdd,theFunc.theArray);

    }

    public void hashFunction1(String[] stringsForArray,String[] theArray){
        for (int i = 0; i < stringsForArray.length; i++) {
            String newElementalVal=stringsForArray[i];
            theArray[Integer.parseInt(newElementalVal)]=newElementalVal;
            
        }
    }

    public HashFunction(int arraySize) {
        this.arraySize = arraySize;
        theArray=new String[arraySize];
        Arrays.fill(theArray,"-1");
    }
}
