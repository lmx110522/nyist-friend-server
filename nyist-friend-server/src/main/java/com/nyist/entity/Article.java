package com.nyist.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @Author:limaozhan
 * @Date:2020/4/20
 */
@Data
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "article")
@Accessors(chain = true)
public class Article {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  /**
   * 标题
   */
  @NotNull(message = "帖子标题不能为空")
  private String title;

  /**
   * 简要描述
   */
  @NotNull(message = "简要描述不能为空")
  private String smallDesc;

  /**
   * 详细描述
   */
  @NotNull(message = "帖子详细描述不能为空")
  private String content;

  /**
   * 点击量
   */
  private Integer clickCount;

  /**
   * 发布时间
   */
  @CreatedDate
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
  @NotNull(message = "帖子类别不能为空")
  private Long cid;

  /**
   * 1 置顶 2精华 3 热门 0普通
   */
  private Integer level;

  /**
   * 是否删除
   */
  private Boolean isDelete;
}
