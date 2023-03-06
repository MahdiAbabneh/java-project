package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Course> courses = List.of(
                new Course("Spring", "Framework", 92, 20000),
                new Course("Spring Boot", "Framework", 92, 18000),
                new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000),
                new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000),
                new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000));

        Predicate<Course> reviewScoreGreaterThanPredicate = course -> course.getReviewScore() > 95;
        System.out.println(courses.stream().allMatch(reviewScoreGreaterThanPredicate));
        System.out.println(courses.stream().noneMatch(reviewScoreGreaterThanPredicate));
        System.out.println(courses.stream().anyMatch(reviewScoreGreaterThanPredicate));

        Comparator<Course> comparingByNoOfStudentsIncreasing = Comparator.comparingInt(Course::getNoOfStudents);
        System.out.println(courses.stream().sorted(comparingByNoOfStudentsIncreasing).collect(Collectors.toList()));

        Comparator<Course> comparingByNoOfStudentsDecreasing = Comparator.comparingInt(Course::getNoOfStudents).reversed();
        System.out.println(courses.stream().sorted(comparingByNoOfStudentsDecreasing).collect(Collectors.toList()));

        Comparator<Course> comparingByNoOfStudentsAndNoOfReviews = Comparator.comparingInt(Course::getNoOfStudents)
                .thenComparingInt(Course::getReviewScore)
                .reversed();
        System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndNoOfReviews).collect(Collectors.toList()));

        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsAndNoOfReviews)
                        .limit(5)
                        .collect(Collectors.toList()));

        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsAndNoOfReviews)
                        .skip(3)
                        .collect(Collectors.toList()));

        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsAndNoOfReviews)
                        .skip(3)
                        .limit(5)
                        .collect(Collectors.toList()));

        System.out.println(
                courses.stream()
                        .takeWhile(course -> course.getNoOfStudents()>=20000)
                    .collect(Collectors.toList()));



        System.out.println(
                courses.stream()
                        .max(comparingByNoOfStudentsAndNoOfReviews).
                        orElse(new Course("Kubernetes", "Cloud", 91, 20000)));

        System.out.println(
                courses.stream()
                        .min(comparingByNoOfStudentsAndNoOfReviews)
                        .orElse(new Course("Kubernetes", "Cloud", 91, 20000))
        );

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThanPredicate)
                        .min(comparingByNoOfStudentsAndNoOfReviews)
                        .orElse(new Course("Kubernetes", "Cloud", 91, 20000))
                //Optional.empty
        );

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThanPredicate)
                        .findFirst()
        );//Optional.empty

        System.out.println(
                courses.stream()
                        .mapToInt(Course::getNoOfStudents)
                        .sum());

        System.out.println(
                courses.stream()
                        .mapToDouble(Course::getNoOfStudents)
                        .average());

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThanPredicate)
                        .mapToInt(Course::getNoOfStudents)
                        .count());//4

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory)));








    }
}
