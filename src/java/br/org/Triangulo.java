package br.org;

/**
 *
 * @author Adriano
 */
public class Triangulo {

    public static int tipoTriangulo(int lado1, int lado2, int lado3) {
        int tipo_tri;

        // Testa se há valores menores ou iguais a zero
        // Caso algum valor seja menor ou igual a zero não é triângulo
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            return 4;
        }

        tipo_tri = 0;

        // Testa se há lados iguais
        // Caso os 3 lados forem iguais será triângulo equilátero
        // Caso dois lados sejam iguais pode ser um triângulo Isosceles
        if (lado1 == lado2) {
            tipo_tri += 1;
        }
        if (lado1 == lado3) {
            tipo_tri += 2;
        }
        if (lado2 == lado3) {
            tipo_tri += 3;
        }

        // Testa se a soma de dois lados forem iguais ou menor que o terceiro lado
        // caso seja, não é um triângulo
        if (tipo_tri == 0) {
            if (lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1
                    || lado1 + lado3 <= lado2) {
                tipo_tri = 4;
            } else {
                tipo_tri = 1;
            }
            return tipo_tri;
        }

        if (tipo_tri > 3) {
            tipo_tri = 3;
        } else if (tipo_tri == 1 && lado1 + lado2 > lado3) {
            tipo_tri = 2;
        } else if (tipo_tri == 2 && lado1 + lado3 > lado2) {
            tipo_tri = 2;
        } else if (tipo_tri == 3 && lado2 + lado3 > lado1) {
            tipo_tri = 2;
        } else {
            tipo_tri = 4;
        }

        return tipo_tri;
    }

    public static String tipo(int lado1, int lado2, int lado3) {
        String tri_out = null;
        int tipoTri;
        tipoTri = tipoTriangulo(lado1, lado2, lado3);

        if (tipoTri == 1) {
            tri_out = "Triangulo Escaleno";
        }
        if (tipoTri == 2) {
            tri_out = "Triangulo Isosceles";
        }
        if (tipoTri == 3) {
            tri_out = "Triangulo Equilatero";
        }
        if (tipoTri == 4) {
            tri_out = "Nao e um Triangulo";
        }

        return tri_out;
    }
}
