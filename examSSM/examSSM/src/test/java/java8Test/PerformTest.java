package java8Test;

import java.util.stream.IntStream;

public class PerformTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long t0 = System.nanoTime();

        //初始化一个范围100万整数流,求能被2整除的数字，toArray（）是终点方法

        int a[]=IntStream.range(0, 1_000_000).filter(p -> p % 2==0).toArray();

        long t1 = System.nanoTime();

        //和上面功能一样，这里是用并行流来计算

        int b[]=IntStream.range(0, 1_000_000).parallel().filter(p -> p % 2==0).toArray();

        long t2 = System.nanoTime();

        //serial: 0.05s, parallel 0.11s--

        System.out.printf("serial: %.2fs, parallel %.2fs%n", (t1 - t0) * 1e-9, (t2 - t1) * 1e-9);

	}

}
