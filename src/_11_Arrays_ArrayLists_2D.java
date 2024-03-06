import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*

    1) Covered initializing, accessing and modifying 1d and 2d arrays
    2) Covered initializing, accessing and modifying 1d arrayLists
    3) Covered converting arrays into arraylists using List as an intermediary Abstract (parent/base) class

 */

//Suit enum
enum Suit
{
    Hearts, Clubs, Diamonds, Spades //Notice: NO quotation marks!
}

//Rank enum
enum Rank
{
    //enums cannot use integer values as first character, so use underscore _1
    _2, _3, _4, _5, _6, _7, _8, _9, _10, _J, _Q, _K, _A
}


public class _11_Arrays_ArrayLists_2D
{

    //INSTANCE VARIABLES INITIALIZATION AND DECLARATION
    //ARRAYS USED AS STRUCTURAL REFERENCE
    //These arrays will be used later when we create an array of cards in Deck class.
    static String[] suits = { "Hearts", "Clubs", "Diamonds", "Spades"};
    static String[] ranks = { "_2", "_3", "_4", "_5", "_6", "_7", "_8", "_9", "_10", "_J", "_Q", "_K", "_A" };


    _11_Arrays_ArrayLists_2D()
    {
        //TODO: DECLARE AND INITIALIZE IN ONE STATEMENT AN ARRAY OF STRING CARDS
        //Choose any 5 cards and make an array of string cards using the two arrays of suits and ranks

        //This one starts your hand with 1 card. Add more cards so that they total five
        String[] handArrStr = { suits[0] + ranks[12], suits[0] + ranks[12], suits[0] + ranks[12], suits[0] + ranks[12]} ;
        //This prints your progress
        //printStrArray1d(handArrStr);


        //TODO: DECLARE AND INITIALIZE IN ONE STATEMENT AN ARRAY OF ENUM CARDS
        //Choose any 5 cards and make an array of string cards using the two arrays of suits and ranks

        //This one starts your hand with 1 card. Add more cards so that they total five
        String[] handArrEnum = { Suit.values()[1].toString() + Rank.values()[12].toString()} ;

        Suit mySuit = Suit.Diamonds;
        Rank myRank = Rank._K;
        //System.out.println(mySuit.toString() + myRank.toString());

        //This prints your progress
        //printStrArray1d(handArrEnum);

        //TODO: DECLARE AND INITIALIZE A 2D ARRAY OF CARDS 3 rows, 3 columns
        String[][] handArr2d =
            {       //columns are comma-separated inside each row
                    { suits[3] + ranks[12], suits[3] + ranks[12], suits[3] + ranks[12]  }, //row 1, index 0
                    { suits[3] + ranks[12], suits[2] + ranks[0], suits[3] + ranks[12]  }, //row 2, index 1
                    { suits[3] + ranks[12], suits[3] + ranks[12] , suits[3] + ranks[12] }  //row 3, index 2
            };

        handArr2d[1][1] = "CHANGED";

        System.out.println(handArr2d[1][1]);

        printStrArray2d(handArr2d);

        //findCardInStrArray2d(handArr2d, "_2", "Diamonds");

        //TODO: DECLARE AND INITIALIZE IN ONE STATEMENT AN ARRAYLIST OF STRING CARDS NON-GENERIC
        //Choose any 5 cards and make an arrayList of string cards using the two arrays of suits and ranks

        //Declares a non-generic ArrayList
        ArrayList handArrList = new ArrayList();

        //This one starts your hand with 1 card.
        handArrList.add(suits[1] + ranks[0]);
        handArrList.add(5);
        handArrList.add('z');
        handArrList.add(true);


        //This prints your progress
        //printStrArrayList1d(handArrList);

        //TODO: DECLARE AND INITIALIZE IN ONE STATEMENT AN ARRAYLIST OF STRING CARDS USING GENERICS
        //Choose any 5 cards and make an arrayList of string cards using the two arrays of suits and ranks

        //Declares a generic ArrayList
        ArrayList<String> handArrListGen = new ArrayList<String>();

        //This one starts your hand with 1 card.
        handArrListGen.add(suits[2] + ranks[0]);
        handArrListGen.add(suits[3] + ranks[0]);
        handArrListGen.add(suits[0] + ranks[0]);

        //This prints your progress
        //printStrArrayList1dGen(handArrListGen);

        //System.out.println("\n - - - \n" + handArrListGen.get(0) + "\n");

        //This prints your progress
        //printStrArrayList1dGen(handArrListGen);


        //TODO: SEND AN ARRAYLIST OF GENERIC TYPE FOR SORTING
        //System.out.println( sortStrArrayList1dGen( handArrListGen ) ); //direclty prints arrayList
        //printStrArrayList1dGen(handArrListGen); //printing through method

        //TODO: DISCARD (REMOVE) ONE STRING CARD FROM ANY ARRAYLIST
        //handArrListGen.remove(0);

        //TODO: SET A NEW CARD WHERE AN OLD CARD WAS IN ANY ARRAYLIST
        //Changes value in an ArrayList, sets to the end, replacing last card
        //handArrListGen.set(handArrListGen.size()-1, suits[0] + ranks[1]); //sets to change last card
        //handArrListGen.set(0, suits[0] + ranks[1]); //sets to change first card

        //TODO: CONVERTS THE STRING ARRAY TO LIST GENERIC
        List<String>  handStrList = Arrays.asList(  handArrStr );
        //printList1dGen(handStrList);

        //TODO: CONVERTS THE STRING ARRAY TO ARRAYLIST GENERIC
        ArrayList<String>  handStrArrList = new ArrayList<String>( Arrays.asList(handArrStr) );
        //printList1dGen(handStrArrList);


    }

