package com.jdk8.stream;

import com.thread.deadlock.B;

public class Student {
    private int id;
    private static String name;
    private String department;
    private int marks;

    private Student(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.department = builder.department;
        this.marks = builder.marks;
    }

    public int getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", marks=" + marks +
                '}';
    }

    public static class Builder{
        private int id;
        private String name;
        private String department;
        private int marks;

        public Builder() { }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder marks(int marks) {
            this.marks = marks;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
