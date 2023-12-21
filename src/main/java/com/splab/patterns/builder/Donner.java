package com.splab.patterns.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Donner {
    private int id;
    private String bunType;
    private String sausageType;
    private int cost;
}
