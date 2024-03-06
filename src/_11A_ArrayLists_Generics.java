import java.util.ArrayList;

public class _11A_ArrayLists_Generics
{
    //TODO: Declare and Initialize a static ArrayList of type String (uses generics) called "cityNames"
    //Set size to 5
    static ArrayList<String> cityNames = new ArrayList<String>(5);

    public _11A_ArrayLists_Generics()
    {
        //TODO: Manually initialize cityNames with three city names.

        cityNames.add("Anchorage");
        cityNames.add("Buenos Aires");
        cityNames.add("Delhi");

        //TODO: Call addTwoMoreCities() and give it two parameters of two more city names
        addTwoMoreCities("New York City", "Seattle");

        //TODO: Print the progress
        printAllMembersArrayList(cityNames);

        //TODO: Manually add one more, a 6th city name to prove that you can overflow the size


        //TODO: Insert another city name using the set() method. Put the new city name in position 3


        //TODO: Remove a city name in the new position 3

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
