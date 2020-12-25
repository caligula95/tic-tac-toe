package com.javamaster.controller.dto;

import com.javamaster.model.Player;
import lombok.Data;

@Data
public class ConnectRequest {
    private Player player;
    private String gameId;
}
