abstract class SortAlgorithm {
        public final void sort() {
            printIntroduction();
            while (!isSorted()) {
                for (int i = 0; i < getCount() - 1; i++) {
                    if (isLess(i + 1, i)) {
                        swap(i, i + 1);
                    }
                }
            }
            printConclusion();
        }

        protected abstract void printIntroduction();
        protected abstract boolean isSorted();
        protected abstract int getCount();
        protected abstract boolean isLess(int i, int j);
        protected abstract void swap(int i, int j);
        protected abstract void printConclusion();
}

