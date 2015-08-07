package com.yaowei.math.arithmetic.sort;

import java.util.List;

/**
 * Title: arithmetic
 * Description：本系列是关于排序的算法
 * 这个类实现了插入排序直接插入排序
 * @author <a href=mailto:ayw8255@163.com>anyaowei</a>
 * @date 2015/8/7 13:40
 */
public class StraightInsertionSort
{
	private int[] sourceInt;
	private float[] sourceFloat;
	private long[] sourceLong;
	private double[] sourceDouble;

	private List<Integer> sourceList;

	public StraightInsertionSort(List<Integer> sourceList)
	{
		this.sourceList = sourceList;
	}

	public StraightInsertionSort(int[] sourceInt)
	{
		this.sourceInt = sourceInt;
	}

	public StraightInsertionSort(float[] sourceFloat)
	{
		this.sourceFloat = sourceFloat;
	}

	public StraightInsertionSort(long[] sourceLong)
	{
		this.sourceLong = sourceLong;
	}

	public StraightInsertionSort(double[] sourceDouble)
	{
		this.sourceDouble = sourceDouble;
	}

	public void sortAsc()
	{
		if (sourceInt == null || sourceInt.length <= 0) return ;

		for (int i = 1; i < sourceInt.length; i++)
		{
			if (sourceInt[i] >= sourceInt[i-1]) continue;

			int j = i - 1;
			int x = sourceInt[i];
			sourceInt[i] = sourceInt[i - 1];
			while (j >= 0 && x < sourceInt[j])
			{
				sourceInt[j+1] = sourceInt[j];
				j--;
			}
			sourceInt[j+1] = x;
		}
	}

	public void sortDesc()
	{
		if (sourceInt == null || sourceInt.length <= 0) return ;

		for (int i = 1; i < sourceInt.length; i++)
		{
			if (sourceInt[i] <= sourceInt[i - 1]) continue;

			int j = i - 1;
			int x = sourceInt[i];
			sourceInt[i] = sourceInt[i - 1];
			while (j >= 0 && x > sourceInt[j])
			{
				sourceInt[j+1] = sourceInt[j];
				j--;
			}
			sourceInt[j+1] = x;
		}
	}
}