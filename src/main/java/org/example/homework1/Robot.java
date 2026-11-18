package org.example.homework1;

public class Robot {

    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);

        System.out.println("X=" + robot.getX() + ", Y=" + robot.getY() + ", смотрит " + robot.getDirection());

        moveRobot(robot, 3, 0);

        System.out.println("X=" + robot.getX() + ", Y=" + robot.getY() + ", смотрит " + robot.getDirection());
    }
    int x;
    int y;
    Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
        switch (direction) {
            case UP: direction = Direction.LEFT; break;
            case DOWN: direction = Direction.RIGHT; break;
            case LEFT: direction = Direction.DOWN; break;
            case RIGHT: direction = Direction.UP; break;
        }
    }

    public void turnRight() {
        System.out.println("Поворот направо");
        switch (direction) {
            case UP: direction = Direction.RIGHT; break;
            case DOWN: direction = Direction.LEFT; break;
            case LEFT: direction = Direction.UP; break;
            case RIGHT: direction = Direction.DOWN; break;
        }
    }

    public void stepForward() {
        switch (direction) {
            case UP: y++; break;
            case DOWN: y--; break;
            case RIGHT: x++; break;
            case LEFT: x--; break;
        }
        System.out.println("X=" + x + ", Y=" + y);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) robot.turnRight();
            while (robot.getX() != toX) robot.stepForward();
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) robot.turnRight();
            while (robot.getX() != toX) robot.stepForward();
        }

        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) robot.turnRight();
            while (robot.getY() != toY) robot.stepForward();
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) robot.turnRight();
            while (robot.getY() != toY) robot.stepForward();
        }
    }


}