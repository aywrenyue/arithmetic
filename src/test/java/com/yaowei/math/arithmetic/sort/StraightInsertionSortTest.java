package com.yaowei.math.arithmetic.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Title: arithmetic
 *
 * @author <a href=mailto:ayw8255@163.com>anyaowei</a>
 * @date 2015/8/7 15:31
 */
public class StraightInsertionSortTest {

	@Test
	public void testIntArrayAscSort()
	{
		int[] a = {3,1,5,7,2,4,9,6};
		StraightInsertionSort sorter = new StraightInsertionSort(a);

		sorter.sortAsc();

		for (int i = 0; i < a.length; i++)
		{
			if (i == 0) continue;
			Assert.assertTrue(a[i - 1] <= a[i]);
		}
	}

	@Test
	public void testIntArrayDescSort()
	{
		int[] a = {3,1,5,7,2,4,9,6};
		StraightInsertionSort sorter = new StraightInsertionSort(a);

		sorter.sortDesc();

		for (int i = 0; i < a.length; i++)
		{
			if (i == 0) continue;
			System.out.print(a[i] + ",");
			Assert.assertTrue(a[i - 1] >= a[i]);
		}
	}
}
