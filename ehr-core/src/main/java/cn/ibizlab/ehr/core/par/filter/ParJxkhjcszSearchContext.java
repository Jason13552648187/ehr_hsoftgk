package cn.ibizlab.ehr.core.par.filter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.alibaba.fastjson.annotation.JSONField;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;


import cn.ibizlab.ehr.util.filter.QueryWrapperContext;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import cn.ibizlab.ehr.core.par.domain.ParJxkhjcsz;
/**
 * 关系型数据实体[ParJxkhjcsz] 查询条件对象
 */
@Slf4j
@Data
public class ParJxkhjcszSearchContext extends QueryWrapperContext<ParJxkhjcsz> {

	private String n_khlx_eq;//[考核对象]
	public void setN_khlx_eq(String n_khlx_eq) {
        this.n_khlx_eq = n_khlx_eq;
        if(!ObjectUtils.isEmpty(this.n_khlx_eq)){
            this.getSearchCond().eq("khlx", n_khlx_eq);
        }
    }
	private String n_parjxkhjcszname_like;//[考核方案]
	public void setN_parjxkhjcszname_like(String n_parjxkhjcszname_like) {
        this.n_parjxkhjcszname_like = n_parjxkhjcszname_like;
        if(!ObjectUtils.isEmpty(this.n_parjxkhjcszname_like)){
            this.getSearchCond().like("parjxkhjcszname", n_parjxkhjcszname_like);
        }
    }
	private String n_khnd_eq;//[考核年度]
	public void setN_khnd_eq(String n_khnd_eq) {
        this.n_khnd_eq = n_khnd_eq;
        if(!ObjectUtils.isEmpty(this.n_khnd_eq)){
            this.getSearchCond().eq("khnd", n_khnd_eq);
        }
    }
	private String n_ormorgname_eq;//[组织]
	public void setN_ormorgname_eq(String n_ormorgname_eq) {
        this.n_ormorgname_eq = n_ormorgname_eq;
        if(!ObjectUtils.isEmpty(this.n_ormorgname_eq)){
            this.getSearchCond().eq("ormorgname", n_ormorgname_eq);
        }
    }
	private String n_ormorgname_like;//[组织]
	public void setN_ormorgname_like(String n_ormorgname_like) {
        this.n_ormorgname_like = n_ormorgname_like;
        if(!ObjectUtils.isEmpty(this.n_ormorgname_like)){
            this.getSearchCond().like("ormorgname", n_ormorgname_like);
        }
    }
	private String n_ormorgid_eq;//[组织ID]
	public void setN_ormorgid_eq(String n_ormorgid_eq) {
        this.n_ormorgid_eq = n_ormorgid_eq;
        if(!ObjectUtils.isEmpty(this.n_ormorgid_eq)){
            this.getSearchCond().eq("ormorgid", n_ormorgid_eq);
        }
    }

    /**
	 * 启用快速搜索
	 */
	public void setQuery(String query)
	{
		 this.query=query;
		 if(!StringUtils.isEmpty(query)){
            this.getSearchCond().and( wrapper ->
                     wrapper.like("parjxkhjcszname", query)   
            );
		 }
	}
}




