package com.citi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentGroupByDepartment {
    static void main() {
        List<Student> studentList = Arrays.asList(
                new Student(1, "Alice", "Computer Science"),
                new Student(2, "Bob", "Mathematics"),
                new Student(3, "Charlie", "Computer Science"),
                new Student(4, "David", "Physics"),
                new Student(5, "Eve", "Mathematics")
        );

        Map<String, List<Student>> studCollections = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));

        studCollections.forEach((student, studList) ->{
            System.out.println(student+" "+studList);
        });
    }
}
