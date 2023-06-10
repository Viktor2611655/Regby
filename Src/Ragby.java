import java.util.Arrays;
import java.util.Random;

public class Ragby {
    public static void main(String[] args){
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        Random random = new Random();

        for (int i = 0; i < team1.length; i++){
            team1[i] = random.nextInt(23) + 18;
        }
        System.out.println(Arrays.toString(team1));
        double average = 0;
        for (double u = 0; u < team1.length; u++){
            average +=(double) team1[(int)u]/ team1.length;
        }
        System.out.println("Средний возраст команды team1 " + " = " + average);

        for (int h = 0; h < team2.length; h++) {
            team2[h] = random.nextInt(23) + 18;
        }
        System.out.println(Arrays.toString(team2));
        double average1 = 0;
        for (double k = 0; k < team2.length; k++) {
            average1 +=(double) team2[(int) k]/ team2.length;
        }
        System.out.println("Средний возраст команды team2" + " = " + average1);

    }
}
