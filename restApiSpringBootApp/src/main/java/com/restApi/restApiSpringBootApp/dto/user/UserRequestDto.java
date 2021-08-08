package com.restApi.restApiSpringBootApp.dto.user;

import com.restApi.restApiSpringBootApp.domain.user.User;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class UserRequestDto {

    private String email;
    private String name;
    private String nickName;

    @Builder
    public UserRequestDto(String email, String name, String nickName) {
        this.email = email;
        this.name = name;
        this.nickName = nickName;
    }

    public User toEntity() {
        return User.builder()
                .email(email)
                .name(name)
                .nickName(nickName)
                .build();
    }
}
