package com.produtos.apirest_MK.Controle;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest_MK.ProdutoRepository.ProdutoRepository;
import com.produtos.apirest_MK.models.Produtos;

@RestController
@RequestMapping(value = "/api")
public class ProdutoControle {
	
	@Autowired
	ProdutoRepository produtoEntidadeRepo;
	
	//Get de todos os registros de Produtos
	@GetMapping(value = "/produtos")
    public List<Produtos> listaProdutos(){
		return produtoEntidadeRepo.findAll();
		
	}
	
	//Get por id
	
	@GetMapping(value = "/produto/{id}")
	public Produtos listaProdutoUnico(@PathVariable(value = "id")long id) {
	
	return produtoEntidadeRepo.findById(id);
	
	}
	
	@PostMapping(value = "/produtosave")
	public Produtos salvaProduto(@RequestBody @Validated Produtos produto) {
		return produtoEntidadeRepo.save(produto);
		

	}
	@DeleteMapping(value = "/produto")
	public Produtos deletar(@RequestBody @Validated Produtos produto) {
		
		 produtoEntidadeRepo.delete(produto);
		 
		 return (produto);
	}
	
	}

