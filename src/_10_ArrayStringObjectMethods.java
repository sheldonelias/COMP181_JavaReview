import java.util.Arrays;
public class _10_ArrayStringObjectMethods
{
    public _10_ArrayStringObjectMethods()
    {
        objectMethodEqualityCheck();
        stringMethodIndexOf();
        arrayMethodSort();
    }

    public void objectMethodEqualityCheck()
    {
        String a = new String("hello");
        String b = new String("hello");

        System.out.println("two wrapper objects" + a == b);

        a = "hello";
        b = "hello";

        System.out.println("two string primatives" + a == b);
    }

    public void stringMethodIndexOf()
    {
        String str = "A most perfect day.";

        //finding the index position of the first letter
        //of a substring.
        System.out.println(str.indexOf("day"));

        //finding the index position of the first letter
        //of a character.
        System.out.println(str.indexOf('m'));
    }

    public void arrayMethodSort()
    {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };

        Arrays.sort(arr, 0, arr.length);

        System.out.println("\nThe sorted array is: ");

        for (int num : arr) //using foreach loop
        {
            System.out.print(num + " ");
        }

    }

}
