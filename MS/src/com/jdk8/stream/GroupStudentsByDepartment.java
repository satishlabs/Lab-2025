/*
package com.jdk8.stream;



import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStudentsByDepartment {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student.Builder().id(1).name("Satish").department("CSE").marks(80).build(),
                new Student.Builder().id(2).name("Prasad").department("CSE").marks(75).build(),
                new Student.Builder().id(3).name("Amit").department("ECE").marks(85).build(),
                new Student.Builder().id(4).name("John").department("MECH").marks(65).build(),
                new Student.Builder().id(5).name("Rahul").department("ECE").marks(90).build(),
                new Student.Builder().id(6).name("Sneha").department("CSE").marks(95).build()
        );

        // Group students by department
        Map<String, List<Student>> groupedByDept = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));

        // Print result
        groupedByDept.forEach((dept, stuList) ->
                System.out.println(dept + " -> " + stuList));

         // Print names per department
        groupedByDept.forEach((dept, stuList) ->{
          String names =  stuList.stream()
                    .max(Student:: getName)
                    .collect(Collectors.joining(", "));
            System.out.println(dept+" -> "+names);
        });

        //Group by Department AND filter Marks > 75
        Map<String, List<Student>> groupedHighScorers  = students.stream()
                .filter(s -> s.getMarks() > 75)
                .collect(Collectors.groupingBy(Student::getDepartment));
        groupedHighScorers.forEach((dept, list) ->{
            System.out.println(dept+" "+list);
        });

    }
}
*/
