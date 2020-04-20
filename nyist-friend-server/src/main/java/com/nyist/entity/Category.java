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
@Table(name = "category")
@Accessors(chain = true)
public class Category {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;

  /**
   * 类别图标地址
   */
  private String logoUrl;

  /**
   * 类别名称
   */
  private String title;

  /**
   * 是否可用
   */
  private Boolean isAble;
}
