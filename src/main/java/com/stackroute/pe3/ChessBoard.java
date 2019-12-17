package com.stackroute.pe3;

public class ChessBoard {
    public String[][] chess(int rows, int columns) {
        {
            String output[][] = new String[rows][columns];
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < columns; j++) {
                    if (((i + j) % 2) == 0) {
                        output[i][j] = "WW";
                    }
                    else {
                        output[i][j] = "BB";
                    }
                }
            }
            return output;
        }
    }
}
