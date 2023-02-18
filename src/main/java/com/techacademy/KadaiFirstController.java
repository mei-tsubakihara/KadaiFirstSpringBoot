package com.techacademy;

import java.util.Calendar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {

        String yyyy = val1.substring(0,4);
        String mm = val1.substring(4,6);
        String dd = val1.substring(6,8);

        String result = null;


        Calendar cal = Calendar.getInstance();
        int year = Integer.parseInt(yyyy);
        int month = Integer.parseInt(mm) - 1;
        int date = Integer.parseInt(dd);

        cal.set(year, month, date);

        switch(cal.get(Calendar.DAY_OF_WEEK)) {
        case (Calendar.SUNDAY):
            result = "Sunday";
            break;
        case (Calendar.MONDAY):
            result = "Monday";
            break;
        case (Calendar.TUESDAY):
            result = "Tuesday";
            break;
        case (Calendar.WEDNESDAY):
            result = "Wednesday";
            break;
        case (Calendar.THURSDAY):
            result = "Thursday";
            break;
        case (Calendar.FRIDAY):
            result = "Friday";
            break;
        case (Calendar.SATURDAY):
            result = "Saturday";
            break;
        }

        return result;
    }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
    int res = 0;
    res = val1 + val2;
    return "計算結果:" + res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res =  0;
        res = val1 - val2;
        return "計算結果:" + res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "計算結果" + res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDevide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "計算結果" + res;
    }

    }


