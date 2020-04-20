package com.nyist.controller;

import com.nyist.dto.ResultDto;
import com.nyist.entity.Article;
import com.nyist.service.ArticleService;
import com.nyist.util.ResponseUtil;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:limaozhan
 * @Date:2020/4/20
 */
@Slf4j
@RequestMapping("/article/")
public class ArticleController {

  @Resource
  public ArticleService articleService;

  @PostMapping("save")
  public ResultDto addArticle(@RequestBody Article article) {
    articleService.save(article);
    return ResponseUtil.makeSuccess("插入成功");
  }
}
