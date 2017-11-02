package com.ksana.engel.api.article.repo;

import com.ksana.engel.api.article.model.ArticleInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepo extends JpaRepository<ArticleInfo,Long>{
    public List<ArticleInfo> findAll();
    public Page<ArticleInfo> findAll(Pageable p);
}
