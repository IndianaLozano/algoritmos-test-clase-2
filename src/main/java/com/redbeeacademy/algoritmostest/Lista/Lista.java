package com.redbeeacademy.algoritmostest.Lista;
import org.springframework.util.SocketUtils;

import java.lang.Integer;
/*
Realizar los siguientes métodos:
1) Guarde un numero en una lista
2) Intercambie el elemento de la posicion 2 por la posicion 4.
3) Un metodo recibe una lista de numeros y un numero, la funcion debe agregar el numero al inicio de la lista
4) Calcular el promedio de los elementos de una lista
5) Eliminar la posicion donde se encuentre el valor maximo de la lista
6) Dadas dos listas, crear una nueva con los elementos que se repitan en ambas
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lista {

    public static List<Integer> guardarEnLista(Integer numero){
        List<Integer> lista = new ArrayList<>();
        if (numero != null) {
            lista.add(numero);
        } else {
            lista.add(Integer.valueOf(0));
        }
        return lista;
    }

    public static List<Integer> intercambiar(List<Integer> lista){
        List<Integer> listaAux = new ArrayList<>(lista);
        listaAux = listaAux.stream().filter(value -> value != null).collect(Collectors.toList());
        Integer temporario = listaAux.get(2);
        listaAux.set(2, listaAux.get(4));
        listaAux.set(4, temporario);

        return listaAux;
    }

    public static List<Integer> agregarElementoAlInicio(List<Integer> lista, Integer numero){
        List<Integer> listAux = new ArrayList<>(lista);
        listAux = listAux.stream().filter(value -> value != null).collect(Collectors.toList());
        listAux.add(0, numero);
        return listAux;
    }

    public static Double promedioLista(List<Integer> lista){
        List<Integer> listAuxi = new ArrayList<>(lista);
        listAuxi = listAuxi.stream().filter(value -> value != null).collect(Collectors.toList());
        Double suma = 0.0;
        for(int i = 0; i < listAuxi.size(); i++){
            suma += listAuxi.get(i);
        }
        Double promedio = suma / (listAuxi.size());
        return promedio;
    }

    public static List<Integer> eliminarMaximo(List<Integer> lista){
        List<Integer> listaAuxi = new ArrayList<>(lista);
        listaAuxi = listaAuxi.stream().filter(value -> value != null).collect(Collectors.toList());
        Integer maximoValor = 0;
        // Obtengo el máximo valor de la lista
        for(int i = 0; i < listaAuxi.size(); i++){
            if(listaAuxi.get(i) > maximoValor){
                maximoValor = listaAuxi.get(i);
            }
        }
        // Recorro la lista y elimino
        for(int i = 0; i < listaAuxi.size(); i++){
            if(listaAuxi.get(i) == maximoValor) {
                listaAuxi.remove(i);
            }
        }
        return listaAuxi;


    }

    public static List<Integer> repetidos(List<Integer> a, List<Integer> b){
        List<Integer> list1 = new ArrayList<>(a);
        List<Integer> list2 = new ArrayList<>(b);
        List<Integer> finalList = new ArrayList<>();
        for(int i = 0; i < list1.size(); i++){
            if(list2.contains(list1.get(i))){
                finalList.add(list1.get(i));
            }
        }
        return finalList;
    }

}
