public class test3 {
    //main method
    public static void main(String[] args) {
        String[] A = new String[5];
        A[0] = "a";
        A[1] = "aa";
        A[2] = "aaa";
        A[3] = "aaaa";
        A[4] = "aaaaa";
        String s = "abcde";
        String a = stringSearch(A, s);
        System.out.println(a);
        
    } //end main method
    
    public static String stringSearch(String[] A, String s) {
        int first = 0; 
        int last = A.length - 1;
        
        int length = s.length();
        
        while(first <= last) {
            int middle = first + (last - first) / 2;
            if(A[middle].length() == length) {
                return A[middle];
            }
            if(A[middle].length() < length) {
                last = middle - 1;
            }
            if(A[middle].length() > length) {
                first = middle + 1;
            }
            middle = (first + last) / 2;
        }
        System.out.println("A string of length " + length + " could not be found." );
        return " ";
    }
    
    
}