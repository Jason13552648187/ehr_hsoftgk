package cn.ibizlab.ehr.core.pcm.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.math.BigInteger;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.ObjectUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.context.annotation.Lazy;
import cn.ibizlab.ehr.core.pcm.domain.PcmXygzzsq;
import cn.ibizlab.ehr.core.pcm.filter.PcmXygzzsqSearchContext;
import cn.ibizlab.ehr.core.pcm.service.IPcmXygzzsqService;

import cn.ibizlab.ehr.util.helper.CachedBeanCopier;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.ibizlab.ehr.core.pcm.mapper.PcmXygzzsqMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

/**
 * 实体[试用期员工转正申请] 服务对象接口实现
 */
@Slf4j
@Service("PcmXygzzsqServiceImpl")
public class PcmXygzzsqServiceImpl extends ServiceImpl<PcmXygzzsqMapper, PcmXygzzsq> implements IPcmXygzzsqService {

    @Autowired
    @Lazy
    private cn.ibizlab.ehr.core.pcm.service.IPcmXygzzjlmxService pcmxygzzjlmxService;
    @Autowired
    @Lazy
    private cn.ibizlab.ehr.core.pcm.service.IPcmXygzzsqmxService pcmxygzzsqmxService;

    private int batchSize = 500;

    @Override
    @Transactional
    public boolean create(PcmXygzzsq et) {
        if(!this.retBool(this.baseMapper.insert(et)))
            return false;
        CachedBeanCopier.copy(get(et.getPcmxygzzsqid()),et);
        return true;
    }

    @Override
    public void createBatch(List<PcmXygzzsq> list) {
        this.saveBatch(list,batchSize);
    }

    @Override
    @Transactional
    public PcmXygzzsq get(String key) {
        PcmXygzzsq et = getById(key);
        if(et==null){
            et=new PcmXygzzsq();
            et.setPcmxygzzsqid(key);
        }
        else{
        }
        return et;
    }

    @Override
    @Transactional
    public boolean save(PcmXygzzsq et) {
        if(!saveOrUpdate(et))
            return false;
        return true;
    }

    @Override
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public boolean saveOrUpdate(PcmXygzzsq et) {
        if (null == et) {
            return false;
        } else {
            return checkKey(et) ? this.update(et) : this.create(et);
        }
    }

    @Override
    public boolean saveBatch(Collection<PcmXygzzsq> list) {
        saveOrUpdateBatch(list,batchSize);
        return true;
    }

    @Override
    public void saveBatch(List<PcmXygzzsq> list) {
        saveOrUpdateBatch(list,batchSize);
    }

    @Override
    @Transactional
    public boolean remove(String key) {
        boolean result=removeById(key);
        return result ;
    }

    @Override
    public void removeBatch(Collection<String> idList) {
        removeByIds(idList);
    }

    @Override
    public boolean checkKey(PcmXygzzsq et) {
        return (!ObjectUtils.isEmpty(et.getPcmxygzzsqid()))&&(!Objects.isNull(this.getById(et.getPcmxygzzsqid())));
    }
    @Override
    public PcmXygzzsq getDraft(PcmXygzzsq et) {
        return et;
    }

    @Override
    @Transactional
    public boolean update(PcmXygzzsq et) {
        if(!update(et,(Wrapper) et.getUpdateWrapper(true).eq("pcmxygzzsqid",et.getPcmxygzzsqid())))
            return false;
        CachedBeanCopier.copy(get(et.getPcmxygzzsqid()),et);
        return true;
    }

    @Override
    public void updateBatch(List<PcmXygzzsq> list) {
        updateBatchById(list,batchSize);
    }



    /**
     * 查询集合 DEFAULT
     */
    @Override
    public Page<PcmXygzzsq> searchDefault(PcmXygzzsqSearchContext context) {
        com.baomidou.mybatisplus.extension.plugins.pagination.Page<PcmXygzzsq> pages=baseMapper.searchDefault(context.getPages(),context,context.getSelectCond());
        return new PageImpl<PcmXygzzsq>(pages.getRecords(), context.getPageable(), pages.getTotal());
    }







    @Override
    public List<JSONObject> select(String sql, Map param){
        return this.baseMapper.selectBySQL(sql,param);
    }

    @Override
    @Transactional
    public boolean execute(String sql , Map param){
        if (sql == null || sql.isEmpty()) {
            return false;
        }
        if (sql.toLowerCase().trim().startsWith("insert")) {
            return this.baseMapper.insertBySQL(sql,param);
        }
        if (sql.toLowerCase().trim().startsWith("update")) {
            return this.baseMapper.updateBySQL(sql,param);
        }
        if (sql.toLowerCase().trim().startsWith("delete")) {
            return this.baseMapper.deleteBySQL(sql,param);
        }
        log.warn("暂未支持的SQL语法");
        return true;
    }

    @Override
    public List<PcmXygzzsq> getPcmxygzzsqByIds(List<String> ids) {
         return this.listByIds(ids);
    }

    @Override
    public List<PcmXygzzsq> getPcmxygzzsqByEntities(List<PcmXygzzsq> entities) {
        List ids =new ArrayList();
        for(PcmXygzzsq entity : entities){
            Serializable id=entity.getPcmxygzzsqid();
            if(!ObjectUtils.isEmpty(id)){
                ids.add(id);
            }
        }
        if(ids.size()>0)
           return this.listByIds(ids);
        else
           return entities;
    }

}



