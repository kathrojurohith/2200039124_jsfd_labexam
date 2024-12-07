package com.klef.jfsd.exam.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Order {
    @Id
    private Long orderId;
    private String productName;
    private int quantity;
    private Date orderDate;
    private String customerName;

    // Getters and Setters
}
