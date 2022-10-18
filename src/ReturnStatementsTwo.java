public class ReturnStatementsTwo {
    public static void main(String[] args){
        printMessage();
        int sum = add(5, 8);
        System.out.println(sum);
    }
    public static void printMessage(){
        System.out.println("This is method!");
    }
    public static int add(int a, int b){
        return a + b;
    }
}
