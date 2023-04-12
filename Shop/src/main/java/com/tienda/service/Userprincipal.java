/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.Persona;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Christopher Briceño
 */
public class Userprincipal implements {
    private Persona persona;

    public Userprincipal(Persona persona) {
        this.persona = persona;
    }
    @Override
    public Collection<? extends GrantedAuthority getAuthorities(){
        List<GranteAuthority> authorities =new ArrayList<>());
        this.persona.getpe

    }
}
