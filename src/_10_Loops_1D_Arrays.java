public class _10_Loops_1D_Arrays
{
    //DECLARATION AND INITIALIZATION
    String[] strArr1 =
            {"Denise", "Jonas", "Valerie", "Mahmoud", "Denise", "Jonas", "Valerie", "Mahmoud"};

    //DECLARATION ONLY
    static String[] strArr2 = new String[4];

    _10_Loops_1D_Arrays() {
        //INITIALIZATION ONLY OF EACH ELEMENT
        strArr2[0] = "Denise";
        strArr2[1] = "Jonas";
        strArr2[2] = "Valerie";
        strArr2[3] = "Mahmoud";

        System.out.println(strArr2[3]);
    }

    void forLoop(String[] strArr1)
    {
        //initialize iterator counter, loop condition, iterator incrementer
        for(int i = 0; i < strArr1.length; i = 1+i )
        {
            System.out.println("Arrived at for loop: " + strArr1[i] + " @ " + i);
        }
    }

    void whileLoop(String[] strArr1)
    {
        int i = 0; //iteration counter
        while (i < strArr1.length) //loop condition
        {
            System.out.println("Arrived at while loop."+ strArr1[i] + "@ " + i);
            i++; //iteration incrementer , usually last line
            //Without this line, the loop will run until the
                 // programs crashes memory limits.
        }


    }

    //Use do/while when at least one iteration must occur.
    void doWhileLoop(String[] strArr1)
    {
        //initializing iteration incrementer
        int i= 0;
        do
        {
            System.out.println("Arrived at while loop."+ strArr1[i] + "@ " + i);
            i++; //increment counter
            //Without this increment line, the loop will run until the programs crashes memory limits.
        }while(i < strArr1.length); //loop condition
    }

    //Enhanced loop, aka foreach loop
    void forEachLoop(String[] strArr2)
    {
        int count = 0;
        for (String name: strArr2)
        {
            System.out.println("Arrived at while loop." + name + "@ " + count++);
        }
    }
}
