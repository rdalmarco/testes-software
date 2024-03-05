package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testOne {

    //Caso de teste
    //Entrada - A (Arrange)
    //Ação - A (Act)
    //Saida - A (Assert)
    @Test
    public void testOne() {
        //Arrange
        int a = 4;
        int b = 2;

        //Act
        int res = a + b;

        //Assert
        assertEquals(6, res);
    }

    @Test
    public void testTwo() {
        //Arrange
        int a = 4;
        int b = 2;

        //Act
        int res = a * b;

        //Assert
        assertEquals(6, res);
    }
}
