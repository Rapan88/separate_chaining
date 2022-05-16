import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SeparateChaining<String,Integer> SP = new SeparateChaining<>();
        String [] arr = {
                "Anton",
                "Vitia",
                "Gosha",
                "Vitalia",
                "Boria",
        };

        Random random = new Random();

        for(int i = 0; i<30; i++){
            SP.add(arr[random.nextInt(1,5)],i);
        }

        System.out.println(SP);
        System.out.println(SP.size());
        System.out.println(SP.delete("Gosha"));
        System.out.println(SP.size());
        System.out.println(SP.isEmpty());
    }
}