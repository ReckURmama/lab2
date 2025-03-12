package edu.canisius.cyb.cyb600.lab2;

import edu.canisius.cyb.cyb600.lab2.exceptions.NotADogException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Task1 {

    /**
     * Takes in a string and returns a List of characters (starting at 0, of course) for each character in that String.
     * @param stringToList String to parse into characters. Empty or Null strings should be treated as empty strings.
     * @return List of Characters. Should not return null.
     */
    public List<Character> listAllCharacters(String stringToList){
        if (stringToList == null){
            return new ArrayList<>();
        }
        List<Character> characterList = new ArrayList<>();
        for(int i=0; i<stringToList.toCharArray().length;i++){
            characterList.add(stringToList.toCharArray()[i]);
        }
        return characterList;
    }

    /**
     * This method should take in two Strings. Null strings should be handled as EMPTY strings.
     * @param baseString String that should be in the middle of the concatenation
     * @param concat String to surround base string
     * @return String with base surrounded by two Strings. Should not return null.
     */
    public String concatenateToFrontAndEnd(String baseString, String concat){
        if(Objects.equals(baseString, "")){
            return baseString;
        }
        else if(Objects.equals(baseString,null)&&Objects.equals(concat,null)){
            return "";
        }
        else {
            return concat + baseString + concat;
        }
    }

    /**
     * Easy. Dog (case insensitive) goes in, you're good.
     * Anything else but dog? That's not a dog.
     * @param betterBeDog String that better be a dog. Null strings are not dogs.
     * @throws NotADogException When someone is silly and doesn't put in a dog.
     */
    public void throwExceptionIfNotADog(String betterBeDog) throws NotADogException {
        if (!betterBeDog.equals("Dog")&&!betterBeDog.equals("dog")) {
            throw new NotADogException("This isn't a dog.");
        }

    }

    /**
     * Takes in a string, loops around, and returns that string 10 times in a list.
     * @param baseString String to return. Empty strings are okay but Null strings should just return an empty list.
     *                   We don't loop those.
     * @return A list of 10 Strings if base string is empty or has content. Otherwise, an empty list.
     */
    public List<String> returnsTheSameStringTenTimes(String baseString){
        List<String> arrayList = new ArrayList<>();
        if(Objects.equals(baseString,null)){
            return arrayList;
        }

        while (arrayList.size() != 10){
            arrayList.add(baseString);
        }
        return arrayList;
    }
}