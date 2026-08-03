
package Chapter8;


public class Time2Test {
    public static void main(String[] args) {
        Time2 t1 = new Time2(11, 25, 59);
        System.out.printf("Initial: %s (%s)%n", t1.toUniversalString(), t1.toString());
        t1.tick();
        System.out.printf("a) Increment into next minute: %s%n%n", t1.toUniversalString());

        Time2 t2 = new Time2(13, 59, 59);
        System.out.printf("Initial: %s (%s)%n", t2.toUniversalString(), t2.toString());
        t2.tick();
        System.out.printf("b) Increment into next hour: %s%n%n", t2.toUniversalString());

        Time2 t3 = new Time2(23, 59, 59);
        System.out.printf("Initial: %s (%s)%n", t3.toUniversalString(), t3.toString());
        t3.tick();
        System.out.printf("c) Increment into next day: %s%n%n", t3.toUniversalString());
    }
}


