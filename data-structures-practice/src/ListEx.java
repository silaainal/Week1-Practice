import java.util.ArrayList;

public class ListEx {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        list.add("Sıla");
        list.add("Hazal");
        list.add("Miraç");

        System.out.println("List: " + list);
        System.out.println("First Element: " + list.get(0));

        list.remove(0);
        System.out.println("After removing: " + list);
    }
}