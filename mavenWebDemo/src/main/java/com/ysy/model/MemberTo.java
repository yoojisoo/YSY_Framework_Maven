package com.ysy.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberTo {

	private int id;

    private String name;

    private String account;

    private String password;

    private LocalDateTime lastAccessDt;

    private LocalDateTime regDt;

    public Member toEntity() {
        return new Member(id, name, account, password);
    }
}
