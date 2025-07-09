# Week 05 reflection
Last week my solutions came out quite different than the class resolution, however I believe the output would be the same.
I did not include this part of the solution in my own:

// Constants to be used in toString
    private static final String EMPTY_ARRAY = "The underlying array is empty.";
    private static final String FMT_HEADER = "Underlying array occupancy/length: %d/%d.\n[ %s";
    private static final String FMT_ELEMENT = ", %s";
    private static final String FMT_FOOTER = " ]";

Also my solution's indexOf String method was placed a little later in the file but didn't seem to affect the program being able to run.
My solution for overloaded remove method and the String toString method was very close to the solution given:

## My Solution 
public String remove(String string) {
        int index = indexOf(string);
        if (index == -1) {
            return null;
         }//SB: returns empty and returns removed index. Maybe redundant I could've just left it null possibly.
        return remove(index);
    }

    /** Complete this method */
    public String toString() {
    if (this.occupancy == 0) return "[Add New Guest]"; //SB: being honest I had to look this one up, I didn't really know what to put here

    StringBuilder sb = new StringBuilder("New Guest"); //SB: keeping with hotel theme looked Stringbuilder to modify strings for loop iterations.
    for (int i = 0; i < this.occupancy; i++) {
        sb.append(this.underlying[i]);
        if (i < this.occupancy - 1) {
            sb.append(", ");
        }
    }
    sb.append("Welcome!"); //SB: attaches to string output. Need to practice with this logic more.
    return sb.toString();
    }
}
 // class DynamicArray

 The main difference it seems was the use of header in the solution code versus mine.
 Overall, I do recall the code passing the tests, however it could be the case that my solution was closer than I thought just with less remarks added so I
 couldn't really tell. Professor's solution seems a bit more thought out with the headings and logic whereas mine comes across a little less thoughtful in build.