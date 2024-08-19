import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Result {
    public static long marcsCakewalk(List<Integer> calorie) {
        Collections.sort(calorie, Collections.reverseOrder());
        
        long miles = 0;
        for (int i = 0; i < calorie.size(); i++) {
            miles += (long) (Math.pow(2, i) * calorie.get(i));
        }
        
        return miles;
    }
}

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] calorieTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> calorie = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int calorieItem = Integer.parseInt(calorieTemp[i]);
            calorie.add(calorieItem);
        }

        long result = Result.marcsCakewalk(calorie);

        System.out.println(result);

        bufferedReader.close();
    }
}
