import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        HashMap<String, List<? extends Pet>> map = new HashMap<>();

        List<Cat> cat = new ArrayList();
        cat.add(new Cat("Behemoth", 5, "Black"));
        cat.add(new Cat("Tom", 7, "Grey"));
        cat.add(new Cat("Garfield", 2, "Ginger"));

        List<Dog> dog = new ArrayList();
        dog.add(new Dog("Lassy", 13, "Black"));
        dog.add(new Dog("Lady", 2, "Grey"));
        dog.add(new Dog("Jake", 6, "Yellow"));

        List<Duck> duck = new ArrayList();
        duck.add(new Duck("Huey", 1, "male"));
        duck.add(new Duck("Dewey", 2, "male"));
        duck.add(new Duck("Louie", 3, "male"));

        map.put("cats", cat);
        map.put("dogs", dog);
        map.put("ducks", duck);

        printAll(map);

        System.out.println("\n Животные младше 3 лет: \n ");

        Iterator<Map.Entry<String, List<? extends Pet>>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, List<? extends Pet>> entry = entries.next();
            entry.getValue().removeIf(Age -> Age.age > 2);
        }
        printAll(map);
    }

    private static void printAll(Map<String, List<? extends Pet>> map) {
        for (Map.Entry<String, List<? extends Pet>> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            for (Object i : entry.getValue()) {
                System.out.println("\t" + i);
            }
        }
    }
}