    //Prints an array of String
    void printStrArray1d(String[] strArr1d)
    {
        //Enhanced for-loop, like python item in list
        for(String strItem: strArr1d)
        {
            System.out.println(strItem);
        }
    }

    //TODO: COMPLETE THE METHOD TO PRINT THE 2D ARRAY
    //You need a nested loop that uses the length property of an array
    //Prints an array of String
    void printStrArray2d(String[][] strArr2d)
    {
        int count = 0;
        //to print a 2d array we need nested for-loop
        for(int i = 0; i < 3; ++i)
        {
            for(int j = 0; j < 3; ++j)
            {
                System.out.println(count + ": " + strArr2d[i][j]);
                ++count;
            }
        }
    }


    //TODO: MAKE METHOD TO SEARCH A DESIRED IN GIVEN ARRAY
    //You need a nested loop that uses the length property of an array
    //Prints an array of String
    void findCardInStrArray2d(String[][] strArr2d, String rnk, String sut)
    {
        int count = 0;
        //to print a 2d array we need nested for-loop
        boolean isLooping = true;
        for(int i = 0; i < 3 && isLooping == true; ++i)
        {
            for(int j = 0; j < 3 && isLooping == true; ++j)
            {
                if(  (sut + rnk).equals( strArr2d[i][j] )  )
                {
                    System.out.println("Your card is count: " + count + " at i: " + i + ", j: " + j + ": " + strArr2d[i][j]);
                    isLooping = false;
                } else
                {
                    System.out.println(sut + rnk);
                    System.out.println(count + " at i: " + i + ", j:" + j + ": " + strArr2d[i][j]);
                }

                ++count;
            }
        }
    }

    //TODO: COMPLETE THE METHOD TO PRINT THE 2D ARRAYLIST

    //Prints an arrayList of unknown type non-generic
    void printStrArrayList1d(ArrayList strArrList1d)
    {
        for(Object obj: strArrList1d)
        {
            System.out.println( obj );
        }
    }


    //Prints an arrayList of unknown type
    void printStrArrayList1dGen(ArrayList<String> strArrList1dGen)
    {
        System.out.println(" -- -- --");
        for(String str: strArrList1dGen)
        {
            System.out.println(str);
        }
    }

    //Prints an arrayList of String type
    ArrayList<String> sortStrArrayList1dGen(ArrayList<String> strArrList1dGen)
    {
        System.out.println(" -- Sorted --");
        Collections.sort(  strArrList1dGen  );

        return strArrList1dGen;
    }

    //Prints a List of String type
    void printList1dGen(ArrayList<String> strList)
    {
        System.out.println("-- printList1dGen() active --");
        for(String str: strList)
        {
            System.out.println(str);
        }
    }



}
