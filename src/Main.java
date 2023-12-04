import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>(Arrays.asList("rosso", "verde", "giallo"));

        String blu = "Blu";
        colors.add(blu);

        for(String color: colors) {
            System.out.println(color);
        }
    }
}
