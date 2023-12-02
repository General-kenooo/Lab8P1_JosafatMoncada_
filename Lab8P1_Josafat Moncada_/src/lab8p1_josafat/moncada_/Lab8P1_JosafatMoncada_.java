
package lab8p1_josafat.moncada_;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab8P1_JosafatMoncada_ {
    //fila 3 silla 13  

    public int[][] currentGeneration;
    public int[][] nextGeneration;
    public ArrayList<String> liveCellsCoordinates;
    public int totalRounds;

    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1.Game of life\n2. Salir.");
        // Constructor vacío

     public Lab8P1_JosafatMoncada_() {
        this.currentGeneration = new int[10][10];
        this.nextGeneration = new int[10][10];
        this.liveCellsCoordinates = new ArrayList<>();
        this.totalRounds = 0;

    }

    public int[][] getCurrentGeneration() {
        return currentGeneration;
    }

    public void setCurrentGeneration(int[][] currentGeneration) {
        this.currentGeneration = currentGeneration;
    }

    // Getter y setter para nextGeneration
    public int[][] getNextGeneration() {
        return nextGeneration;
    }

    public void setNextGeneration(int[][] nextGeneration) {
        this.nextGeneration = nextGeneration;
    }

    public ArrayList<String> getLiveCellsCoordinates() {
        return liveCellsCoordinates;
    }

    public void setLiveCellsCoordinates(ArrayList<String> liveCellsCoordinates) {
        this.liveCellsCoordinates = liveCellsCoordinates;
    }

    public int getTotalRounds() {
        return totalRounds;
    }

    public void setTotalRounds(int totalRounds) {
        this.totalRounds = totalRounds;
    }

    public void fillBoardAndCoordinates() {
        Random random = new Random();

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                int cellValue = random.nextInt(2);
                currentGeneration[i][j] = cellValue;

                if (cellValue == 1) {
                    liveCellsCoordinates.add(i + ":" + j);
                }
            }
        }
    }

    public void play(int rounds) {
        totalRounds = rounds;

        // Imprimir tablero inicial
        System.out.println("Coordenadas del tablero inicial:");
        print(liveCellsCoordinates);

        for (int round = 1; round <= rounds; round++) {
            nextGen();
            System.out.println("Ronda " + round + ":");
            System.out.println("Coordenadas de celdas vivas:");
            print(liveCellsCoordinates);
        }
    }

    public void nextGen() {
        // Implementa la lógica para calcular la siguiente generación
        // Actualizar 
        // Realizar swap 
    }

    public void print(ArrayList<String> liveCells) {
        int[][] provisionalBoard = new int[10][10];

        for (String coordinate : liveCells) {
            String[] parts = coordinate.split(":");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            provisionalBoard[x][y] = 1;
        }

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                System.out.print("[" + provisionalBoard[i][j] + "]");
            }
            System.out.println();
        }

    }

}
        
            
            
    

    

    
          
                
                   
                    
                    
                    
                    
                  
    