package lecture.operator;

public class Lecture4 {
    public static void main(String[] args) {
        JavaMoney m1 = new JavaMoney(5000L);
        JavaMoney m2 = new JavaMoney(5000L);
        JavaMoney m3 = m1;

        if(m1.compareTo(m2) > 0) {
            System.out.println("m1이 m2보다 금액이 크다. ");
        }

        System.out.println(m2 == m1);
    }
}
