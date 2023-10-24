import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

    /* Date: August-2023
    * @author: Khaoula
    *Problem: You are given an array of strings names representing filenames.
    * The array is sorted in order of file creation, such that names[i] represents
    * the name of a file created before names[i+1] and after names[i-1] (assume 0-based indexing).
    * Because all files must have unique names, files created later with the same name as a file created
    * earlier should have an additional (k) suffix in their names, where k is the smallest positive
    *  integer (starting from 1) that does not appear in previous file names.
    */
public class fileNaming {
    public static void main(String[] args) {
        //TESTS
    }


    String[] solution(String[] names) {
        Map<String, Integer> countMap = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();

        for (String name : names) {
            if (!countMap.containsKey(name)) {
                countMap.put(name, 0);
                result.add(name);
            } else {
                int count = countMap.get(name) + 1;
                while (countMap.containsKey(name + "(" + count + ")")) {
                    count++;
                }
                countMap.put(name, count);
                countMap.put(name + "(" + count + ")", 0);
                result.add(name + "(" + count + ")");
            }
        }

        return result.toArray(new String[0]);
    }

}