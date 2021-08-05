package com.redbeeacademy.algoritmostest.Lista.EjercicioCine;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Un cine de un pueblo nos pide que generemos una aplicacion para controlar las personas de una cola.
La edad de las personas de la cola se generan aleatoriamente entre 5 y 60 años (edad minima 5 - maxímo 60).
La capacidad de la sala es de 50 personas.
Deberemos mostrar:

1) la cantidad total recaudada
2) cuantas personas entraron por cada rango de edad
3) promedio de edad por cada estreno

Precios por edad
entre 5 y 10 años ->  $100
entre 11 y 17 años -> $150
de 18 en adelante -> $200

Tenemos la clase Persona, donde vamos a usarla para modelar edad, y las propiedades que crean convenientes
 */



public class Cine {
    public static double cantidadTotalRecaudada(List<Persona> personas){
        double cantidadTotal = 0;
        List<Persona> people = new ArrayList<Persona>(personas);
        people = people.stream().filter(value -> value != null).collect(Collectors.toList());
        for(int i = 0; i < people.size(); i++) {
            if(people.get(i).getEdad() >= 5 && people.get(i).getEdad() <= 10){
                cantidadTotal += 100;
            }else if (people.get(i).getEdad() > 10 && people.get(i).getEdad() < 18){
                cantidadTotal += 150;
            }else if (people.get(i).getEdad() > 17){
                cantidadTotal += 200;
            }
        }
        return cantidadTotal;
    }

    public static Integer cantidadPersonas(List<Persona> personas){
        Integer cantidadPersonas = 0;
        List<Persona> people = new ArrayList<Persona>(personas);
        people = people.stream().filter(value -> value != null).collect(Collectors.toList());
        return cantidadPersonas = people.size();
    }

    public static double promedioEdad(List<Persona> personas) {
        double promedio = 0;
        List<Persona> people = new ArrayList<Persona>(personas);
        people = people.stream().filter(value -> value != null).collect(Collectors.toList());
        int i = 0;
        double suma = 0;
        while (i < people.size()) {
            suma += people.get(i).getEdad();
            i++;
        }
        int temp = (int) ((suma / people.size()) * 100.0);
        return ((double) temp) / 100.0;
    }
}
