package com.dev_team.services;
import java.util.List;

public interface I_Service {
    boolean crear(Object objeto);
    boolean actualizar(Object objeto, Long L);
    List<?> listar();
    boolean eliminar(Long L);
}
