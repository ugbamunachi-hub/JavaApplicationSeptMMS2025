
package Chapter8;

    public class TrafficLightTest {
    public static void main(String[] args) {
        System.out.printf("%-10s%s%n", "Light", "Duration (seconds)");
        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%-10s%d%n", light, light.getDuration());
        }
    }
}


