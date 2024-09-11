public class _7_Inheritance
{
    //INSTANCE VARIABLE THAT ARE OBJECTS OF USER-DEFINED CLASSES
    Banana banana = new Banana("red", 365.2, 115, true, false);
    Grape grape = new Grape("green", 15.6, 15, false, false);
    Raisin raisin = new Raisin("green", 15.6, 15, false, false);

    public _7_Inheritance()
    {

        //Fruit f = new Fruit();


        //Raisin r1 = new Raisin();
        Grape g1 = new Grape("green", 5.3, 7.1, false, true);

        //System.out.println(g1.color + ",  " + g1.avgWeight + ",  " + g1.isFromVine);

        Raisin r1 = new Raisin("brown", 3, 7, false, true);

        //System.out.println(r1.color + ",  " + r1.avgWeight + ",  " + r1.isFromVine + ", " + r1.isDried);

        //Upcasting from Derived class on RHS, and Base class on LHS
        g1 = r1;


        //Downcasting  Base class on RHS and Dervived class on LHS, needs the (parens)
        Raisin r2 = new Raisin(); //g1 is Grape and is a parent of Raisin

        r2 = (Raisin) g1;

        r2.isDried = true;

        System.out.println(r2); //Print will reveal the data type and an address in the heap in hexidecimal form.


        //Fruit f = new Fruit(); Creates an error Abstract classes not instantiable



        /*System.out.println("The banana has an average weight of "+ banana.avgWeight + ".");
        System.out.println("It comes in several colors. This one is "+ banana.color + ".");
        System.out.println("The consumer of a banana will have "+ banana.avgCalories + " calories to burn.");
        System.out.println("It is  "+ banana.isFromTree + " that they are grown from a tree.");*/

    }
}

abstract class Fruit
{
    //INSTANCE VARIABLES FOR INHERITANCE TO ALL CLASSES THAT INHERIT FROM FRUIT
    String color;
    double avgWeight;
    double avgCalories;
    boolean isFromTree;
    boolean isFromVine;

    Fruit()
    {

    }

}




class Banana extends Fruit
{
    Banana(String color, double avgWeight, double avgCalories, boolean isFromTree, boolean isFromVine)
    {
        this.color = color;
        this.avgWeight = avgWeight;
        this.avgCalories = avgCalories;
        this.isFromTree = isFromTree;
        this.isFromVine = isFromVine;
    }
}


class Grape extends Fruit
{
    Grape(String color, double avgWeight, double avgCalories, boolean isFromTree, boolean isFromVine)
    {
        this.color = color;
        this.avgWeight = avgWeight;
        this.avgCalories = avgCalories;
        this.isFromTree = isFromTree;
        this.isFromVine = isFromVine;
    }

    Grape()
    {

    }
}

class Raisin extends Grape
{
    //NEW AND UNIQUE INSTANCE VARIABLES FOR RAISINS ONLY
    boolean isDried = true;

    //NEW AND UNIQUE INSTANCE METHOD FOR RAISINS ONLY
    double getAvgWeight()
    {
        return avgWeight;
    }

    Raisin(String color, double avgWeight, double avgCalories, boolean isFromTree, boolean isFromVine)
    {
        this.color = color;
        this.avgWeight = avgWeight;
        this.avgCalories = avgCalories;
        this.isFromTree = isFromTree;
        this.isFromVine = isFromVine;

    }

    Raisin()
    {
    }
}


