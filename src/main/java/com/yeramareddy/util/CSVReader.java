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
        try (BufferedReader csvFile = new BufferedReader(new FileReader("src/main/resources/first_year_courses.csv"))) {
            int lineNumber = 0;
            while ((line = csvFile.readLine()) != null) {
                lineNumber++;
                if (lineNumber > 1) {
                    String[] courseArr = line.split(",");
                    if (courseArr.length > 2) {
                        Course course = new Course();
                        course.setSubCode(courseArr[0].trim());
                        course.setSubName(courseArr[1].trim());
                        if (courseArr[2].trim().length() > 0)
                            course.setNoOfTheoryLecturesPerWeek(Integer.parseInt(courseArr[2].trim()));
                        if (courseArr.length > 3)
                            if (courseArr[3].trim().length() > 0)
                                course.setNoOfPracticalLecturesPerWeek(Integer.parseInt(courseArr[3].trim()));

                        courses.add(course);
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        courses.forEach(System.out::println);
        return courses;
    }
}
