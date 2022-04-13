package com.fatec.sigx.adapters;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fatec.sigx.model.Cliente;
import com.fatec.sigx.model.Produto;

@Controller
@RequestMapping(path = "/sig")
public class GUIProdutoController {
	Logger logger = LogManager.getLogger(GUIProdutoController.class);
	@GetMapping("/produto")
	public ModelAndView retornaFormDeCadastroDe(Produto produto) {
		ModelAndView mv = new ModelAndView("cadastrarProduto");
		mv.addObject("produto", produto);
		return mv;
	}
	@PostMapping("/produtos")
	public ModelAndView save(@Valid Produto produto, BindingResult result) {
		ModelAndView mv = new ModelAndView("consultarProduto");
		return mv;
	}
	@GetMapping("/produtos")
	public ModelAndView retornaFormDeConsultaTodosProdutos() {
		logger.info(">>>>>> controller consulta todos chamado" );
		ModelAndView modelAndView = new ModelAndView("consultarProduto");
		return modelAndView;
	}
}
