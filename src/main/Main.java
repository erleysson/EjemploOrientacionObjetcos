package main;

import  static entidades.Mensajes.*;
import entidades.Mensajes;
import entidades.empleados.Salario;

import javax.swing.*;
import java.text.DecimalFormat;

//mostrar el resultado
public class Main {

    public static void main (String[] args) {

        DecimalFormat formateador = new DecimalFormat("###,###.##");



        Salario salario = new Salario();

        String horas = JOptionPane.showInputDialog(null,
                MENSAJE_PETICION_HORAS.getMensajes());

        String valor = JOptionPane.showInputDialog(null,
                MENSAJE_PETICION_VALOR_HORA.getMensajes());


       salario.setHorasTrabajadas(Double.parseDouble(horas));
       salario.setValorHora(Double.parseDouble(valor));

        JOptionPane.showMessageDialog(null,
                MENSAJE_SALARIO_PAGAR.getMensajes()+ formateador.format(salario.calcularSalario()));



    }
}
