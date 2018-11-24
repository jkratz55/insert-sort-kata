package io.jkratz.katas.insertsort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InsertSorterTest {

    @Test
    public void testInsertSort() {
        int[] testArray = {5, 4, 3, 2, 1};
        InsertSorter.sort(testArray);
        Assert.assertArrayEquals(new int[] {1,2,3,4,5}, testArray);

        int[] testArray2 = {1, 33, 22, 3, 77, 1, 22};
        InsertSorter.sort(testArray2);
        Assert.assertArrayEquals(new int[] {1,1,3,22,22,33,77}, testArray2);
    }
}
