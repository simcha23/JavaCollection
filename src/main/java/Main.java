import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        int x;
        Deque<Integer> qeu = new ArrayDeque<>();

        // Adding elements to the queue
        qeu.add(4);
        qeu.add(3);
        qeu.add(2);
        qeu.add(6);
        qeu.add(8);
        qeu.add(7);
        qeu.add(3);
        qeu.add(1);
        qeu.add(4);

        Iterator value = qeu.iterator();

        int highestUniqueNumber = 0; // Initialise the highest unique number

        while (value.hasNext()) {

            int arraySize = 3;

            int[] intArray = new int[qeu.size()];
            Object[] object = qeu.toArray();

            for(int i = 0; i < object.length; i ++){
                intArray[i] = (int)object[i]; // It converts queue elements from object to int
            }

            if(!(qeu.size() < arraySize) ){
                x = arraySize;
                for(int i= 0; i < arraySize; i++){ // It is getting unique numbers unique numbers
                    if(i != 0) {
                        if (intArray[0] == intArray[i] || intArray[arraySize-1] == intArray[(arraySize-1)-i] ) {
                            x = x - 1; // Its subtracting 1 from arraySize only if the numbers are equal

                        }
                    }
                    System.out.print(intArray[i]); // It is printing number sets
                }
                System.out.println(" "+x); // It is printing the unique number

                if(highestUniqueNumber <= x){ //It is getting the highest unique number
                    highestUniqueNumber = x;
                }

            }

            if(qeu.poll() == null){ // It is removing the first element from the queue until the que is empty
                break;
            }
        }
        System.out.println("-----------------------------");
        System.out.println("Highest unique number : "+ highestUniqueNumber);// Print the highest unique number
        System.out.println("-----------------------------");

    }
}