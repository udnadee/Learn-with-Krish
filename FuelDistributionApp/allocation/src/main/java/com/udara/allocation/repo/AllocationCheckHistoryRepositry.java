package com.udara.allocation.repo;

import com.udara.allocation.entity.AllocationCheckHistory;
import org.springframework.data.jpa.repository.JpaRepository;

//Allocation Repo Which Connects Spring JPA
//Here We get the Allocation Class as a <>
public interface AllocationCheckHistoryRepositry
        extends JpaRepository<AllocationCheckHistory,Long> {
}
