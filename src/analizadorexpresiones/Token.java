/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadorexpresiones;

/**
 *
 * @author Arantza
 */
public class Token {

    private String valor;
    private Tipos tipo;

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the tipo
     */
    public Tipos getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

//Definir enumerador
    enum Tipos {
        VARIABLES("[w-z]"),
        CONSTANTES("pi|e"),
        NUMERO("[0-9]+"),
        OPERADOR("[*|/|+|-]"),
        DESCONOCIDO("[@\\$%&=#^]|^(?!pi$)(?!e$)(pi|[a-v])");
        //.[^0-9w-z][^*|/|+|-]0
        //a[^0-9w-z][^*|/|+|-][^e][^pi]
        //contiene el patron de busqueda
        public final String patron;

        Tipos(String s) {
            this.patron = s;
        }//cierra constructor Tipos

    }//cierra enum
}
