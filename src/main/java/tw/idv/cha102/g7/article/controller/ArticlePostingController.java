package tw.idv.cha102.g7.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tw.idv.cha102.g7.article.entity.Article;
import tw.idv.cha102.g7.article.service.ArticlePostingService;
@RestController
public class ArticlePostingController {
    @Autowired
    ArticlePostingService articlePostingService;
    // 新增文章
    // 可以新增，但若資料庫中有相同id的行程，資料會被覆蓋過去
    @PostMapping("/post")
    ResponseEntity<?> post(@RequestBody Article article) {
        try {
            articlePostingService.postArticle(article);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}
