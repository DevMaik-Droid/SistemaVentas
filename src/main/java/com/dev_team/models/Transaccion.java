
package com.dev_team.models;

import java.util.Date;
import lombok.Data;

@Data
public class Transaccion {
    
    private String proveedor; 
    private String producto;
    private Date fecha;
    private Double montoTotal;
    private String tipoDePago;
    private String estado_pago;
    private String observaciones;
  
}
