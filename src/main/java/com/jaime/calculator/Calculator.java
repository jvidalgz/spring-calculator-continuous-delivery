package com.jaime.calculator;
import org.springframework.stereotype.Service;

/**
 * Lógica para la suma
 */
@Service
public class Calculator {
    int sum(int a, int b) {
        return a + b;
    }
}