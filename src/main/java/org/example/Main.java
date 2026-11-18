package org.example;

import org.example.homework1.Direction;
import org.example.homework1.Robot;

import static org.example.homework1.Day.MONDAY;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(MONDAY.getRusName());
        System.out.println(MONDAY.isWeekend());
        Robot robot = new Robot(12,2, Direction.LEFT);
                System.out.println(robot.getX());
    }

}