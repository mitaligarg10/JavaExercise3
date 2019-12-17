package com.stackroute.pe3;

public class StudentMarks {


    public String calculate(int stuGrades[], int numOfStudents) {
        for (int i = 0; i < numOfStudents; i++)

            if (stuGrades[i] < 0 || stuGrades[i] > 100) {
                return "Incorrect Marks Entered";
            }

        return "All marks are correct";
    }
}
