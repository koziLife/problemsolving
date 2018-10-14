import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SkyScanner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _count;
        _count = Integer.parseInt(in.nextLine());

        OutputMostPopularDestination(_count, in);
    }

    private static void OutputMostPopularDestination(final int count, final Scanner in) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            String city = in.nextLine();
            if (map.containsKey(city)) {
                map.put(city, map.get(city) + 1);
            } else {
                map.put(city, 1);
            }

        }

        Map.Entry<String, Integer> popularCity = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (popularCity == null || entry.getValue().compareTo(popularCity.getValue()) > 0) {
                popularCity = entry;
            }
        }
        System.out.println(popularCity.getKey());

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(popularCity == null || popularCity.getValue().compareTo(entry.getValue()) > 0){
                popularCity = entry;
            }
        }
    }

}
