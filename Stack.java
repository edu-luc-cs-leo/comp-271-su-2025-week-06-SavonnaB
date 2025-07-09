public class Stack extends DynamicArray implements Comparable<Stack>, Xifo<String>, Lifo<String> {

    public int compareTo(Stack other) {
        return -1234;
    } // method compareTo

    public String peek() {
        if (this.size() == 0 ) return null; 
        return this.get(this.size() - 1); //SB: this piece should return element at the top of the stack without removal like a "preview"
    } // method peek

    public String pop() {
        if (this.size() == 0) return null;
        return this.remove(this.size() - 1); //SB: similar to the peek method, this should remove the last element and return the stack
    } // method pop

    public String toString() {
        return null;
    } // method toString

    public void push(String e) {
        this.add(e); //SB: adds element to the top of stack
    } // method push

} // class Stack