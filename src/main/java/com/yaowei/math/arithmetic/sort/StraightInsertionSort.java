package com.yaowei.math.arithmetic.sort;

/**
 * Title: arithmetic
 * Description：本系列是关于排序的算法
 * 这个类实现了插入排序直接插入排序
 * @author <a href=mailto:ayw8255@163.com>anyaowei</a>
 * @date 2015/8/7 13:40
 */
public class StraightInsertionSort
{
	private int[] sourceInt = null;
	private float[] sourceFloat = null;
	private long[] sourceLong = null;
	private double[] sourceDouble = null;

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
		if (sourceInt != null && sourceInt.length >= 0) { sortAscInt(); return ;}

		if (sourceFloat != null && sourceFloat.length >= 0) { sortAscFloat(); return; }

		if (sourceLong != null && sourceLong.length >= 0) { sortAscLong(); return; }

		if (sourceDouble != null && sourceDouble.length >= 0) { sortAscDouble(); return; }
	}

	public void sortDesc()
	{
		if (sourceInt != null && sourceInt.length >= 0) { sortDescInt(); return ;}

		if (sourceFloat != null && sourceFloat.length >= 0) { sortDescFloat(); return; }

		if (sourceLong != null && sourceLong.length >= 0) { sortDescLong(); return; }

		if (sourceDouble != null && sourceDouble.length >= 0) { sortDescDouble(); return; }
	}

	private void sortAscInt()
	{
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

	private void sortAscLong()
	{
		for (int i = 1; i < sourceLong.length; i++)
		{
			if (sourceLong[i] >= sourceLong[i-1]) continue;

			int j = i - 1;
			long x = sourceLong[i];
			sourceLong[i] = sourceLong[i - 1];
			while (j >= 0 && x < sourceLong[j])
			{
				sourceLong[j+1] = sourceLong[j];
				j--;
			}
			sourceLong[j+1] = x;
		}
	}

	private void sortAscFloat()
	{
		for (int i = 1; i < sourceFloat.length; i++)
		{
			if (sourceFloat[i] >= sourceFloat[i-1]) continue;

			int j = i - 1;
			float x = sourceFloat[i];
			sourceFloat[i] = sourceFloat[i - 1];
			while (j >= 0 && x < sourceFloat[j])
			{
				sourceFloat[j+1] = sourceFloat[j];
				j--;
			}
			sourceFloat[j+1] = x;
		}
	}

	private void sortAscDouble()
	{
		for (int i = 1; i < sourceDouble.length; i++)
		{
			if (sourceDouble[i] >= sourceDouble[i-1]) continue;

			int j = i - 1;
			double x = sourceDouble[i];
			sourceDouble[i] = sourceDouble[i - 1];
			while (j >= 0 && x < sourceDouble[j])
			{
				sourceDouble[j+1] = sourceDouble[j];
				j--;
			}
			sourceDouble[j+1] = x;
		}
	}


	private void sortDescInt()
	{
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

	private void sortDescLong()
	{
		for (int i = 1; i < sourceLong.length; i++)
		{
			if (sourceLong[i] <= sourceLong[i - 1]) continue;

			int j = i - 1;
			long x = sourceLong[i];
			sourceLong[i] = sourceLong[i - 1];
			while (j >= 0 && x > sourceLong[j])
			{
				sourceLong[j+1] = sourceLong[j];
				j--;
			}
			sourceLong[j+1] = x;
		}
	}

	private void sortDescFloat()
	{
		for (int i = 1; i < sourceFloat.length; i++)
		{
			if (sourceFloat[i] <= sourceFloat[i - 1]) continue;

			int j = i - 1;
			float x = sourceFloat[i];
			sourceFloat[i] = sourceFloat[i - 1];
			while (j >= 0 && x > sourceFloat[j])
			{
				sourceFloat[j+1] = sourceFloat[j];
				j--;
			}
			sourceFloat[j+1] = x;
		}
	}

	private void sortDescDouble()
	{
		for (int i = 1; i < sourceDouble.length; i++)
		{
			if (sourceDouble[i] <= sourceDouble[i - 1]) continue;

			int j = i - 1;
			double x = sourceDouble[i];
			sourceDouble[i] = sourceDouble[i - 1];
			while (j >= 0 && x > sourceDouble[j])
			{
				sourceDouble[j+1] = sourceDouble[j];
				j--;
			}
			sourceDouble[j+1] = x;
		}
	}
}