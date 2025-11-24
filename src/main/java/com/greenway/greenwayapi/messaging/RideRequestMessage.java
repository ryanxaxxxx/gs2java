package com.greenway.greenwayapi.messaging;

import lombok.Data;

@Data
public class RideRequestMessage {
    private String userId;
    private String destino;
}

