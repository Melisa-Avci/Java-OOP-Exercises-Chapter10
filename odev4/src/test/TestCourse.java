package test;

import odev4.Course;

public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("Data Structures");
        course.addStudent("Ali");
        course.addStudent("Ayşe");
        course.addStudent("Mehmet");

        System.out.println("İlk öğrenci sayısı: " + course.getNumberOfStudents());
        
        course.dropStudent("Ayşe");
        System.out.println("Ayşe silindikten sonra öğrenci sayısı: " + course.getNumberOfStudents());

        String[] students = course.getStudents();
        System.out.println("Kalan öğrenciler:");
        for (String s : students) {
            System.out.println("- " + s);
        }
    }
}