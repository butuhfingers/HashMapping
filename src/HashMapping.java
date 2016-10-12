/**
 * Created by derek on 10/10/16.
 */
import java.util.*;

public class HashMapping {
    //Variables
    private HashMap<Character, Integer> hashMap;

    //Constructor
    public HashMapping(){
        this.hashMap = new HashMap<Character, Integer>();
    }

    public void MapString(String mapString){
        this.hashMap.clear();

        //Get each character
        for (Character myChar : mapString.toCharArray()) {
            //check if it exists
            if(this.hashMap.containsKey(myChar)){
                this.hashMap.put(myChar, this.hashMap.get(myChar) + 1);
            }else{ //The key does not exist, do something
                //Create the hashmap key
                this.hashMap.put(myChar, 1);
            }
        }
    }

    @Override
    public String toString(){
        String appenededString = "";
//        return super.toString();

        for (Map.Entry<Character, Integer> entry : this.hashMap.entrySet()){
            appenededString += "[" + entry.getKey().toString() + "] = " + entry.getValue().toString() + "\n";
        }

        return appenededString;
    }
}
