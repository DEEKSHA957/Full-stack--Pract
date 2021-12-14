
import java.util.*;

class ArrayInt {

    public static void main(String[] args)
    {

        ArrayList<Integer> arrli
            = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++)
            arrli.add(i);

        System.out.println(arrli);
        arrli.remove(3);
        System.out.println(arrli);
    }
}
