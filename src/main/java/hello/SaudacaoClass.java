/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author Matheus Giron
 */
public class SaudacaoClass {
    
     
    private String dia;
    private String tarde;
    private String noite;

    public String getDia() {
        return dia;
    }

    public String getTarde() {
        return tarde;
    }

    public String getNoite() {
        return noite;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setTarde(String tarde) {
        this.tarde = tarde;
    }

    public void setNoite(String noite) {
        this.noite = noite;
    }

    public SaudacaoClass(String dia, String tarde, String noite) {
        this.dia = dia;
        this.tarde = tarde;
        this.noite = noite;
    }

    
    
    
    
}
