package br.com.fiap.nac.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.nac.model.EletronicoModel;
import br.com.fiap.nac.repository.EletronicoRepository;

@Controller
@RequestMapping("/eletronico")
public class EletronicoController {

	EletronicoRepository repository = EletronicoRepository.getInstance();

	@GetMapping("/form")
	public String open(@RequestParam String page, 
					   @RequestParam(required = false) Long id,
					   @ModelAttribute("eletronicoModel") EletronicoModel eletronicoModel, 
					   Model model) {
		
		if("eletronico-editar".equals(page)) {
			model.addAttribute("eletronicoModel", repository.findById(id));
		}
		
		return page;
	}
	
	@GetMapping()
	public String findAll(Model model) {
		model.addAttribute("eletronicos", repository.findAll());
		return "eletronicos";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable("id") long id, Model model) {
		
		model.addAttribute("eletronico", repository.findById(id));
		return "eletronico-detalhe";
	}

	@PostMapping()
	public String save(@Valid EletronicoModel eletronicoModel, BindingResult bindingResults,
			RedirectAttributes redirectAttributes) {
		
		if (bindingResults.hasErrors()) {
			return "eletronico-novo";
		}
		repository.save(eletronicoModel);
		redirectAttributes.addFlashAttribute("messages", "eletronico cadastrado com sucesso");
		return "redirect:/eletronico";
	}

	@PutMapping("/{id}")
	public String update(@PathVariable("id")long id, @Valid EletronicoModel eletronicoModel,BindingResult bindingResults,RedirectAttributes redirectAttributes) {
		if (bindingResults.hasErrors()) {
			return "eletronico-editar";
		}
		eletronicoModel.setId(id);
		repository.update(eletronicoModel);
		redirectAttributes.addFlashAttribute("messages", "eletronico alterado com sucesso");
		
		return "redirect:/eletronico";
		
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") long id, RedirectAttributes redirectAttributes) {
		repository.deleteById(id);
		redirectAttributes.addFlashAttribute("messages","eletronico excluido com sucesso");
		return "redirect:/eletronico";
	}

}
