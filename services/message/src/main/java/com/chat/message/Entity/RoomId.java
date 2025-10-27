package com.chat.message.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class RoomId {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID roomId;

    private User userId;

    private User receiverId;
}
