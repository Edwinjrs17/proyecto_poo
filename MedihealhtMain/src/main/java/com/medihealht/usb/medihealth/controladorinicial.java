/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.medihealht.usb.medihealth;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author edwin
 */
@Controller
@Slf4j
public class controladorinicial {
    @GetMapping("/")
    public String inicio(){
        log.info("Mostrando mensaje de buenos dias al ing");
        return"Medihealht"; //metodo tipo get que nos permite mostrar o nos retorna un String en el navegador.
    }
}
