package com.fatec.sigx;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fatec.sigx.model.Produto;
import com.fatec.sigx.ports.ProdutoRepository;
@SpringBootTest
class REQ03ConsultaProduto {
	@Autowired
	ProdutoRepository repository;
	@Test
	void test() {
		Produto p = new Produto ("1111", 4, "parafuso") ;
		repository.save(p);
		//No property 'codigoProdutox' found for type 'Produto'!
		Optional<Produto> produto = repository.findByCodigoProduto("1111");
		assertTrue(produto.isPresent());
	}

}
