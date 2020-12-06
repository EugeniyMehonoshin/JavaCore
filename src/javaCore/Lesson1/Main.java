package javaCore.Lesson1;

public class Main {
    public static void main(String[] args) {
        int Stage = 0;

        Result[] results = new Result[3];
        results[0] = new Cat("Мартин",1000, 5);
        results[1] = new Man("Вася",2500, 3);
        results[2] = new Robot("Дэдваэрдва",30000, 15);

        Treadmill treadmill = new Treadmill(300);
        Wall wall = new Wall(2);


        playMarathon(results, treadmill, wall);
    }


    public static void playMarathon(Result[] team, Treadmill treadmill, Wall wall) {
        int Stage;
        do {
            for ( Stage = 1; Stage <=3 ; Stage++) {
                treadmill.setRun(treadmill.getRun()*Stage);
                wall.setHeight(wall.getHeight()*Stage);
                for (int i = 0; i < 3; i++) {
                    if (team[i].getMaxRun() < treadmill.getRun()){
                        continue;
                    }
                    team[i].runTreadmill(treadmill);
                }
                for (int j = 0; j < 3; j++) {
                    if (team[j].getMaxJump() < wall.getHeight()) {
                        continue;
                    }
                    team[j].jumpWall(wall);
                }
                System.out.println("\n" + Stage + " этап пройден" + "\n");
            }
        } while (Stage == 3);
    }

}
