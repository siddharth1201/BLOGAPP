package com.example.blogApp.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArticleRepository extends JpaRepository<ArticleEntity,Long>{

    ArticleEntity findBySlug(String slug);

}
