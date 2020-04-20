package com.nyist.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author:limaozhan
 * @Date:2020/4/20
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "article")
@Accessors(chain = true)
public class Article {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  /**
   * 标题
   */
  private String title;

  /**
   * 简要描述
   */
  private String smallDesc;

  /**
   * 详细描述
   */
  private String content;

  /**
   * 点击量
   */
  private Integer clickCount;

  /**
   * 发布时间
   */
  private Date date;

  /**
   * 字数
   */
  private Long wordCount;

  /**
   * 喜欢数
   */
  private Integer likeCount;

  /**
   * 收藏数
   */
  private Integer collectCount;

  /**
   * 评论数目
   */
  private Integer commentCount;

  /**
   * 图片地址 @符合分隔
   */
  private String imgUrl;

  /**
   * 是否公开联系方式
   */
  private Boolean isOpenChat;

  /**
   * 是否私密模式
   */
  private Boolean isSerct;

  /**
   * 帖子类别
   */
  private Long cid;

  /**
   * 0 置顶 1精华 2 热门 3普通
   */
  private Integer level;

  /**
   * 是否删除
   */
  private Boolean isDelete;
}
