package com.nyist.service.impl;

import com.nyist.entity.Article;
import com.nyist.repository.ArticleRepository;
import com.nyist.service.ArticleService;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author:limaozhan
 * @Date:2020/4/20
 */
@Slf4j
@Service
public class ArticleServiceImpl implements ArticleService {

  @Resource
  private ArticleRepository articleRepository;


  @Override
  public void save(Article article) {
    articleRepository.save(article);
  }
}
