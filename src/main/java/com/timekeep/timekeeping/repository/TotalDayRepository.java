package com.timekeep.timekeeping.repository;

import com.timekeep.timekeeping.entity.TotalDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface TotalDayRepository extends JpaRepository<TotalDay, Long> {
    @Query(value = "SELECT t.ids as id, t.code as user_id, (MONTH(t.ngay)) as month, COUNT(*) as total" +
            " FROM (SELECT DATE(ul.date) AS ngay, ul.user_id as code, ul.id as ids" +
                    " FROM user_log ul" +
                    " WHERE MONTH(ul.date) = ?1" +
                    " GROUP BY DATE(ul.date) , ul.user_id) AS t" +
            " GROUP BY t.code" +
            " ORDER BY t.code ASC",nativeQuery = true)
    List<TotalDay> findTotalDayByDate(int month);
}
