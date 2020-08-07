package com.example.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements sortAlgorithm{

	public int[] quickSort(int[] arr) { 	

		return arr;
	}

	@Override
	public int sort(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

}
