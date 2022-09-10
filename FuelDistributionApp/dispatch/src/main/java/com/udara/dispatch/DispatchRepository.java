package com.udara.dispatch;

import com.udara.dispatch.entity.Dispatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DispatchRepository extends JpaRepository<Dispatch,Integer> {
}
