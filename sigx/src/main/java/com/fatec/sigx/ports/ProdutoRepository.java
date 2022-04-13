package com.fatec.sigx.ports;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.sigx.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto,String>{
	Produto findByCodigoProduto(String codigo);
}
