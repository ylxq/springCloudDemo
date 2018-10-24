package com.example.ssecurity.security.domain;

import com.example.ssecurity.security.domain.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "T_ROLE") //映射的表名称
public class Role extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String value;

    @JsonIgnore
    @ManyToMany(targetEntity = Authority.class, fetch = FetchType.EAGER)
    @BatchSize(size = 20)
    private Set<Authority> authorities = new HashSet<>();

    public List<SimpleGrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        if (!this.authorities.isEmpty()) {
            this.authorities.forEach(authority ->
                    list.add(new SimpleGrantedAuthority(authority.getValue()))
            );
        }
        return list;
    }

}