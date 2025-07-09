public class Stack extends DynamicArray implements Comparable<Stack>, Xifo<String>, Lifo<String> {

    public int compareTo(Stack other) {
        return this.getOccupancy() - other.getOccupancy(); //SB: this logic compares boths stacks and returns postive/negative or 0 if it's the same.
    } // method compareTo

    public String peek() {
        if (this.getOccupancy() == 0) return null; 
        return this.underlying[this.getOccupancy() - 1]; //SB: this piece should return element at the top of the stack without removal like a "preview"
    } // method peek

    public String pop() {
        if (this.getOccupancy() == 0) return null;
        return this.remove(this.getOccupancy() - 1); //SB: similar to the peek method, this should remove the last element and return the stack
    } // method pop

    public String toString() {
        if (this.getOccupancy() == 0) return "[Empty Stack]"; //SB: outputs string if size equals 0.

    String result = "Top -> "; // SB: pointer to string result
    for (int i = this.getOccupancy() - 1; i >= 0; i--) {
        result += this.underlying[i]; //SB: adds new value to list
        if (i > 0) {
            result += " | "; //SB: separates items (may not be necessary)
        }
    }
    return result;
    } // method toString

    public void push(String e) {
        this.add(e); //SB: adds element to the top of stack
    } // method push

} // class Stack