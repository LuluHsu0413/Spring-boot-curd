package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.productDAO;
import com.example.demo.model.products;


@Controller
public class ProductController {
	List<products> data;
	
	@GetMapping("/product")
	public String helloIndex(ModelMap m){
		List<products> data2=getdata(data);
    	m.addAttribute("dataList",data2);
    	return "product";
	}
	
    @RequestMapping("/product/update")
    public String update(@ModelAttribute("products") products products, ModelMap model) {   
       	System.out.println(products.toString());
    	data.add(products); 
    	model.addAttribute ("dataList",data);       
		return "index";
    }
    @RequestMapping("/update/{id}")
	public ModelAndView updateEach(@PathVariable("id") int id,Model model)
	{
    	data=getdata(data);
    	System.out.println(data.size());
    	products product=null;
    	System.out.println("id "+id);
    	product=new productDAO().findproduct(id, data);
    	if(product!=null)
    	{
    		model.addAttribute ("products",product);   
    		return new ModelAndView("productsUpdate", "command", product);
    	}       
    	else
    	{
    		System.out.println("找不到");
    		return new ModelAndView("productsUpdate", "command", product);
    	}
	}
    @RequestMapping(value="/update/test",method = RequestMethod.POST)
    public ModelAndView updateprod(@ModelAttribute("products") products products) {   
       	System.out.println(products.toString());
    	 int id=products.getProductID();
    	 System.out.println(id);
    	 int id0;
    	 id0=new productDAO().findid(id, data);
    	 System.out.println(id0);    	 
    	 data.set(id0, products);
    	 return new ModelAndView("productsUpdate", "command",products);
	  }	
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
		data=data1;
		System.out.println(data.size());
		return data1;
    	}
    	else
    	{
    		return data;
    	}    	
    }
    @RequestMapping("/delete/{id}")
   	public String delete(@PathVariable("id") int id,Model model)
   	{
    data=getdata(data);
	System.out.println(data.size());
	int id1=-1;
	System.out.println("id "+id);
	id1=new productDAO().findid(id, data);
	if(id1!=-1)
	{
		data.remove(id1);   	
		return "redirect:/product";
	}       
	else
	{
		System.out.println("找不到");		
		return "redirect:/product";
	}
   	}
}
