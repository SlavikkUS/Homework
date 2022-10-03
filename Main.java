package HomeworkSix;

public class Main {

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(101, "Hello Internet");
        System.out.println(pair.getFirst());
        System.out.println(pair.getLast());
        System.out.println(pair.swap());
        System.out.println(pair.replaceFirstTypeOfElement(101.0, "Hello Internet"));
        System.out.println(pair.replaceSecondTypeOfElement(101, '1'));
    }
}
