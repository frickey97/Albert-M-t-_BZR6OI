package isConsecutiveFour;

public class isConsecutiveFourTest {

    public static boolean isConsecutiveFour(int[] values)
    {
        if(values.length < 4)
            return false;

        int db = 1;

        for (int i = 0; i < values.length - 1; i++) {

            if(values[i] == values[i + 1])
            {
                db++;
            }else
                db = 1;
            if(db == 4)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] tomb = new int[6];

        tomb[0] = 6;
        tomb[1] = 2;
        tomb[2] = 2;
        tomb[3] = 2;
        tomb[4] = 2;
        tomb[5] = 5;

        System.out.println(isConsecutiveFour(tomb));

    }
}
