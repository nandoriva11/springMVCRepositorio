package idat.edu.pe.daa2.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/facturas")
public class FacturaController {
	
	@GetMapping("/inicio")
	public String greeting(Model model) {
		model.addAttribute("nombreModulo", "EMISION DE FACTURAS");
		return "resultado";
	}

}
