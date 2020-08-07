package com.example.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	@Qualifier("bubble")
	private sortAlgorithm sortAlgorithm;

	/*
	 * public BinarySearchImpl(com.example.demo.sortAlgorithm sortAlgorithm) {
	 * super(); this.sortAlgorithm = sortAlgorithm; }
	 */

	// setter injection

	/*public void setSortAlgorithm(sortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}*/

	public int binarySearch(int[] arr, int target) {

		// let assume bubble sort logic are iplemented
		// bubble sort are used to sort the array
		// BubbleSortAlgorithm algorithm = new BubbleSortAlgorithm();
		int sortedrr = sortAlgorithm.sort(arr);

		return target;
	}

}
