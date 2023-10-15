package com.thirdworlddeveloper.demoflyway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_teacher")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends EntityWithUUID {
    @Column(name = "name")
    private String name;
    @Column(name = "picture_url")
    private String pictureUrl;
    @Column(name = "email")
    private String email;
}
