package com.nyist.entity;

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
@Table(name = "ad_img")
@Accessors(chain = true)
public class AdImg {


  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  /**
   * 类别图标地址
   */
  private String logoUrl;

  /**
   * 指向链接地址
   */
  private String linkUrl;

  /**
   * 图片背景色 16进制
   */
  private String bgColor;

  /**
   * 是否可用
   */
  private Boolean isAble;
}
