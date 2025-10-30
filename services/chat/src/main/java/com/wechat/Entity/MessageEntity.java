package com.wechat.message.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;

@Entity
public class MessageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private UUID messageId;

    @NotNull
    private String message;

    private Date sentDate;
    
    @PrePersist
    protected void onCreate() {
        sentDate = new Date();
    }

   // private User userId;

   // private Room roomId;


}
