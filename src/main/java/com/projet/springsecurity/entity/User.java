package com.projet.springsecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "USER")
public class User implements Serializable , UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String username;

    private String password;


    @Override
    public boolean isAccountNonExpired() {

        return false;
    }

    @Override
    public boolean isAccountNonLocked() {

        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {

        return false;
    }

    @Override
    public boolean isEnabled() {

        return false;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return null;
    }


}
