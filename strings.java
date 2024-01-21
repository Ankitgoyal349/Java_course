public class strings {
    public static void main(String[] args) {

        // Concatenation of 2 strings :- using + operator

        // String name1 = "Tony";
        // String name2 = "Stark";
        // String Full_Name = name1+" "+ name2;
        // System.out.println(Full_Name);


        // length of given string :-  using .length function

        // String a ="ankit goyal ";
        // System.out.println(a.length());


        // Iteration of given string:- USing function charAt

        // String name = "Ankit goyal";
        // for(int i=0; i<name.length(); i++){
        //     System.out.println(name.charAt(i));
        // }

        /*  Comparison of 2 strings :- usinng compareTo function. 
        a>A (Small alphabets like a-z > Capital alphabets like A-Z) The reason behind is Ascii value of a is 97 and Ascii value of A is 65. */

        /*  key points:- 1. if string 1 > string 2 then compiler gives +ve value that can be anything.
        2. if string 1 < string 2 then compiler gives -ve value that can be anything.
        3. if string 1 = string 2 then compiler gives zero. */

        // String a ="ANkit";
        // String b ="ANKit";
        // System.out.println(a.compareTo(b));


        // Substring of a string:-

        // String sentence = "My name is Ankit";
        // System.out.println(sentence.substring(11));


        // Conversion of string like any number that we put inside string that is "123" to integer(123) :- 

        // String str = "1235";
        // int number = Integer.parseInt(str);
        // System.out.println(number);

        // Conversion of number like (123) to string ('123'):- 

        // int number = 125446543;
        // String str = Integer.toString(number);
        // System.out.println(str.length());
    }
}
