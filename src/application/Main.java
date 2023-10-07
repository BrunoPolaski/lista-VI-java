package application;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//        EXERCICIO 1

//        int[][] matrix = new int[4][4];
//        int maioresQue10 = 0;
//        Random random = new Random();
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = random.nextInt(100);
//                if(matrix[i][j] > 10) maioresQue10++;
//            }
//        }
//        System.out.println("Valores maiores que 10: " + maioresQue10);

//        EXERCICIO 2
//        int[][] matrix = new int[4][4];
//        int maior = 0;
//        int maiorLinha = 0;
//        int maiorColuna = 0;
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = random.nextInt(100);
//                if(i == 0 && j == 0) {
//                    maior = matrix[i][j];
//                } else {
//                    if(matrix[i][j] > maior) {
//                        maior = matrix[i][j];
//                        maiorLinha = i;
//                        maiorColuna = j;
//                    }
//                }
//            }
//        }
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("Valor maior: " + maior);
//        System.out.println("Linha: " + maiorLinha + "\nColuna: " + maiorColuna);

//        EXERCICIO 3
//        int[][] matrix1 = new int[4][4];
//        int[][] matrix2 = new int[4][4];
//        int[][] matrix3 = new int[4][4];
//
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1[i].length; j++) {
//                matrix1[i][j] = random.nextInt();
//                matrix2[i][j] = random.nextInt();
//                if(matrix1[i][j] > matrix2[i][j]){
//                    matrix3[i][j] = matrix1[i][j];
//                }else{
//                    matrix3[i][j] = matrix2[i][j];
//                }
//            }
//        }
//
//        for (int i = 0; i < matrix3.length; i++) {
//            for (int j = 0; j < matrix3[i].length; j++) {
//                System.out.println(matrix3[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        EXERCICIO 4
//        int[][] matrix1 = new int[2][2];
//        int[][] matrix2 = new int[2][2];
//        int[][] matrix3 = new int[2][2];
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1[i].length; j++) {
//                matrix1[i][j] = random.nextInt(1, 10);
//                matrix2[i][j] = random.nextInt(1, 10);
//            }
//        }
//
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix2[i].length; j++) {
//                for (int k = 0; k < matrix1[i].length; k++) {
//                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
//                }
//            }
//        }
//        System.out.println("\n---------------Matriz 1----------------");
//        for (int i = 0; i < matrix2.length; i++) {
//            for (int j = 0; j < matrix2[i].length; j++) {
//                System.out.print(matrix1[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("\n---------------Matriz 2----------------");
//        for (int i = 0; i < matrix2.length; i++) {
//            for (int j = 0; j < matrix2[i].length; j++) {
//                System.out.print(matrix2[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("\n---------------Matriz 3----------------");
//        for (int i = 0; i < matrix2.length; i++) {
//            for (int j = 0; j < matrix2[i].length; j++) {
//                System.out.print(matrix3[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        EXERCICIO 5
//        int[][] matrix1 = new int[2][2];
//        int[][] matrix3 = new int[2][2];
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1[i].length; j++) {
//                matrix1[i][j] = random.nextInt(1, 10);
//            }
//        }
//
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1[i].length; j++) {
//                for (int k = 0; k < matrix1[i].length; k++) {
//                    matrix3[i][j] += matrix1[i][k] * matrix1[k][j];
//                }
//            }
//        }
//        System.out.println("\n---------------Matriz 1----------------");
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1[i].length; j++) {
//                System.out.print(matrix1[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("\n---------------Matriz 1.2----------------");
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1[i].length; j++) {
//                System.out.print(matrix1[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("\n---------------Matriz 3----------------");
//        for (int i = 0; i < matrix1.length; i++) {
//            for (int j = 0; j < matrix1[i].length; j++) {
//                System.out.print(matrix3[i][j] + "\t");
//            }
//            System.out.println();
//        }
    }
}
