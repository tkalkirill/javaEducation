package org.tkalenko.education.java.algorithm.sort;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SortTest {

    private static int[] src;

    private static int[] expected;

    private int[] actual;

    private Sort sort;

    public SortTest(Sort sort) {
        this.sort = sort;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(
                //bubble and his modifications
                new Object[]{new Bubble()},
                new Object[]{new BubbleOptimize()},
                new Object[]{new OddEven()},
                new Object[]{new Cocktail()},
                new Object[]{new Comb()}
        );
    }

    @BeforeClass
    public static void beforeClass() {
        src = new int[]{7, 32, 14, 77, 21, 4, 0, 65, 31, 2, 1, 55, 78, 92, 3, 18, 87, 5, 12, 79, 99, 8, 14, 25, 33};
        expected = Arrays.copyOf(src, src.length);
        Arrays.sort(expected);
    }

    @Before
    public void before() {
        this.actual = Arrays.copyOf(src, src.length);
    }

    @Test
    public void sortTest() {
        String name = this.sort.getClass().getSimpleName();
        System.out.println(name);
        this.sort.sort(this.actual);
        Assert.assertArrayEquals(name, expected, this.actual);
    }
}
