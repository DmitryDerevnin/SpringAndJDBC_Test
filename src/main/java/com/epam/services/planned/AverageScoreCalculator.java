package com.epam.services.planned;/*package com.services;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Scanner;

@Service
public class AverageScoreCalculator {

    public double calculate() {


        SchoolSubjectsList schoolSubject = new SchoolSubjectsList();
        Scanner in = new Scanner(System.in);

        Map<String, Double> mapSubjects = schoolSubject.getSchoolSubjectsList();
        mapSubjects.
                forEach((k, v) ->
                {
                    System.out.print("Введите ваш балл по предмету: "
                            + k.toString() + " ");
                    v = Double.valueOf(in.nextLine());
                });

        double sum = 0.0;
        for (Double val : mapSubjects.values()) {
            sum += val;
        }

        double averageScore = sum / mapSubjects.values().size();
        return averageScore;
    }
}
*/