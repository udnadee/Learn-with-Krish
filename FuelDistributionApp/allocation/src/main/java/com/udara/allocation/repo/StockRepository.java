package com.udara.allocation.repo;

import com.udara.allocation.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

//Repo For Stock Table
@Repository
public interface StockRepository extends JpaRepository<Stock,Integer> {

    //Getting the Last Entered Value
    @Query(nativeQuery = true, value="SELECT * FROM stock ORDER BY id DESC LIMIT 1")
    public List<Stock> findByIdDESC();
}
