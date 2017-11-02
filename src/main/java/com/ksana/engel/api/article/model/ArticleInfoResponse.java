package com.ksana.engel.api.article.model;

import com.ksana.engel.common.model.response.PageResponse;
import lombok.Data;

import java.util.List;

@Data
public class ArticleInfoResponse extends PageResponse{
    private List<ArticleInfo> items;
}
