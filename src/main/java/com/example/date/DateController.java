package com.example.date;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Operations.AboutDay;
import Operations.AddToDate;
import Operations.DifferenceBetweenDates;
import Operations.RelativeDays;




@Controller
public class DateController {
	

	@GetMapping("/")
	public String hm() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/calculate",method = RequestMethod.POST)
	public String calculate( DateAttr attr, ModelMap model) {
		Date date1;
		Date date2;
		String ans="";
		String result="";
		
		int option=attr.getItem();
		int n=attr.getNumber();
		
		
		if(attr.getA().length()==0) {
			 date1=new Date("00-00-0000");
		}else {
			 date1=new Date(attr.getA());
		}
		if(attr.getB().length()==0) {
			 date2=new Date("11-11-1111");
		}else {
			 date2=new Date(attr.getB());
		}
		int dd1=date1.getDay();
		int mm1=date1.getMonth();
		int yy1=date1.getYear();
		int dd2=date2.getDay();
		int mm2=date2.getMonth();
		int yy2=date2.getYear();
		
		
		LocalDate datee1= LocalDate.now();  
		LocalDate datee2= LocalDate.now(); 
		try {
			datee1 = LocalDate.of(yy1,mm1,dd1);
			datee2 = LocalDate.of(yy2,mm2,dd2);
		}catch(Exception e) {
			e.printStackTrace();
			model.addAttribute("ans","    Enter in dd-mm-yyyy format");
			return "index.jsp";
			
		}
		
		
		
		
		
		System.out.println(datee1+" "+datee2);
		AboutDay ob1=new AboutDay();
		AddToDate ob2=new AddToDate();
		DifferenceBetweenDates ob3=new DifferenceBetweenDates();
		RelativeDays ob4=new RelativeDays();
		
		
		
		if(option==1) {
			
			ans+=ob2.addDaysToDate(datee1, 1);
			
		}else if(option==2) {
			ans+=ob2.addDaysToDate(datee1, 2);
		}else if(option==3) {
			ans+=ob2.addDaysToDate(datee1, -1);
		}else if(option==4) {
			ans+=ob2.addDaysToDate(datee1, -2);
		}else if(option==5) {
			ans+=ob2.addWeeksToDate(datee1, -1);
		}else if(option==6) {
			ans+=ob2.addMonthsToDate(datee1, -1);
		}else if(option==7) {
			ans+=ob2.addWeeksToDate(datee1, 1);
		}else if(option==8) {
			ans+=ob2.addMonthsToDate(datee1, 1);
		}else if(option==9) {
			ans+=ob2.addYearsToDate(datee1, 1);
		}else if(option==10) {
			ans+=ob2.addYearsToDate(datee1, -1);
		}else if(option==11) {
			ans+=ob2.addWeeksToDate(datee1, n);
		}else if(option==12) {
			ans+=ob2.addDaysToDate(datee1, n);
		}else if(option==13) {
			ans+=ob2.addMonthsToDate(datee1, n);
		}else if(option==14) {
			ans+=ob2.addDaysToDate(datee1, -n);
		}else if(option==15) {
			ans+=ob4.getNWeekaEarlier(n, datee1);
		}else if(option==16) {
			ans+=ob2.addMonthsToDate(datee1, -n);
		}else if(option==17) {
			ans+=ob2.addYearsToDate(datee1, -n);
		}else if(option==18) {
			ans+=ob2.addYearsToDate(datee1, n);
		}else if(option==19) {
			ans+=ob3.daysBetweenDates(datee1, datee2);
			System.out.println(datee1);
			System.out.println(datee2);
			model.addAttribute("ans",ans);
			return "index.jsp";
		}else if(option==20) {
			ans+=ob1.getDay(datee1);
			model.addAttribute("ans",ans);
			return "index.jsp";
		}
		else if(option==21) {
			ans+=ob1.getWeek(datee1);
			model.addAttribute("ans",ans);
			return "index.jsp";
		}
		else if(option==22) {
			
			ans+=ob3.monthsBetweenDates(datee1, datee2);
			model.addAttribute("ans",ans);
			return "index.jsp";
		}
		else if(option==23) {
			ans+=ob3.yearBetweenDates(datee1, datee2);
			model.addAttribute("ans",ans);
			return "index.jsp";
		}
		else {
			ans+="Select an option";
			model.addAttribute("ans",ans);
			return "index.jsp";
		}
		result+=ans.split("-")[2]+"-"+ans.split("-")[1]+"-"+ans.split("-")[0];
		model.addAttribute("ans",result);
		
		
	
		
		
		
		
		
		return "index.jsp";
	}


}
