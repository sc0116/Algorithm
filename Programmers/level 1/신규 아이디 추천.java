import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>() {
            {
                put("...!@BaT#*..y.abcdefghijklm", "bat.y.abcdefghi");
                put("z-+.^.", "z--");
                put("=.=", "aaa");
                put("123_.def", "123_.def");
                put("abcdefghijklmn.p", "abcdefghijklmn");
            }
        };

        map.entrySet().forEach(entry -> {
            if (entry.getValue().equals(solution(entry.getKey()))) {
                System.out.println(entry.getValue() + " is true!!!");
            }
        });
    }

    private static String solution(String new_id) {
        //System.out.println("step 0: " + new_id);
        new_id = new_id.toLowerCase();
        //System.out.println("step 1: " + new_id);
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        //System.out.println("step 2: " + new_id);
        new_id = new_id.replaceAll("[.]{2,}", ".");
        //System.out.println("step 3: " + new_id);
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        //System.out.println("step 4: " + new_id);
        if (new_id.equals("")) {
            new_id += "a";
        }
        //System.out.println("step 5: " + new_id);
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("[.]$", "");
        }
        //System.out.println("step 6: " + new_id);
        if (new_id.length() <= 2) {
            while (new_id.length() != 3) {
                new_id += new_id.charAt(new_id.length() - 1);
            }
        }
        //System.out.println("step 7: ");

        return new_id;
    }
}