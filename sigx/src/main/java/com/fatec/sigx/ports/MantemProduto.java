package com.fatec.sigx.ports;

import java.util.List;
import java.util.Optional;
import com.fatec.sigx.model.Produto;

public interface MantemProduto {
	List<Produto> consultaTodos();
	Produto consultaPorCodigoProduto(String codigo);
	Optional<Produto> consultaPorId(Long id);
	Optional<Produto> save(Produto produto);
	void delete (Long id);
	Optional<Produto> altera ( Produto produto);
}
