public class Queue extends DynamicArray implements Comparable<Queue>, Xifo<String>, Fifo<String> {

    public int compareTo(Queue other) {
        return -1234;
    } // method compareTo

    public String peek() {
       if (this.getOccupancy() == 0) return null;
       return this.underlying[0];
    } // method peek

    public String pop() {
       if (this.getOccupancy() == 0) return null;
       return this.remove(0);
    } // method pop

    public String toString() {
        if (this.getOccupancy() == 0) return "[Empty Queue]";
    String result = "Front -> "; //SB: pushes current to the front on the lines
    for (int i = 0; i < this.getOccupancy(); i++) {
        result += this.underlying[i];
        if (i < this.getOccupancy() - 1) {
            result += " | ";
        }
    }
    return result;
    } // method toString //SB: all items in this class for the most part mimic the structure of the Stack.java file because it's just an extension and operates similarly.

} // class Queue