package com.redbeeacademy.algoritmostest.Lista;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListaTest {

    @Test
    @DisplayName("Tests happy path add")
    public void testHappyPathAdd() {
        List<Integer> result = Lista.guardarEnLista(3);
        assertNotNull(result, "The result cannot be null");
        assertEquals(3, result.get(0));
    }


    @Test
    @DisplayName("Test when null values are sent add")
    public void testNullValuesAdd() {
        List<Integer> result = Lista.guardarEnLista(null);
        assertNotNull(result, "The result cannot be null");
        assertEquals(0, result.get(0));
    }

    @Test
    @DisplayName("Tests happy path swap 2 for 4")
    public void testHappyPathSwap() {
        List<Integer> result = Lista.intercambiar(List.of(1, 5, 6, 7, 3, 2));
        assertNotNull(result, "The result cannot be null");
        assertEquals(List.of(1, 5, 3, 7, 6, 2), result);
    }

    @Test
    @DisplayName("Test when null values are sent add first")
    public void testNullValuesSwap() {
        List<Integer> result = Lista.intercambiar(Arrays.asList(1, 5, 6, 7, null, 2));
        assertNotNull(result, "The result cannot be null");
        assertEquals(List.of(1, 5, 2, 7, 6), result);
    }

    @Test
    @DisplayName("Tests happy path add first")
    public void testHappyPathAddFirst() {
        List<Integer> result = Lista.agregarElementoAlInicio(List.of(1, 5, 6, 7, 3, 2), 7);
        assertNotNull(result, "The result cannot be null");
        assertEquals(List.of(7, 1, 5, 6, 7, 3, 2), result);
    }

    @Test
    @DisplayName("Test when null values are sent add first")
    public void testNullValuesAddFirst() {
        List<Integer> result = Lista.agregarElementoAlInicio(Arrays.asList(1, 5, 6, null, 8, 2), 7);
        assertNotNull(result, "The result cannot be null");
        assertEquals(List.of(7, 1, 5, 6, 8, 2), result);
    }

    @Test
    @DisplayName("Tests happy path prom list")
    public void testHappyPathPromList() {
        Double result = Lista.promedioLista(List.of(1, 5, 6, 7, 3, 2));
        assertNotNull(result, "The result cannot be null");
        assertEquals(4, result);
    }

    @Test
    @DisplayName("Test when null values are sent prom list")
    public void testNullValuesPromList() {
        Double result = Lista.promedioLista(Arrays.asList(1, 5, 6, null, 8, 2));
        assertNotNull(result, "The result cannot be null");
        assertEquals(4.4, result);
    }

    @Test
    @DisplayName("Tests happy path removed max")
    public void testHappyPathRemovedMax() {
        List<Integer> result = Lista.eliminarMaximo(List.of(1, 5, 6, 7, 3, 2));
        assertNotNull(result, "The result cannot be null");
        assertEquals(List.of(1, 5, 6, 3, 2), result);
    }

    @Test
    @DisplayName("Test when null values are sent removed max")
    public void testNullValuesRemovedMax() {
        List<Integer> result = Lista.eliminarMaximo(Arrays.asList(1, 5, 6, null, 8, 2));
        assertNotNull(result, "The result cannot be null");
        assertEquals(List.of(1, 5, 6, 2), result);
    }


    @Test
    @DisplayName("Tests happy path repeated")
    public void testHappyPathRepeated() {
        List<Integer> result = Lista.repetidos(Arrays.asList(1, 5, 6, 7, 3, 2), Arrays.asList(4, 7, 9, 1));
        assertNotNull(result, "The result cannot be null");
        assertEquals(List.of(1, 7), result);
    }

    @Test
    @DisplayName("Test when null values are sent repeated")
    public void testNullValuesRepeated() {
        List<Integer> result = Lista.repetidos(Arrays.asList(1, 5, 6, null, 8, 2), Arrays.asList(4, 7, 9, 1));
        assertNotNull(result, "The result cannot be null");
        assertEquals(List.of(1), result);
    }


}
