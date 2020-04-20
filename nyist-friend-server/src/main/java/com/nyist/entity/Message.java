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
@Table(name = "message")
@Accessors(chain = true)
public class Message {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  /**
   * 发消息用户id
   */
  private Long fId;

  /**
   * 收消息用户id
   */
  private Long tId;

  /**
   * 消息内容
   */
  private String content;

  /**
   * 消息类别 0 @ 1 评论 2 点赞
   */
  private String cate;

  /**
   * 所属文章id
   */
  private Long aId;

  /**
   * 父消息id
   */
  private Long mId;

  /**
   * 消息时间
   */
  private Date date;

  /**
   * 是否已读
   */
  private Boolean isRead;

  /**
   * 是否删除
   */
  private Boolean isDelete;

}
