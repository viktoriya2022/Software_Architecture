import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Fabric.BookGenerator;
import Fabric.CrownGenerator;
import Fabric.CupGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.RingGenerator;
import Fabric.SilverGenerator;
import Fabric.SwordGenerator;

public class App {

    public static void main(String[] args) throws Exception {

        List<ItemGenerator> listGenerator = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            listGenerator.add(new GoldGenerator());
        }

        for (int i = 0; i < 55; i++) {
            listGenerator.add(new SilverGenerator());
        }

        for (int i = 0; i < 5; i++) {
            listGenerator.add(new GemGenerator());
        }

        for (int i = 0; i < 4; i++) {
            listGenerator.add(new BookGenerator());
        }

        for (int i = 0; i < 5; i++) {
            listGenerator.add(new SwordGenerator());
        }

        for (int i = 0; i < 1; i++) {
            listGenerator.add(new CrownGenerator());
        }

        for (int i = 0; i < 5; i++) {
            listGenerator.add(new RingGenerator());
        }

        for (int i = 0; i < 5; i++) {
            listGenerator.add(new CupGenerator());
        }

        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            int index = ran.nextInt(100);
            listGenerator.get(index).openReward();

        }
    }
}
