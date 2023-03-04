
package com.tienda.service;

import com.tienda.entity.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IPersonaService {
    public List<Persona> getAllPersona();
    public Persona getpersonaById(Long id);
    public void savePersona(Persona persona);
    public void delete(long id);

    public Persona getPersonaById(Long idPersona);

    
}
        