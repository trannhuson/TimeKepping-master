package com.timekeep.timekeeping.converter;

import com.timekeep.timekeeping.dto.temp.TotalDayDTO;
import com.timekeep.timekeeping.entity.TotalDay;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TotalConverter {

//    @Autowired
//    private ModelMapper modelMapper;

    public TotalDay toEntity(TotalDayDTO totalDayDTO){
        TotalDay totalDay = new TotalDay();

        totalDay.setUserId(totalDayDTO.getUserId());
        totalDay.setMonth(totalDayDTO.getMonth());
        totalDay.setTotal(totalDayDTO.getTotal());
        return totalDay;
       // return modelMapper.map(totalDayDTO,TotalDay.class);
    }

    public TotalDayDTO toDTO(TotalDay totalDay) {
        TotalDayDTO totalDayDTO = new TotalDayDTO();
        if(totalDay.getId() != null){
            totalDayDTO.setId(totalDay.getId());
        }
        totalDayDTO.setUserId(totalDay.getUserId());
        totalDayDTO.setTotal(totalDay.getTotal());
        totalDayDTO.setMonth(totalDay.getMonth());
        return totalDayDTO;
       // return modelMapper.map(totalDay,TotalDayDTO.class);
    }
    public List<TotalDay> toTotalEntity(List<TotalDay> totalDay, TotalDayDTO totalDayDTO){
        for(int i =0;i<totalDay.size();i++){
            totalDay.get(i).setTotal(totalDayDTO.getTotal());
            totalDay.get(i).setMonth(totalDayDTO.getMonth());

        }
//        totalDay.
//        totalDay.setMonth(totalDayDTO.getMonth());
//        totalDay.setTotal(totalDayDTO.getTotal());
        return totalDay;
    }


}
