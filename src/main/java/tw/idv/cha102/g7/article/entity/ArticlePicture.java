package tw.idv.cha102.g7.article.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "article_picture")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticlePicture implements Serializable {
    private static final long serialVersionUID = 6618518644686967842L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "articlepic_id")
    private Integer articlePicId;
    @Column(name = "article_id")
    private Integer articleId;
    @Column(name = "article_pic")
    private byte[] articlePic;


}