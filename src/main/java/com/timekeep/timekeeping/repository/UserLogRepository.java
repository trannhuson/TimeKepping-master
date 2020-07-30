package com.timekeep.timekeeping.repository;

import com.timekeep.timekeeping.dto.temp.TotalDayDTO;
import com.timekeep.timekeeping.entity.TotalDay;
import com.timekeep.timekeeping.entity.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UserLogRepository extends JpaRepository<UserLog,Long> {
   // UserLog findAllByDate_Month();
//    @Query(value = "SELECT (MONTH(ul.date)) as month, COUNT(*) as songaylam, ul.user_id as code" +
//            " FROM user_log ul" +
//            " WHERE user_log.user_id = ?1 AND MONTH(user_log.date) = ?2",nativeQuery = true)
//    TotalDay findToalDayByUserIdAndDate(Long userId, int month);

//    @Query(value = "SELECT new com.timekeep.timekeeping.dto.temp.TotalDayDTO(ul.date, COUNT(ul), ul.user) " +
//            "FROM UserLog ul " +
//            "WHERE ul.user IS NOT NULL " +
//            "AND ul.user.code = ?1")
   // List<TotalDayDTO> findUserLogByUserIdAndDate(Long userId);
}
