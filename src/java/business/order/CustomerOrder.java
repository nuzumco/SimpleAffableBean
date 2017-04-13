/*
 * Copyright (c) 2010, Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software
 * except in compliance with the terms of the license at:
 * http://developer.sun.com/berkeley_license.html
 */

package business.order;

import java.util.Date;


/**
 *
 */
public class CustomerOrder {

    private long customerOrderId;
    private long customerId;
    private int amount;
    private Date dateCreated;
    private int confirmationNumber;


    public CustomerOrder() {
    }


    public CustomerOrder(long customerOrderId, long customerId, int amount, Date dateCreated, int confirmationNumber) {
        this.customerOrderId = customerOrderId;
        this.customerId = customerId;
        this.amount = amount;
        this.dateCreated = dateCreated;
        this.confirmationNumber = confirmationNumber;
    }

    public long getCustomerOrderId() {
        return customerOrderId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public int getAmount() {
        return amount;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }


    @Override
    public String toString() {
        return "business.order.CustomerOrder[customerOrderId=" + customerOrderId + "]";
    }

}
