import java.util.Arrays;

public class Destroying_Asteroids_2126 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long currentMass = mass;

        for (int asteroid : asteroids) {
            if (currentMass < asteroid) {
                return false;
            }

            currentMass += asteroid;
        }

        return true;
    }
}
