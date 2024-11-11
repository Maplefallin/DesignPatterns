public class BubbleSort extends SortAlgorithm{
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    @Override
    protected void printIntroduction() {
        System.out.println("Sorting using Bubble Sort");
    }

    @Override
    protected boolean isSorted() {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected int getCount() {
        return array.length;
    }

    @Override
    protected boolean isLess(int i, int j) {
        return array[i] > array[j];
    }

    @Override
    protected void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    @Override
    protected void printConclusion() {
        System.out.println("Bubble Sort completed");
    }
}
