package com.nyist.entity;

import javax.persistence.*;
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
@Table(name = "user")
@Accessors(chain = true)
public class User {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  /**
   * 微信id
   */
  private Long openId;

  /**
   * 头像地址
   */
  private String headUrl;

  /**
   * 发帖id集合@分隔
   */
  private String postIds;

  /**
   * 浏览id集合@分隔
   */
  private String lookIds;

  /**
   * 关注集合@分隔
   */
  private String collectIds;

  /**
   * 粉丝集合@分隔
   */
  private String fansIds;

  /**
   * 黑名单集合@分隔
   */
  private String blackIds;

  /**
   * 个性签名
   */
  private String personDesc;

  /**
   * 微信号
   */
  private String wechatNumber;

  /**
   * 访问量
   */
  private Integer clickCounts;

  /**
   * 活跃度 （评论和发帖都加1）
   */
  private Integer writeCounts;
}
