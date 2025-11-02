package com.hazerta.presentacion;

import com.hazerta.modelo.Estadisticas;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.Function;

public class EjemploFunciones {
//    Filtrado de elementos de una lista:
//    Define una función que tome una lista de números como entrada
//    y devuelva una lista que solo contenga los números pares.
//    Utiliza la interfaz funcional Function para filtrar los elementos de la lista.
    public void metodo1() {
        Function<List<Integer>,List<Integer>> obtenerPares = lista -> {
            return lista.stream()
                    .filter(x -> x % 2==0)
                    .toList();

        };
        // Aplicamos la función a una lista de ejemplo
        List<Integer> resultado = obtenerPares.apply(List.of(1, 2, 3, 4, 5, 6));

        // Mostramos el resultado
        System.out.println("Lista original: [1, 2, 3, 4, 5, 6]");
        System.out.println("Números pares: " + resultado);
    }
//    Cálculo de estadísticas:Escribe una función que tome una lista de números
//    como entrada y devuelva un objeto Stats que contenga estadísticas como el mínimo,
//    el máximo, la media de los números en la lista. Utiliza la interfaz funcional Function para realizar los cálculos necesarios.
    public void metodo2(){
// Lista de números
        List<Double> numeros = List.of(10.0, 20.0, 30.0, 40.0, 50.0);

        // Function que calcula las estadísticas
        Function<List<Double>, Estadisticas> calcularStats = lista -> {
            DoubleSummaryStatistics resumen = lista.stream()
                    .mapToDouble(Double::doubleValue)
                    .summaryStatistics();

            return new Estadisticas(
                    resumen.getMin(),
                    resumen.getMax(),
                    resumen.getAverage()
            );
        };

        Estadisticas resultado = calcularStats.apply(numeros);
        System.out.println(resultado);

    }
    public void metodo3(){
        // Definimos funciones individuales para cada regla
        Function<String, Boolean> tieneLongitudMinima = pwd -> pwd.length() >= 8;
        Function<String, Boolean> tieneMayuscula = pwd -> pwd.chars().anyMatch(Character::isUpperCase);
        Function<String, Boolean> tieneMinuscula = pwd -> pwd.chars().anyMatch(Character::isLowerCase);
        Function<String, Boolean> tieneNumero = pwd -> pwd.chars().anyMatch(Character::isDigit);
        Function<String, Boolean> tieneEspecial = pwd -> pwd.matches(".*[!@#$%^&*(),.?\":{}|<>].*");

        // Lista de validaciones
        List<Function<String, Boolean>> validaciones = List.of(
                tieneLongitudMinima,
                tieneMayuscula,
                tieneMinuscula,
                tieneNumero,
                tieneEspecial
        );

        // Función combinada: devuelve true si TODAS las validaciones son true
        Function<String, Boolean> validarPassword = pwd ->
                validaciones.stream().allMatch(f -> f.apply(pwd));

        // Ejemplos de prueba
        List<String> contrasenas = List.of(
                "abc",
                "Password1!",
                "passW0rd",
                "P@ssw0rd123"
        );

        contrasenas.forEach(pwd ->
                System.out.println(pwd + " → " + (validarPassword.apply(pwd) ? "VÁLIDA" : "NO VÁLIDA"))
        );
    }

    public static void main(String[] args) {
        EjemploFunciones ef1 = new EjemploFunciones();
        System.out.println("Ejemplo de Function - Filtrado de números pares");
       ef1.metodo3();
    }
}
