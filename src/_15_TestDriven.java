public class _15_TestDriven
{
    public static void test()
    {
        System.out.println(absValIntTest());
    }
    public static String absValIntTest()
    {
        String result = "Unexpected error";
        if (absValInt(-1) >= 0)
        {
            result = "Pass";
        } else
            result = "Expected error";
        return result;
    }
    public static int absValInt(int i)
    {
        //Notice the preset result is set to error val -1
        int result = -1;
        //result = Math.abs(i);
        return result;
    }

}
