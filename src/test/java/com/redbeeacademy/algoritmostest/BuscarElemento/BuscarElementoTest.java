package com.redbeeacademy.algoritmostest.BuscarElemento;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuscarElementoTest {

    @Test
    void devuelvoFalse() {
        boolean result = BuscarElemento.devuelvoVerdadero(List.of(3,6,2,1,5),7);

        assertFalse(result);
    }

    @Test
    void devuelvoTrue() {
        boolean result = BuscarElemento.devuelvoVerdadero(List.of(3,6,2,1,5),2);

        assertTrue(result);
    }

}
