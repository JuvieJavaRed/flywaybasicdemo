package com.thirdworlddeveloper.demoflyway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tbl_course")
@AllArgsConstructor
@NoArgsConstructor
public class Course extends EntityWithUUID {
    @Column(name = "name")
    private String name;
    @Column(name = "workload")
    private int workload;
    @Column(name = "rate")
    private short rate;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_course_teacher"))
    private Teacher teacher;
}
