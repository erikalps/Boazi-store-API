package com.baozi.boazi_story.repository;
import com.baozi.boazi_story.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	
}
