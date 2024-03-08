import java.util.ArrayList;

public class _11A_ArrayLists_Generics
{
    //TODO: Declare and Initialize a static ArrayList of type String (uses generics) called "cityNames"
    //Set size to 5
    static ArrayList<String> cityNames = new ArrayList<String>(5);

    static ArrayList<Integer> integerArrayList = new ArrayList<>(5);

    public _11A_ArrayLists_Generics()
    {
        //TODO: Manually initialize cityNames with three city names.

        cityNames.add("Anchorage");
        cityNames.add("Buenos Aires");
        cityNames.add("Delhi");

        //TODO: Call addTwoMoreCities() and give it two parameters of two more city names
        addTwoMoreCities("New York City", "Seattle");

        //TODO: Print the progress
        //printAllMembersArrayList(cityNames);

        //TODO: Manually add one more, a 6th city name to prove that you can overflow the size
        cityNames.add("Encinitas");


        //TODO: Insert another city name using the set() method. Put the new city name in position 3

        cityNames.add(2,"Las Cruces");


        //TODO: Remove a city name in the new position 3
        cityNames.remove(2);
        findAndRemoveByValue("Buenos Aires");

        //printAllMembersArrayList(cityNames);

        //TODO: Fill Integer ArrayList<Integer> numList
        for(int i=0; i < 5; i++)
        {
            integerArrayList.add(i*10);
        }

        //Print contents of integerArrayList
        for(int i : integerArrayList)
        {
            System.out.println(i);
        }

        //TODO: Remove an Integer from numList using
        findAndRemoveByIntWrapperValue(10);
        //Print contents again of integerArrayList
        for(int i : integerArrayList)
        {
            System.out.println(i);
        }


    }

    public void findAndRemoveByValue(String value)
    {
        //System.out.println("findAndRemoveByValue() active.");
        for(int i = cityNames.size()-1; i > -1; --i)
        {
            //System.out.println("In loop.");

            if(cityNames.get(i).equals(value) )
            {
                //System.out.println("Found item to remove.");
                cityNames.remove(i);
                break;
            }
        }
    }

    //TODO: Make this over the break
    public void findAndRemoveByIntWrapperValue(Integer integer)
    {
        // FROM A WEB SOURCE
        // This makes a call to remove(Object) and
        // removes element with value of 1
        // al.remove(Integer.valueOf(1));

        integerArrayList.remove(Integer.valueOf(integer));

    }

    public void addTwoMoreCities(String cityName1, String cityName2)
    {
        //TODO: Add five city names where you have visited

        cityNames.add(cityName1);
        cityNames.add(cityName2);


    }

    //TODO: Make a method that prints an ArrayList parameter

    public void printAllMembersArrayList(ArrayList<String> al)
    {
        //TODO enhanced for-loop
        for(String city: cityNames)
        {
            System.out.println(city);
        }

    }

    //TODO: Make a method that searches for a city name in the static cityNames ArrayList



}
