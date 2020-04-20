package com.nyist.repository;

import com.nyist.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author:limaozhan
 * @Date:2020/4/20
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
