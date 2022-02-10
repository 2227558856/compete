package org.common.module.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGrade<M extends BaseGrade<M>> extends Model<M> implements IBean {

	/**
	 * 主键 主键唯一标识
	 */
	public void setId(java.math.BigInteger id) {
		set("id", id);
	}
	
	/**
	 * 主键 主键唯一标识
	 */
	public java.math.BigInteger getId() {
		return get("id");
	}
	
	/**
	 * 创建时间 创建时间
	 */
	public void setCreatedTime(java.util.Date createdTime) {
		set("created_time", createdTime);
	}
	
	/**
	 * 创建时间 创建时间
	 */
	public java.util.Date getCreatedTime() {
		return get("created_time");
	}
	
	/**
	 * 更新时间 更新时间
	 */
	public void setUpdatedTime(java.util.Date updatedTime) {
		set("updated_time", updatedTime);
	}
	
	/**
	 * 更新时间 更新时间
	 */
	public java.util.Date getUpdatedTime() {
		return get("updated_time");
	}
	
	/**
	 * 是否删除 0-未删除;1-已删除
	 */
	public void setIsDeleted(java.lang.Integer isDeleted) {
		set("is_deleted", isDeleted);
	}
	
	/**
	 * 是否删除 0-未删除;1-已删除
	 */
	public java.lang.Integer getIsDeleted() {
		return getInt("is_deleted");
	}
	
	/**
	 * 学号/工号/团队编号 user_no+team_no
	 */
	public void setNo(java.lang.String no) {
		set("no", no);
	}
	
	/**
	 * 学号/工号/团队编号 user_no+team_no
	 */
	public java.lang.String getNo() {
		return getStr("no");
	}
	
	/**
	 * 项目编号
	 */
	public void setGameNo(java.lang.String gameNo) {
		set("game_no", gameNo);
	}
	
	/**
	 * 项目编号
	 */
	public java.lang.String getGameNo() {
		return getStr("game_no");
	}
	
	/**
	 * 场次编号
	 */
	public void setTurnNo(java.lang.String turnNo) {
		set("turn_no", turnNo);
	}
	
	/**
	 * 场次编号
	 */
	public java.lang.String getTurnNo() {
		return getStr("turn_no");
	}
	
	/**
	 * 成绩 在成绩录入前为空,表示参赛信息;成绩录入后表示项目成绩
	 */
	public void setGrade(java.math.BigDecimal grade) {
		set("grade", grade);
	}
	
	/**
	 * 成绩 在成绩录入前为空,表示参赛信息;成绩录入后表示项目成绩
	 */
	public java.math.BigDecimal getGrade() {
		return get("grade");
	}
	
	/**
	 * 排名 同上
	 */
	public void setRanking(java.lang.Integer ranking) {
		set("ranking", ranking);
	}
	
	/**
	 * 排名 同上
	 */
	public java.lang.Integer getRanking() {
		return getInt("ranking");
	}
	
}