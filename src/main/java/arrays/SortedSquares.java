package arrays;

public class SortedSquares {

    public class Solution {
        public int[] sortedSquares(int[] A) {
            int[] squares = new int[A.length];
            for (int i = 0; i < A.length; i++) {
                squares[i] = A[i] * A[i];
            }
            sort(squares);
            return squares;
        }

        private void sort(int[] squares) {
            boolean shouldSortAgain;
            do {
                shouldSortAgain = false;
                for (int i = 0; i < squares.length; i++) {
                    if (i <= squares.length - 2 && squares[i] > squares[i + 1]) {
                        shouldSortAgain = true;
                        int nextSquare = squares[i + 1];
                        squares[i + 1] = squares[i];
                        squares[i] = nextSquare;
                    }
                }
            } while (shouldSortAgain);
        }
    }

}
