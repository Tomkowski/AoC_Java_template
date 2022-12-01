package com.aoc;

import com.aoc.utils.FileUtils;
import com.aoc.utils.Solvable;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> input = FileUtils.readInput("./src/com/aoc/data/day01.txt");
        Solvable solver = new Day01();
        System.out.println(solver.part1(input));
        System.out.println(solver.part2(input));
    }
}