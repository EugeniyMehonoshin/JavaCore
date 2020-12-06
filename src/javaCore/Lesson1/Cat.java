package javaCore.Lesson1;

public class Cat extends Result {
    public Cat(String name, int maxRun, int maxJump) {
        super(name, maxRun, maxJump);
    }


    @Override
    public void runTreadmill(Treadmill treadmill) {
        if (treadmill.getRun() <= getMaxRun() )
            System.out.println("Кот " + getName() + " пробежал " + treadmill.getRun() + " метров" );
        else System.out.println("Кот " + getName() + " не смог пробежать " + treadmill.getRun() + " метров");
    }

    @Override
    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= getMaxJump())
            System.out.println("Кот " + getName() + " смог перепрыгнуть препятствие высотой " + wall.getHeight() + " метра");
        else System.out.println("Кот " + getName() + " не смог перепрыгнуть препятствие высотой " + wall.getHeight());
    }

}
