package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class ex1 {
	public static List<products> data;
	public List<products> getdata(List<products> data)
    {
    	List<products> data1=null;    	
    	if(data==null)
    	{
    	products One=new products(01,"ice");
    	products Two=new products(02,"rice");
    	products Three=new products(03,"water");
		data1=new ArrayList<>();
		data1.add(One);
		data1.add(Two);
		data1.add(Three);
		return data1;
    	}
    	else
    	{
    		return data;
    	}    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<products> data;
		products One=new products(01,"ice");
		products Two=new products(02,"rice");
		products Three=new products(03,"water");
		data=new ArrayList<>();		
	    data.add(One);data.add(Two);data.add(Three);
	    products prod=null;
	    prod=new productDAO().findproduct(1, data);
	    System.out.println();
	    System.out.println(prod.toString());
	}*/
		/*List<products> data;
		products One=new products(01,"ice");
		products Two=new products(02,"rice");
		products Three=new products(03,"water");
		data=new ArrayList<>();		
	    data.add(One);data.add(Two);data.add(Three);
	    int id=1;
	    int id0;
	    products Te=new products(01,"ic");
   	 id0=new productDAO().findid(id, data);
   	 System.out.println(id0);
   	 
   	 data.set(id0, Te);
   	 for (products a:data)
   	 {
   		 System.out.println(a.toString());
   	 }*/
		List<products> data2=new ex1().getdata(data);
		System.out.println(data2.size());
}
}