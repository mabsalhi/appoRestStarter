/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soshs.ump.scolhelp.resources;

import java.nio.charset.Charset;

/**
 *
 * @author SG-FSJESO
 */
public class Helper {
     private Charset charset9 = Charset.forName("ISO-8859-9");
     private Charset charset6 = Charset.forName("windows-1256");

    public Helper() {
    }
    
     
    
    public String decodeApoAr(String toDecode){
     
        byte[] encodedBytes = toDecode.getBytes(charset9);
        String decodedString = new String(encodedBytes, charset6);
        return decodedString;         
     }
     
     

    public Charset getCharset9() {
        return charset9;
    }

    public void setCharset9(Charset charset9) {
        this.charset9 = charset9;
    }

    public Charset getCharset6() {
        return charset6;
    }

    public void setCharset6(Charset charset6) {
        this.charset6 = charset6;
    }
     
     
     
}
