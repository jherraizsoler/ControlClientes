/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gm.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import lombok.Data;

/**  @author herra  */
@Entity  
@Data
@Table(name = "PERSONA")
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    
    @NotEmpty(message= "Error - nombre: El nombre no puede estar vacío")
    @Size(min = 3, max = 15, message = "Error - nombre: El nombre debe tener como minimo 3 a 15 caracteres")
    private String nombre;
    
    @NotEmpty(message= "\nError - apellido: El apellido no puede estar vacío")
    @Size(min = 3, max = 15, message = "Error - apellido: El teléfono debe tener como minimo 3 15 caracteres")
    private String apellido;
    
    @NotEmpty(message= "\nError - email: El email no puede estar vacío")
    @Size(min = 13, max = 30, message = "Error - email: El email debe tener como minimo 13 a 30 caracteres")
    @Email
    private String email;
    
    @NotEmpty(message= "\nError - telefono: El telefono no puede estar vacío")
    @Pattern(regexp = "\\d{9}", message="Error - telefono: El télefono debe contener solo 9 dígitos numéricos")
    private String telefono;
    
    @NotNull
    private Double saldo;
}
