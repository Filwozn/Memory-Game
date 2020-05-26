package memoryGame;

public enum DifficultLevel {
    EASY(2,4), MEDIUM(4,4), HARD(5,12);

    private int rows;

    private int columns;
    DifficultLevel(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}
