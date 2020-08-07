package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
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
