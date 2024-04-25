public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder(); // creates an empty string

        System.out.println("Initial String: " + string);
        //append to the String. return new StringBuilder
        // you can append a string or int or any datatype value (it will convert to string and appends)
        System.out.println("Appended String: " + string.append("ABCD!"));

        //charAt(idx) to get char at specific index. 0 based index
        System.out.println("charAt: " + string.charAt(3));

        //length
        System.out.println("Length: " + string.length());

        // Insert a character at an index. return a StringBuilder
        System.out.println(" Insert: " + string.insert(1, "SAI")); // at index 1 insert SAI so now the String will be ASAIBCD!

        //Replace a specific string. replaces the give string from the start idx to end idx(exclusive)
        // it will throw an StringIndexOutOfBoundException if start or end index is greater than the string length
        System.out.println("Replace: " + string.replace(1, 4, "SRIRAM VUNDAVALLI"));

        //reverse
        System.out.println("Reverse: " + string.reverse());

        //substring
        // if you give only start idx then it will give substring from start to length
        // if you give start and end idx it will give you substring from start to end (exclusive)
        // it will throw an StringIndexOutOfBoundException if start or end index is greater than the string length
        System.out.println("Substring from 5 - 13 " + string.substring(5, 13));

        //delete deletes the string from start to end and returns the resulted string by removing the value from the index range
        System.out.println("Delete: " + string.delete(3, 12));

        //deleteCharAt()
        System.out.println("DeleteCharAt(): " + string.deleteCharAt(4));

        // indexOf(char, fromIdx). returns the idx if preset or else return -1
        System.out.println("indexOf: " + string.indexOf("A"));
        System.out.println("indexOf from idx: " + string.indexOf("A", 10));

        //lastIndexOf() same as indexOf()
        System.out.println("lastIndexOf: " + string.lastIndexOf("A"));

        //compareTo()
        System.out.println("compareTo: " + string.compareTo(new StringBuilder("ASDFGHJ")));
    }
}
