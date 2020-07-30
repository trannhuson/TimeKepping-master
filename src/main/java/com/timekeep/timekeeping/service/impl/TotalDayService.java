package com.timekeep.timekeeping.service.impl;

import com.timekeep.timekeeping.converter.TotalConverter;
import com.timekeep.timekeeping.dto.temp.TotalDayDTO;
import com.timekeep.timekeeping.entity.TotalDay;
import com.timekeep.timekeeping.repository.TotalDayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TotalDayService {
    @Autowired
    TotalDayRepository totalDayRepository;

    @Autowired
    TotalConverter totalConverter;

//    public List<TotalDayDTO> cacleDate(int month) {
//        List<TotalDayDTO> listdto = new ArrayList<>();
//        List<TotalDay> total = totalDayRepository.findTotalDayByDate(month);
//        for (int i = 0; i <total.size() ; i++) {
//            System.out.println(total.get(i).getTotal()+" - total ");
//            System.out.println(total.get(i).getMonth()+" - month");
//            System.out.println(total.get(i).getUserId()+" - id");
//            System.out.println("----------------");
//        }
//        TotalDayDTO totalDayDTO1 = new TotalDayDTO();
//
//        totalDayDTO1.setTotal(5L);
//        totalDayDTO1.setUserId(1237L);
//        totalDayDTO1.setMonth(7);
//
//        TotalDay totalDay1 = new TotalDay();
//
//        totalDay1 = totalConverter.toEntity(totalDayDTO1);
//        System.out.println(totalDay1.getUserId()+"-"+totalDay1.getTotal()+"-"+totalDay1.getMonth());
//        System.out.println("---------------");
//
//        totalDay1 = totalDayRepository.save(totalDay1);
////        total = totalDayRepository.saveAll(total);
////        listdto = total.stream()
////                .map(entity -> totalConverter.toDTO(entity))
////                .collect(Collectors.toList());
//        return listdto;
//    }

    @Transactional
    public List<TotalDayDTO> cacleDate(int month) {
        List<TotalDay> totalDays = totalDayRepository.findTotalDayByDate(month);
      //  totalDays = totalDayRepository.saveAll(totalDays.);
        for(TotalDay totalDay: totalDays){
            totalDay = totalDayRepository.save(totalDay);
        }
        return totalDays.stream()
                .map(entity -> totalConverter.toDTO(entity))
                .collect(Collectors.toList());
    }
}
