package com.scaler.tttundosolution.strategies;

import com.scaler.tttundosolution.models.Board;
import com.scaler.tttundosolution.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
}
