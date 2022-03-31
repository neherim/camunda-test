package com.github.neherim.ticket.domain;

import lombok.Value;

@Value
public class Ticket {
    int id;
    int row;
    int place;
    int movieId;
}
