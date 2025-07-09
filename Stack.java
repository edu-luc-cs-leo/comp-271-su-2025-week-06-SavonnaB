public class Stack extends DynamicArray implements Comparable<Stack>, Xifo<String>, Lifo<String> {

    public int compareTo(Stack other) {
        return this.size() - other.size(); //SB: this logic compares boths stacks and returns postive/negative or 0.
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
        if (this.size() == 0) return "[Empty Stack]"; //SB: outputs string if size equals 0.

    String result = "Top -> "; // SB: pointer to string result
    for (int i = this.size() - 1; i >= 0; i--) {
        result += this.get(i); //SB: adds current item to result
        if (i > 0) {
            result += " | "; //SB: added to separate items (maybe this wasn't neccessary but added it to make output cleaner)
        }
    }
    return result;
    } // method toString

    public void push(String e) {
        this.add(e); //SB: adds element to the top of stack
    } // method push

} // class Stack