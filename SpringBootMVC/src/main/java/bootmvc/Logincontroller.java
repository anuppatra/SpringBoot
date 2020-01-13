package bootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Logincontroller {
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showLoginform(){
		return "Login";
	}
	
	@RequestMapping (value="/login",method=RequestMethod.POST)
	public ModelAndView validate(@ModelAttribute("login") Login login){
		ModelAndView mav=new ModelAndView();
		mav.addObject(login);
		mav.setViewName("Welcome");
		
		return mav;
		
	}
}
