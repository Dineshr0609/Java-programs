public class Personage {
    public static void main(String[] args) {
        int age = 12;

        classifyAge(age);
    }
    private static void classifyAge(int age) {
        if (age < 13) {
            System.out.println("Kid");
        } else if ((age > 12) && (age < 20)) {
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }
}