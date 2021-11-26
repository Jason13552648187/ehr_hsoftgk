package cn.ibizlab.ehr.core.pcm.service;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.math.BigInteger;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.alibaba.fastjson.JSONObject;
import org.springframework.cache.annotation.CacheEvict;

import cn.ibizlab.ehr.core.pcm.domain.PcmXygzzsq;
import cn.ibizlab.ehr.core.pcm.filter.PcmXygzzsqSearchContext;


import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 实体[PcmXygzzsq] 服务对象接口
 */
public interface IPcmXygzzsqService extends IService<PcmXygzzsq>{

    boolean create(PcmXygzzsq et) ;
    void createBatch(List<PcmXygzzsq> list) ;
    PcmXygzzsq get(String key) ;
    boolean save(PcmXygzzsq et) ;
    void saveBatch(List<PcmXygzzsq> list) ;
    boolean remove(String key) ;
    void removeBatch(Collection<String> idList) ;
    boolean checkKey(PcmXygzzsq et) ;
    PcmXygzzsq getDraft(PcmXygzzsq et) ;
    boolean update(PcmXygzzsq et) ;
    void updateBatch(List<PcmXygzzsq> list) ;
    Page<PcmXygzzsq> searchDefault(PcmXygzzsqSearchContext context) ;
    /**
     *自定义查询SQL
     * @param sql  select * from table where id =#{et.param}
     * @param param 参数列表  param.put("param","1");
     * @return select * from table where id = '1'
     */
    List<JSONObject> select(String sql, Map param);
    /**
     *自定义SQL
     * @param sql  update table  set name ='test' where id =#{et.param}
     * @param param 参数列表  param.put("param","1");
     * @return     update table  set name ='test' where id = '1'
     */
    boolean execute(String sql, Map param);

    List<PcmXygzzsq> getPcmxygzzsqByIds(List<String> ids) ;
    List<PcmXygzzsq> getPcmxygzzsqByEntities(List<PcmXygzzsq> entities) ;

}


