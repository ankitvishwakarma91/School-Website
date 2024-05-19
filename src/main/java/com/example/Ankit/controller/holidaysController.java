package com.example.Ankit.controller;

import com.example.Ankit.Model.holiday;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;


@Controller
public class holidaysController {

    @GetMapping("/holidays")
    public  String displayHolidays(Model model) {
        List<holiday> holidays = Arrays.asList(
                new holiday(" Jan 1 ","New Year's Day", holiday.Type.FESTIVAL),
                new holiday(" Oct 31 ","Halloween", holiday.Type.FESTIVAL),
                new holiday(" Nov 24 ","Thanksgiving Day", holiday.Type.FESTIVAL),
                new holiday(" Dec 25 ","Christmas", holiday.Type.FESTIVAL),
                new holiday(" Jan 17 ","Martin Luther King Jr. Day", holiday.Type.FEDERAL),
                new holiday(" July 4 ","Independence Day", holiday.Type.FEDERAL),
                new holiday(" Sep 5 ","Labor Day", holiday.Type.FEDERAL),
                new holiday(" Nov 11 ","Veterans Day", holiday.Type.FEDERAL)
        );
        holiday.Type[] types = holiday.Type.values();
        for (holiday.Type type : types) {
            model.addAttribute(type.toString(),
                    (holidays.stream().filter(holiday -> false)
                            .collect(Collectors.toList())));
        }
        return "holidays";
    }
}