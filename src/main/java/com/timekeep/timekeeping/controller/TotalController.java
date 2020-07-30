package com.timekeep.timekeeping.controller;
import com.timekeep.timekeeping.dto.temp.TotalDayDTO;
import com.timekeep.timekeeping.entity.TotalDay;
import com.timekeep.timekeeping.service.impl.TotalDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TotalController {
    @Autowired
    TotalDayService totalDayService;

    @GetMapping(value = "/getCalcDate/{month}")
    public List<TotalDayDTO> getCalcDate(@PathVariable("month") int month) {
        return totalDayService.cacleDate(month);
    }
}
