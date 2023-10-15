package com.thirdworlddeveloper.demoflyway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseDto {
    private String name;
    private int workload;
    private short rate;
}
