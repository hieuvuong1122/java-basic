/**
 * SAYID
 * 2020
 */
package com.hieu.app.algorithm;

import java.util.Scanner;

/**
 * @author SAYID
 *
 */
public class KyThuatNhapMaTran {
	private int[] mangMotChieu;

	Scanner scanner = new Scanner(System.in);
	/**
	 * @return the mang2Chieu
	 */
	public int[] getMang2Chieu() {
		return mangMotChieu;
	}

	/**
	 * @param mangMotChieu the mang2Chieu to set
	 */
	public void setMang1Chieu() {
		for (int i = 0; i < 10; i++) {
			this.mangMotChieu[i] = scanner.nextInt();
		}
	}
}
