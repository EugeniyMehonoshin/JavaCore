package javaCore.Lesson1;

public abstract class Result {
    private String name;
    private int maxRun;
    private int maxJump;

    public Result(String name, int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public abstract void runTreadmill(Treadmill treadmill);
    public abstract void jumpWall(Wall wall);
}
