package com.example.demopractise;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class CalculatorController {
	
	
	
	@RequestMapping("/")
    public String home() {
		
        return "index.jsp";
    }
	@RequestMapping(value="/calculate",method = RequestMethod.POST)
	public String calculate(@ModelAttribute("calc") Calculator calculator, ModelMap model) {
		int ans=0;
		float ans1=0f;
		if(calculator.getFunc().equalsIgnoreCase("add")) {
			ans= calculator.getA()+calculator.getB();
		}
		if(calculator.getFunc().equalsIgnoreCase("sub")) {
			ans= calculator.getA()-calculator.getB();
		}
		if(calculator.getFunc().equalsIgnoreCase("mul")) {
			ans= calculator.getA()*calculator.getB();
		}
		if(calculator.getFunc().equalsIgnoreCase("div")) {
			try {
				ans1=(float) ((float)calculator.getA()/calculator.getB());
			}
			catch(Exception e) {
				model.addAttribute("ans", "   Cannot divide by Zero");
				return "index.jsp";
				
			}
			model.addAttribute("ans", ans1);
			return "index.jsp";
			
		}
		model.addAttribute("ans", ans);
		return "index.jsp";
	}


	
	
}
