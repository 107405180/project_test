package tw.idv.cha102.g7.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tw.idv.cha102.g7.article.entity.ArticlePosting;
import tw.idv.cha102.g7.article.service.ArticlePostingService;

@RestController
@CrossOrigin
public class ArticlePostingController {
    @Autowired
    private ArticlePostingService articlePostingService;

    // 新增文章
    @PostMapping("/post")

    public void insert(@RequestBody ArticlePosting article) {
        articlePostingService.postArticle(article);
    }

}
