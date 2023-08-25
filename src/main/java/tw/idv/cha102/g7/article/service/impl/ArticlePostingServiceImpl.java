package tw.idv.cha102.g7.article.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tw.idv.cha102.g7.article.entity.Article;
import tw.idv.cha102.g7.article.repo.ArticlePostingPostingRepository;
import tw.idv.cha102.g7.article.service.ArticlePostingService;
@Component
public class ArticlePostingServiceImpl implements ArticlePostingService {
    @Autowired
    ArticlePostingPostingRepository articlePostingPostingRepository;
    @Override
    public void postArticle(Article article) {
        articlePostingPostingRepository.save(article);
    }
}