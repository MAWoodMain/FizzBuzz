/**
 * FizzBuzz
 * Created by Matthew W on 31/07/17.
 */
public class Main
{
    public static void main(String[] args)
    {
        FizzBuzz fb = new FizzBuzz();
        // add the mappings to the object, the order doesn't matter
        fb.addWord(3,"Fizz");
        fb.addWord(5,"Buzz");
        fb.addWord(15,"FizzBuzz");

        // process 1 -> 100
        String[] output = fb.process(1,100);
        // output the result
        for(String o:output) System.out.println(o);
    }
}
