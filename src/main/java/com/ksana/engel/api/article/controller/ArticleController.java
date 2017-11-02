package com.ksana.engel.api.article.controller;


import com.ksana.engel.api.article.model.ArticleInfo;
import com.ksana.engel.api.article.model.ArticleInfoResponse;
import com.ksana.engel.api.article.repo.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Transactional
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ArticleController {

    @Autowired
    private ArticleRepo articleRepo;

    @GetMapping()
    public String index(){

        return "index";
    }

    @GetMapping(value = "/articles")
    public ArticleInfoResponse getArticlesByPage(Pageable pageable){
        ArticleInfoResponse resp=new ArticleInfoResponse();
        ArticleInfo qry=new ArticleInfo();
        Page<ArticleInfo> pg=articleRepo.findAll(Example.of(qry),pageable);
        resp.setPageStats(pg, true);
        resp.setItems(pg.getContent());
        return resp;
    }

   /* @RequestMapping(value = "/index")
    public ModelAndView login(HttpSession session){
        ModelAndView mav=new ModelAndView();

        mav.setViewName("index.html");

        return mav;
    }*/
}
