package tw.idv.cha102.g7.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.idv.cha102.g7.article.entity.Article;
import tw.idv.cha102.g7.article.service.ArticleBackEndService;

import java.util.List;

@RestController
@RequestMapping("/BackEnd")
public class ArticleBackEndController {
    @Autowired
    ArticleBackEndService articleBackEndService;
    // 後台瀏覽所有文章
    @GetMapping("/articles")
    public List<Article> getAll() {
        return articleBackEndService.getAll();
    }

    //後台瀏覽下架文章
    @GetMapping("/NonPublic")
    public List<Article> findNonPublicArticle(){return articleBackEndService.findNonPublicArticle();}
}
