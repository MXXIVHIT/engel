package com.ksana.engel.api.article.model;

import lombok.Data;

import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "b3_solo_article")
public class ArticleInfo {
    private Integer oId;
    private String articleTitle;
    private String articleTags;
    private String articleAuthorEmail;
    private Integer articleViewCount;
    private String articleContent;
    private Date articleCreateDate;
    private Date articleUpdateDate;

    public ArticleInfo(){}
}
