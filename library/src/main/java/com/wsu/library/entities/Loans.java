package com.wsu.library.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigInteger;
import java.util.Date;

@Entity
public class Loans {
    @Id
    private BigInteger id;
    @Column
    private BigInteger bookId;

    @Column
    private String borrowerId;

    @Column
    private String issuedStaffId;

    @Column
    private Date dateBorrowed;

    @Column
    private Date dueDate;

    @Column
    private Date dateReturned;
    @Column
    private boolean Status;
}
