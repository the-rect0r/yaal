package net.egork;

import net.egork.collections.ArrayUtils;
import net.egork.collections.CollectionUtils;
import net.egork.collections.sequence.Array;
import net.egork.io.IOUtils;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class Report {
	public void solve(int testNumber, InputReader in, OutputWriter out) {
		int count = in.readInt();
		int[] sides = IOUtils.readIntArray(in, count);
		long sum = ArrayUtils.sumArray(sides);
		int max = CollectionUtils.maxElement(Array.wrap(sides));
		if (2 * max >= sum)
			out.printLine("NO");
		else
			out.printLine("YES");
	}
}
