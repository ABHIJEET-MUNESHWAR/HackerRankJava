package com.hackerrank.challenges.vmware.reformatdates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetashokmuneshwar,
 * Date:    18/08/18,
 * Time:    9:15 PM
 */
public class ReformatDates {

    public static void main(String[] args) {
        ReformatDates reformatDates = new ReformatDates();
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        List<String> dateStrings = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            dateStrings.add(sc.nextLine());
        }
        List<String> formattedStrings = reformatDates.reformatDateList(dateStrings);
        System.out.println(formattedStrings);
    }

    private List<String> reformatDateList(List<String> dateStrings) {
        if (dateStrings.isEmpty()) {
            return null;
        } else {
            HashMap<String, String> monthMap = new HashMap<>();
            monthMap.put("Jan", "01");
            monthMap.put("Feb", "02");
            monthMap.put("Mar", "03");
            monthMap.put("Apr", "04");
            monthMap.put("May", "05");
            monthMap.put("Jun", "06");
            monthMap.put("Jul", "07");
            monthMap.put("Aug", "08");
            monthMap.put("Sep", "09");
            monthMap.put("Oct", "10");
            monthMap.put("Nov", "11");
            monthMap.put("Dec", "12");
            List<String> formattedStrings = new ArrayList<>();
            ListIterator<String> listIterator = dateStrings.listIterator();
            while (listIterator.hasNext()) {
                String date = listIterator.next();
                String[] dateArray = date.split(" ");
                String dd = dateArray[0];
                String mm = dateArray[1];
                String yyyy = dateArray[2];
                int formattedDd = Integer.parseInt(dd.replaceAll("[^0-9]", ""));
                String formattedDay = null;
                if (formattedDd > 9) {
                    formattedDay = String.valueOf(formattedDd);
                } else {
                    formattedDay = "0" + String.valueOf(formattedDd);
                }
                String formattedMm = monthMap.get(mm);
                String formattedYyyy = yyyy;
                String formattedDate = yyyy + "-" + formattedMm + "-" + formattedDay;
                formattedStrings.add(formattedDate);
            }
            return formattedStrings;
        }
    }
}
