package com.example.Ankit.controller;


import com.example.Ankit.Model.holiday;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
public class holidaysController {

//    @GetMapping("/holidays")
//    public String displayHolidays(@RequestParam(required = false) boolean festival,
//                                  @RequestParam(required = false) boolean federal,Model model) {
//        model.addAttribute("festival",festival);
//        model.addAttribute("federal",federal);

    @GetMapping("/holidays/{display}")
    public String displayHolidays(@PathVariable String display, Model model) {
        if (null != display && display.equals("all")) {
            model.addAttribute("festival", true);
            model.addAttribute("federal", true);
        } else if (null != display && display.equals("festival")) {
            model.addAttribute("festival", true);
        }else if(null != display && display.equals("federal")) {
            model.addAttribute("federal", true);
        }

        List<holiday> holidays = Arrays.asList(
                new holiday(" Jan 1 ", "New Year's Day", holiday.Type.FESTIVAL),
                new holiday(" Oct 31 ", "Halloween", holiday.Type.FESTIVAL),
                new holiday(" Nov 24 ", "Thanksgiving Day", holiday.Type.FESTIVAL),
                new holiday(" Dec 25 ", "Christmas", holiday.Type.FESTIVAL),
                new holiday(" Jan 17 ", "Martin Luther King Jr. Day", holiday.Type.FEDERAL),
                new holiday(" July 4 ", "Independence Day", holiday.Type.FEDERAL),
                new holiday(" Sep 5 ", "Labor Day", holiday.Type.FEDERAL),
                new holiday(" Nov 11 ", "Veterans Day", holiday.Type.FEDERAL)
        );
        holiday.Type[] types = holiday.Type.values();
        for (holiday.Type type : types) {
            model.addAttribute(type.toString(),
                    (holidays.stream().filter(holiday -> false).collect(Collectors.toList())));
        }
        return "holidays";
    }
}
