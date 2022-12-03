package com.example.demo.model;

import java.util.List;

public class productDAO {
	public products findproduct(int id, List<products> vo) {
		products prod = null;
		int index=-1;
		System.out.print(vo.size());
		for (int i = 0; i < vo.size(); i++) {
			if (vo.get(i).getProductID() == id) {
				index = i;
				break;
			}
		}
		prod=vo.get(index);
		return prod;
	}
	

	public int findid(int id, List<products> vo) {
		products prod = null;
		int index=-1;
		System.out.println(vo.size());
		for (int i = 0; i < vo.size(); i++) {
			if (vo.get(i).getProductID() == id) {
				index = i;
				break;
			}
		}
		return index;
	}
}
