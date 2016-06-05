class MergeApp {
    public static void main(String[] args) {
        int[] arrayA = {23, 47, 81, 95};
        int[] arrayB = {7, 14, 39, 55, 62, 74};
        int[] arrayC = new int[10];

        merge(arrayA, 4, arrayB, 6, arrayC);
        display(arrayC, 10);
    }

//-------------------------------------------------------

    public static void merge(int[] arrayA, int SizeA, int[] arrayB, int SizeB, int[] arrayC) {
        int aDex=0, bDex=0, cDex=0;

        while(aDex < SizeA && bDex < SizeB)      //while neither arrays are empty
            if(arrayA[aDex] < arrayB[bDex])      //if arrayA is less than arrayB
                arrayC[cDex++] = arrayA[aDex++]; //arrayC will take elem of  arrayA
            else                                 //if arrayA is greater than B
                arrayC[cDex++] = arrayB[bDex++]; //arrayC will take elem of arrayB
        while (aDex < SizeA)                     //while arrayB is empty
            arrayC[cDex++] = arrayA[aDex++];     //but arrayA isnt empty????
        
        while(bDex < SizeB)
            arrayC[cDex++] = arrayB[bDex++];
    }

//---------------------------------------------------------

    public static void display(int[] theArray, int size) {
        for(int j=0; j<size; j++)
            System.out.print(theArray[j] + " ");
        System.out.println("");
    }
}

