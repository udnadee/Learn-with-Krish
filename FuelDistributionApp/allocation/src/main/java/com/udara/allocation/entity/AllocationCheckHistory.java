package com.udara.allocation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

//Allocation Class where we define our variables of the class
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "AllocationCheck")
public class AllocationCheckHistory {
    @Id
    @SequenceGenerator(
            name = "allocation_id_sequence",
            sequenceName = "allocation_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "allocation_id_sequence"
    )
    private Long id;
    private Integer orderId;
    private Integer allocAmount;
    private String status;
    private Boolean isStockAvailable;
    private LocalDateTime createdAt;

}
