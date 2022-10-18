public class ReturnStatements {
    public static void main(String[] args) {
        String shouting = caps("Should I use Eclipse?");
        System.out.println(shouting);
    }
    public static String caps(String s) {
        return s.toUpperCase();
    }
}
