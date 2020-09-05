package com.yeramareddy.util;

import com.yeramareddy.model.Course;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static void main(String[] args) {
        // write your code here
        getCSVFile();
    }

    public static List<Course> getCSVFile() {
        List<Course> courses = new ArrayList<>();
        String line;
        try (BufferedReader csvFile = new BufferedReader(new FileReader("src/main/resources/course_data.csv"))) {
            int lineNumber = 0;
            while ((line = csvFile.readLine()) != null) {
                lineNumber++;
                if (lineNumber > 1) {
                    String[] courseArr = line.split(",");
                    Course course = new Course();
                    if (courseArr.length > 0)
                        course.setSubCode(courseArr[0]);
                    if (courseArr.length > 1)
                        course.setSubName(courseArr[1]);
                    if (courseArr.length > 2)
                        course.setNoOfTheoryLecturesPerWeek(courseArr[2]);
                    if (courseArr.length > 3)
                        course.setNoOfPracticalLecturesPerWeek(courseArr[3]);
                    courses.add(course);
//                    System.out.println("Course [code= " + course[0] + " , name=" + course[1] + "]");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        courses.forEach(System.out::println);
        return courses;
    }
}
