package com.example.oauthcenter.oauthcenterdemo.domain;

import com.example.oauthcenter.oauthcenterdemo.domain.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@Table(name = "T_AUTHORITY") //映射的表名称
public class Authority extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String value;
}