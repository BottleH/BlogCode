package com.bottleh.blogcode.entity;

import com.bottleh.blogcode.common.audit.Audit;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "MEMBER")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberEntity extends Audit {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Builder
    public MemberEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
