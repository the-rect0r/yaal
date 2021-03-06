package net.egork;

import net.egork.io.IOUtils;
import net.egork.misc.ArrayUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		int count = in.readInt();
		int[] durability = IOUtils.readIntArray(in, count);
		Arrays.sort(durability);
		int[] weight = new int[count];
		Arrays.fill(weight, 1);
		for (int i = 0; i < count; i++) {
			int bestAt = -1;
			int maxWeight = 0;
			for (int j = 0; j < i; j++) {
				if (weight[j] > maxWeight && weight[j] <= durability[i]) {
					bestAt = j;
					maxWeight = weight[j];
				}
			}
			weight[i] = maxWeight + 1;
			if (bestAt != -1)
				weight[bestAt] = 0;
		}
		out.printLine(count - ArrayUtils.count(weight, 0));
    }
}
