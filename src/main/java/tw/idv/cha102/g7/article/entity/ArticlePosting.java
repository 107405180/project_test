package tw.idv.cha102.g7.article.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="article")
public class ArticlePosting {
    @Id
    @Column(name="article_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer articleId;

//    @Column(name="mem_id")
//    private Integer memId;

    @Column(name="ac_type_id")
    private Integer acTypeId;

    @Column(name="article_title")
    private String articleTitle;

    @Column(name="article_con")
    private String articleContent;



}
