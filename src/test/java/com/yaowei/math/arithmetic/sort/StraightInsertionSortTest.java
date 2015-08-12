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
	public void testIntArraySort()
	{
		int[] a = {3,1,5,7,2,4,9,6};
		StraightInsertionSort sorter = new StraightInsertionSort(a);

		sorter.sortAsc();

		for (int i = 0; i < a.length; i++)
		{
			if (i == 0) continue;
			Assert.assertTrue(a[i - 1] <= a[i]);
		}

		sorter.sortDesc();

		for (int i = 0; i < a.length; i++)
		{
			if (i == 0) continue;
			Assert.assertTrue(a[i - 1] >= a[i]);
		}
	}

	@Test
	public void testLongArraySort()
	{
		long[] a = {3l,1l,5l,7l,2l,4l,9l,6l};

		StraightInsertionSort sorter = new StraightInsertionSort(a);

		sorter.sortAsc();
		for (int i = 0; i < a.length; i++)
		{
			if (i == 0) continue;
			Assert.assertTrue(a[i - 1] <= a[i]);
		}

		sorter.sortDesc();
		for (int i = 0; i < a.length; i++)
		{
			if (i == 0) continue;
			Assert.assertTrue(a[i - 1] >= a[i]);
		}
	}

	@Test
	public void testFloatArraySort()
	{
		float[] a = {3f,1f,5f,7f,2f,4f,9f,6f};

		StraightInsertionSort sorter = new StraightInsertionSort(a);

		sorter.sortAsc();
		for (int i = 0; i < a.length; i++)
		{
			if (i == 0) continue;
			Assert.assertTrue(a[i - 1] <= a[i]);
		}

		sorter.sortDesc();
		for (int i = 0; i < a.length; i++)
		{
			if (i == 0) continue;
			Assert.assertTrue(a[i - 1] >= a[i]);
		}
	}

	@Test
	public void testDoubleArraySort()
	{
		double[] a = {3d,1d,5d,7d,2d,4d,9d,6d};

		StraightInsertionSort sorter = new StraightInsertionSort(a);

		sorter.sortAsc();
		for (int i = 0; i < a.length; i++)
		{
			if (i == 0) continue;
			Assert.assertTrue(a[i - 1] <= a[i]);
		}

		sorter.sortDesc();
		for (int i = 0; i < a.length; i++)
		{
			if (i == 0) continue;
			Assert.assertTrue(a[i - 1] >= a[i]);
		}
	}
}
