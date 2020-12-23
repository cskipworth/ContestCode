//This code is an in-class, collaborative remake of some crucial ArrayList functions in java.


import java.util.Arrays;

//This class will use generic type so that it may be used for lists of any type.
public class DSArrayList<E> {
    // Fields:
    // The backing array of generic type:
    private E a[];
    // Count for number of items in the list:
    private int length;
   // NOTE: this is NOT the same as number of available slots/index size of list.

   //Returns the length field of a referenced DSArrayList.
    public int getLength() {
        return length;
    }

    //Gives length field of referenced DSArrayList a new value.
    public void setLength(int length) {
        this.length = length;
    }
    
    // Constructors:
    // Sets default list at size 5
    public DSArrayList() {
        this(5);
    }

    // Constructor that designates input as initial size of available slots/index
    // size of list.
    public DSArrayList(int initial_size) {
        a = (E[]) (new Object[initial_size]);
        this.setLength(0);
    }

    //Method that adds a value onto end of current items in DSArrayList.
     
 }
