package com.wsu.library.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@Data
public class Loans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @Column
    private BigInteger bookId;

    @Column
    private String borrowerId;

    @Column
    private String issuedStaffId;

    @Column
    private LocalDate dateBorrowed;

    @Column
    private LocalDate dueDate;

    @Column
    private LocalDate dateReturned;
    @Column
    private boolean Status;
}
