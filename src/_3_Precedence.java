public class _3_Precedence
{
    //Variables here

    int x = 1, y = 2, z = 3;

    public _3_Precedence()
    {
        //What kind of value with this return? What is the value?
        System.out.println(x + y < y - z * -2);

        //Notice the breakdown
        System.out.println("lhs: " + (x + y));
        System.out.println("rhs: " + (y - z * -2));

        //Using PEUMDAS
        //Imposing parenthesis that duplicate precedence
        System.out.println((x + y) < (y - (z * (-2))) );

        //Notice the difference if parenethesis is positioned differently
        System.out.println(x + y < (y - z) * -2);

    }

    //Methods here

}
