import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 * FizzBuzz
 * Created by Matthew W on 31/07/17.
 */
public class FizzBuzz
{
    private final HashMap<Integer, String> modWords;

    FizzBuzz()
    {
        modWords = new HashMap<>();
    }

    void addWord(int mod, String word)
    {
        modWords.put(mod,word);
    }

    String[] process(int min, int max)
    {
        // validate input
        if(min > max) throw new IllegalArgumentException();

        // prepare collection of mods in ascending order
        final ArrayList<Integer> mods = new ArrayList<>();
        mods.addAll(modWords.keySet());
        Collections.sort(mods);

        // prepare output array
        final String[] output = new String[1 + (max - min)];

        // perform operation and store result
        for(int i = min; i<=max; i++) output[i - min] = process(i, mods);

        return output;
    }

    private String process(int value, Collection<Integer> mods)
    {
        // put the number as the output
        String output = String.valueOf(value);
        for(int mod:mods)
        {
            // if it is a multiple of mod, replace its output with the keyword
            if(value % mod == 0) output = modWords.get(mod);
        }
        // the most recent multiple will be in there so if the number has multiple factors
        // the largest is used eg 15 = 3 * 5 = 15 * 1 so it will be Fizz then Buzz then FizzBuzz
        return output;
    }
}
