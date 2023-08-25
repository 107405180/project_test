package tw.idv.cha102.g7.article.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tw.idv.cha102.g7.article.entity.Article;

@Repository
public interface ArticlePostingPostingRepository extends JpaRepository <Article,Integer>{

}