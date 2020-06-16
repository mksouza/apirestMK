package com.produtos.apirest_MK.ProdutoRepository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.produtos.apirest_MK.models.Produtos;

public interface ProdutoRepository extends JpaRepository<Produtos, Long> {

	
	Produtos findById(long id);
	

}
