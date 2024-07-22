package com.example.blogApp.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blogApp.article.dtos.CreateArticleDTO;
import com.example.blogApp.article.dtos.UpdateArticleDTO;
import com.example.blogApp.user.UserEntity;
import com.example.blogApp.user.UserRepository;
import com.example.blogApp.user.UserService;
import com.example.blogApp.user.UsernNotFoundException;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private UserRepository userRepository;

    public Iterable<ArticleEntity> getAllArticles(){
        return articleRepository.findAll();
    }

    public ArticleEntity getArticleBySlug(String slug) throws Exception{
        var article = articleRepository.findBySlug(slug);

        if(article==null){
            throw new ArticleNotFoundException("article not found exception");
        }

        return article;
    }

    public ArticleEntity updateArticle(Long articleId, UpdateArticleDTO body){
        var article  = articleRepository.findById(articleId).orElseThrow(()-> new ArticleNotFoundException(articleId));

        if(body.getBody()!= null) article.setBody(body.getBody());

        if(body.getTitle()!=null){
            article.setBody(body.getTitle());
            article.setSlug(body.getTitle().toLowerCase().replaceAll("\\s+", "-"));
        }

        if(body.getSubtitle()!=null){
            article.setBody(body.getSubtitle());
        }
 
        return article;
    }

    public ArticleEntity createArticle(CreateArticleDTO a, Long authorId){
        var author = userRepository.findById(authorId).orElseThrow(()-> new UsernNotFoundException(authorId));

        return articleRepository.save(ArticleEntity.builder()
                                    .title(a.getTitle())
                                    .body(a.getBody())
                                    //create slug function
                                    .slug(a.getTitle().toLowerCase().replaceAll("\\s+","-"))
                                    .author(author)
                                    .build());

    }

    static class ArticleNotFoundException extends IllegalArgumentException{
        public ArticleNotFoundException(String slug){
            super("Articles"+slug+"notfound");
        }

        public ArticleNotFoundException(Long id){
            super("Article Id:"+id+"notfound");
        }
    }
}


