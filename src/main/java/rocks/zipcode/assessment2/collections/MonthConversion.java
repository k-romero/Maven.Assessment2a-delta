package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    LinkedHashMap<Integer,String> myCalendar = new LinkedHashMap<>();
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
            myCalendar.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return myCalendar.getOrDefault(monthNumber, null);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Integer result = 0;

        if(!myCalendar.containsValue(monthName)){
            result = null;
        } else if(myCalendar.containsValue(monthName)){
            for (Integer key : myCalendar.keySet()) {
                if(myCalendar.get(key).equalsIgnoreCase(monthName)){
                    result = key;
                }
            }

        }
        return result;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        if(myCalendar.containsKey(monthNumber)){
            return true;
        }
        return false;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        if(myCalendar.containsValue(monthName)){
            return true;
        }
        return false;
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return myCalendar.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        myCalendar.replace(monthNumber,myCalendar.get(monthNumber),monthName);
    }

    //YAY!!! completed 156 of 159 :D

    
}
