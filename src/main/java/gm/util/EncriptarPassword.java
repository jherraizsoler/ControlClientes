
package gm.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {
    public static void main(String[] args) {
        
        var password = "123";
        String contraseñaCifrada = encriptarPassword(password);
        System.out.println("Contraseña cifrada: " + contraseñaCifrada);
        String contraseñaCifrada2 = encriptarPassword(password);
        System.out.println("Contraseña cifrada: " + contraseñaCifrada2);
        String contraseñaCifrada3 = encriptarPassword(password);
        System.out.println("Contraseña cifrada: " + contraseñaCifrada3);
        String contraseñaCifrada4 = encriptarPassword(password);
        System.out.println("Contraseña cifrada: " + contraseñaCifrada4);
    }
    
    public static String encriptarPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return  encoder.encode(password);
    }
}
