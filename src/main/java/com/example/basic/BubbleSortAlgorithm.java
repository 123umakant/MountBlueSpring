package com.example.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements sortAlgorithm {

	public int[] bubbleSort(int[] arr) {

		return arr;
	}

	@Override
	public int sort(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

}
