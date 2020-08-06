package com.example.demo;

public class BinarySearchImpl {

	private sortAlgorithm sortAlgorithm;

	public BinarySearchImpl(com.example.demo.sortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] arr, int target) {

		// let assume bubble sort logic are iplemented
		// bubble sort are used to sort the array
		//BubbleSortAlgorithm algorithm = new BubbleSortAlgorithm();
		int sortedrr = sortAlgorithm.sort(arr);

		return target;
	}

}
