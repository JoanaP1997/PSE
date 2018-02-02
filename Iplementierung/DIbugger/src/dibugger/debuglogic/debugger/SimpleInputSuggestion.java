package dibugger.debuglogic.debugger;

import java.util.SplittableRandom;

/**
 * Generates Input Values based on {@linkplain SplittableRandom} pseudorandom
 * number generator.
 * 
 * @author Pascal
 *
 */
public class SimpleInputSuggestion extends InputValueSuggestion {
    private SplittableRandom rand;

    public SimpleInputSuggestion() {
        rand = new SplittableRandom();
    }

    /**
     * Simple suggestion via a pseudorandom number generator
     */
    @Override
    public String suggest(String identifier, String range, int type) {
        int a = 0, b = 0;
        try {
            a = Integer.parseInt(range.substring(1).split(",")[0]);
            b = Integer.parseInt(range.substring(1, range.length() - 1).split(",")[1]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (type == TYPE_BOOLEAN) {
            return "" + rand.nextBoolean();
        } else if (type == TYPE_CHAR) {
            return "" + (char) rand.nextInt(a, b);
        } else if (type == TYPE_DOUBLE) {
            return "" + rand.nextLong(a, b) + "." + generateSizedNumber(rand, 0, 100);
        } else if (type == TYPE_FLOAT) {
            return "" + rand.nextInt(a, b) + "." + generateSizedNumber(rand, 0, 100) + "f";
        } else if (type == TYPE_INT) {
            return "" + rand.nextInt(a, b);
        } else if (type == TYPE_LONG) {
            return "" + rand.nextLong(a, b);
        }
        return "?";
    }

    /**
     * Generates a Number with leading zeros based on the size of b. Examples:
     * 046, 003, 134, ...
     * 
     * @param rand
     *            the RandomNumberGenerator to use
     * @param a
     *            begin of the interval to generate
     * @param b
     *            end of the interval to generate
     * @return String representing a number in the interval [a,b].
     */
    private String generateSizedNumber(SplittableRandom rand, int a, int b) {
        String num = "" + rand.nextInt(a, b);
        for (int i = num.length(); i < ("" + b).length(); ++i) {
            num = "0" + num;
        }
        return num;
    }
}
