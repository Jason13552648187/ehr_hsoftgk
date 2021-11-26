package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainOutApply;
import cn.ibizlab.ehr.webapi.dto.TrmTrainOutApplyDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainOutApplyMappingImpl implements TrmTrainOutApplyMapping {

    @Override
    public TrmTrainOutApply toDomain(TrmTrainOutApplyDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainOutApply trmTrainOutApply = new TrmTrainOutApply();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainOutApply.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainOutApply.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getWbpxjg() != null ) {
            trmTrainOutApply.setWbpxjg( dto.getWbpxjg() );
        }
        if ( dto.getDjbh() != null ) {
            trmTrainOutApply.setDjbh( dto.getDjbh() );
        }
        if ( dto.getSqrq() != null ) {
            trmTrainOutApply.setSqrq( dto.getSqrq() );
        }
        if ( dto.getPxfs() != null ) {
            trmTrainOutApply.setPxfs( dto.getPxfs() );
        }
        if ( dto.getPxlb() != null ) {
            trmTrainOutApply.setPxlb( dto.getPxlb() );
        }
        if ( dto.getPxnr() != null ) {
            trmTrainOutApply.setPxnr( dto.getPxnr() );
        }
        if ( dto.getYwlx() != null ) {
            trmTrainOutApply.setYwlx( dto.getYwlx() );
        }
        if ( dto.getPxjsrq() != null ) {
            trmTrainOutApply.setPxjsrq( dto.getPxjsrq() );
        }
        if ( dto.getPxmb() != null ) {
            trmTrainOutApply.setPxmb( dto.getPxmb() );
        }
        if ( dto.getPxksrq() != null ) {
            trmTrainOutApply.setPxksrq( dto.getPxksrq() );
        }
        if ( dto.getPxdd() != null ) {
            trmTrainOutApply.setPxdd( dto.getPxdd() );
        }
        if ( dto.getTrmtrainoutapplyname() != null ) {
            trmTrainOutApply.setTrmtrainoutapplyname( dto.getTrmtrainoutapplyname() );
        }
        if ( dto.getPimpersonid() != null ) {
            trmTrainOutApply.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainOutApply.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainOutApply.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainOutApply.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainOutApply.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainOutApply.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getTrmtrainoutapplyid() != null ) {
            trmTrainOutApply.setTrmtrainoutapplyid( dto.getTrmtrainoutapplyid() );
        }
        if ( dto.getPimpersonname() != null ) {
            trmTrainOutApply.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getBm() != null ) {
            trmTrainOutApply.setBm( dto.getBm() );
        }
        if ( dto.getZz() != null ) {
            trmTrainOutApply.setZz( dto.getZz() );
        }

        return trmTrainOutApply;
    }

    @Override
    public TrmTrainOutApplyDTO toDto(TrmTrainOutApply entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainOutApplyDTO trmTrainOutApplyDTO = new TrmTrainOutApplyDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainOutApplyDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainOutApplyDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getWbpxjg() != null ) {
            trmTrainOutApplyDTO.setWbpxjg( entity.getWbpxjg() );
        }
        if ( entity.getDjbh() != null ) {
            trmTrainOutApplyDTO.setDjbh( entity.getDjbh() );
        }
        if ( entity.getSqrq() != null ) {
            trmTrainOutApplyDTO.setSqrq( entity.getSqrq() );
        }
        if ( entity.getPxfs() != null ) {
            trmTrainOutApplyDTO.setPxfs( entity.getPxfs() );
        }
        if ( entity.getPxlb() != null ) {
            trmTrainOutApplyDTO.setPxlb( entity.getPxlb() );
        }
        if ( entity.getPxnr() != null ) {
            trmTrainOutApplyDTO.setPxnr( entity.getPxnr() );
        }
        if ( entity.getYwlx() != null ) {
            trmTrainOutApplyDTO.setYwlx( entity.getYwlx() );
        }
        if ( entity.getPxjsrq() != null ) {
            trmTrainOutApplyDTO.setPxjsrq( entity.getPxjsrq() );
        }
        if ( entity.getPxmb() != null ) {
            trmTrainOutApplyDTO.setPxmb( entity.getPxmb() );
        }
        if ( entity.getPxksrq() != null ) {
            trmTrainOutApplyDTO.setPxksrq( entity.getPxksrq() );
        }
        if ( entity.getPxdd() != null ) {
            trmTrainOutApplyDTO.setPxdd( entity.getPxdd() );
        }
        if ( entity.getTrmtrainoutapplyname() != null ) {
            trmTrainOutApplyDTO.setTrmtrainoutapplyname( entity.getTrmtrainoutapplyname() );
        }
        if ( entity.getPimpersonid() != null ) {
            trmTrainOutApplyDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainOutApplyDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainOutApplyDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainOutApplyDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainOutApplyDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainOutApplyDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getTrmtrainoutapplyid() != null ) {
            trmTrainOutApplyDTO.setTrmtrainoutapplyid( entity.getTrmtrainoutapplyid() );
        }
        if ( entity.getPimpersonname() != null ) {
            trmTrainOutApplyDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getBm() != null ) {
            trmTrainOutApplyDTO.setBm( entity.getBm() );
        }
        if ( entity.getZz() != null ) {
            trmTrainOutApplyDTO.setZz( entity.getZz() );
        }

        return trmTrainOutApplyDTO;
    }

    @Override
    public List<TrmTrainOutApply> toDomain(List<TrmTrainOutApplyDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainOutApply> list = new ArrayList<TrmTrainOutApply>( dtoList.size() );
        for ( TrmTrainOutApplyDTO trmTrainOutApplyDTO : dtoList ) {
            list.add( toDomain( trmTrainOutApplyDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainOutApplyDTO> toDto(List<TrmTrainOutApply> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainOutApplyDTO> list = new ArrayList<TrmTrainOutApplyDTO>( entityList.size() );
        for ( TrmTrainOutApply trmTrainOutApply : entityList ) {
            list.add( toDto( trmTrainOutApply ) );
        }

        return list;
    }
}
