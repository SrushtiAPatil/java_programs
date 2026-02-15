
public class HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Math", 90);
        marks.put("Science", 85);

        for (String key : marks.keySet()) {
            System.out.println(key + " : " + marks.get(key));
        }
    }
}
