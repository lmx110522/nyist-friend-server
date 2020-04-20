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
@Table(name = "comment")
@Accessors(chain = true)
public class Comment {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  /**
   * 评论内容
   */
  private String content;

  /**
   * 父评论id
   */
  private Long cId;

  /**
   * 帖子id
   */
  private Long aId;

  /**
   * 发帖用户
   */
  private Long uId;

  /**
   * 评论时间
   */
  private Date date;

  /**
   * 点赞数
   */
  private Integer likeCount;

  /**
   * 点赞人id
   */
  private String likeUids;

  /**
   * 是否删除
   */
  private Boolean is_delete;
}
