class Solution {
   public static double findMedianSortedArrays(int[] a, int[] b) {

		if (a.length > b.length) {
			return findMedianSortedArrays(b, a);
		}

		// a : smaller
		// b : bigger

		int x = a.length;
		int y = b.length;

		int lo = 0, hi = x ;
		boolean odd = (x + y) % 2 == 1;

//		if (x == 0) {
//
//			if (odd)
//				return b[y / 2];
//
//			else {
//				return (b[(y - 1) / 2] + b[(y - 1) / 2 + 1]) / 2.0;
//			}
//
//		}

		int maxLx = Integer.MIN_VALUE, maxLy = Integer.MIN_VALUE, minRx = Integer.MAX_VALUE, minRy = Integer.MAX_VALUE;

		while (lo <= hi) {

			int px = (lo + hi) / 2;
			int py = (x + y + 1) / 2 - px;
			maxLx = px != 0 ? a[px - 1] : Integer.MIN_VALUE;
			maxLy = py != 0 ? b[py - 1] : Integer.MIN_VALUE;
			minRx = x != px ? a[px] : Integer.MAX_VALUE;
			minRy = y != py ? b[py] : Integer.MAX_VALUE;

			if (maxLx <= minRy && maxLy <= minRx) {
				if (odd)
					return Math.max(maxLx, maxLy);

				else
					return (Math.max(maxLx, maxLy) + Math.min(minRx, minRy)) / 2.0;

			}

			if (maxLx > minRy)
				hi = px - 1;

			else
				lo = px + 1;

		}

//		if (odd) {
//			return Math.min(maxLy, minRx);
//		}
//
//		else {
//			return (maxLy + minRx) / 2.0;
//		}

		return 0;
	}
}
