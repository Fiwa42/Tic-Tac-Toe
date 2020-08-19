package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String whole = "_________";
        
        char[] ch = whole.toCharArray();  
        
        System.out.println("---------");
        System.out.println("| " + ch[0] + " " + ch[1] + " " + ch[2] + " |");
        System.out.println("| " + ch[3] + " " + ch[4] + " " + ch[5] + " |");
        System.out.println("| " + ch[6] + " " + ch[7] + " " + ch[8] + " |");
        System.out.println("---------");
        
        char s = ' ';
        
        for (int i = 1; i <= 10; i++) {
        boolean winner1 = false;
        boolean winner2 = false;
        
        if (winner1 == false) {
            if (ch[0] == 'X' && ch[1] == 'X' && ch[2] == 'X') { // Row 1 for X - horizontal
                winner1 = true;
            } else if (ch[3] == 'X' && ch[4] == 'X' && ch[5] == 'X') { // Row 2 for X - horizontal
                winner1 = true;
            } else if (ch[6] == 'X' && ch[7] == 'X' && ch[8] == 'X') { // Row 3 for X - horinzontal
                winner1 = true;
            } else if (ch[0] == 'X' && ch[3] == 'X' && ch[6] == 'X') { // Row 1 for X - vertical
                winner1 = true;
            } else if (ch[1] == 'X' && ch[4] == 'X' && ch[7] == 'X') { // Row 2 for X - vertical
                winner1 = true;
            } else if (ch[2] == 'X' && ch[5] == 'X' && ch[8] == 'X') { // Row 3 for X - vertical
                winner1 = true;
            } else if (ch[0] == 'X' && ch[4] == 'X' && ch[8] == 'X') { // Cross left up - right down
                winner1 = true;
            } else if (ch[2] == 'X' && ch[4] == 'X' && ch[6] == 'X') { // Cross right up - left down
                winner1 = true;
            }    
        }
        if (winner2 == false) {
            if (ch[0] == 'O' && ch[1] == 'O' && ch[2] == 'O') { // Row 1 for O - horizontal
                winner2 = true;
            } else if (ch[3] == 'O' && ch[4] == 'O' && ch[5] == 'O') { // Row 2 for O - horizontal
                winner2 = true;
            } else if (ch[6] == 'O' && ch[7] == 'O' && ch[8] == 'O') { // Row 3 for O - horinzontal
                winner2 = true;
            } else if (ch[0] == 'O' && ch[3] == 'O' && ch[6] == 'O') { // Row 1 for O - vertical
                winner2 = true;
            } else if (ch[1] == 'O' && ch[4] == 'O' && ch[7] == 'O') { // Row 2 for O - vertical
                winner2 = true;
            } else if (ch[2] == 'O' && ch[5] == 'O' && ch[8] == 'O') { // Row 3 for O - vertical
                winner2 = true;
            } else if (ch[0] == 'O' && ch[4] == 'O' && ch[8] == 'O') { // Cross left up - right down
                winner2 = true;
            } else if (ch[2] == 'O' && ch[4] == 'O' && ch[6] == 'O') { // Cross right up - left down
                winner2 = true;
            }    
        }

        boolean draw = false;
        
        if (winner1 == false && winner2 == false) {
            if (ch[0] != '_' && ch[1] != '_' && ch[2] != '_' &&
                ch[3] != '_' && ch[4] != '_' && ch[5] != '_' &&
                ch[6] != '_' && ch[7] != '_' && ch[8] != '_') {
                draw = true;
        }

        while(winner1 == false && winner2 == false && draw == false) {
            if (i % 2 == 0) {
                s = 'O';
            } else {
                s = 'X';
            }
            int firstCor = scanner.nextInt();
            int secondCor = scanner.nextInt();
        
            if (firstCor == 1) {
                if (secondCor == 1) {
                    if (ch[6] == '_') {
                        ch[6] = s;
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }
                } else if (secondCor == 2) {
                    if (ch[3] == '_') {
                        ch[3] = s;
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }
                } else if (secondCor == 3) {
                    if (ch[0] == '_') {
                        ch[0] = s;
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }
                } else {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
            } else if (firstCor == 2) {
                if (secondCor == 1) {
                    if (ch[7] == '_') {
                        ch[7] = s;
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }
                } else if (secondCor == 2) {
                    if (ch[4] == '_') {
                        ch[4] = s;
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }
                } else if (secondCor == 3) {
                    if (ch[1] == '_') {
                        ch[1] = s;
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }
                } else {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
            }  else if (firstCor == 3) {
                if (secondCor == 1) {
                    if (ch[8] == '_') {
                        ch[8] = s;
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }
                } else if (secondCor == 2) {
                    if (ch[5] == '_') {
                        ch[5] = s;
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }
                } else if (secondCor == 3) {
                    if (ch[2] == '_') {
                        ch[2] = s;
                        break;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }
                } else {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }    
            } else {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }
        }
        System.out.println("---------");
        System.out.println("| " + ch[0] + " " + ch[1] + " " + ch[2] + " |");
        System.out.println("| " + ch[3] + " " + ch[4] + " " + ch[5] + " |");
        System.out.println("| " + ch[6] + " " + ch[7] + " " + ch[8] + " |");
        System.out.println("---------");   
        } 
        
        if (winner1 == true && winner2 == false) {
            System.out.println("X wins");
        } else if (winner1 == false && winner2 == true) {
            System.out.println("O wins");
        } else if (winner1 ==  false && winner2 == false && draw == true) {
            System.out.println("Draw");
        }
    }
} 
}       