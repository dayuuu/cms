package cn.daryu.cms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CMS全局配置变量表
 * 
 * @author Day
 *
 */
@Entity
@Table(name = "cms_options")
public class Options {
	
	private Long id;
	private Long blogId;
	private String optionName;
	private String optionValue;
	private String autoload;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "option_id") 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "blog_id") 
	public Long getBlogId() {
		return blogId;
	}
	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}
	
	@Column(name = "option_name") 
	public String getOptionName() {
		return optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
	
	@Column(name = "option_value") 
	public String getOptionValue() {
		return optionValue;
	}
	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}
	
	@Column(name = "autoload") 
	public String getAutoload() {
		return autoload;
	}
	public void setAutoload(String autoload) {
		this.autoload = autoload;
	}
}
