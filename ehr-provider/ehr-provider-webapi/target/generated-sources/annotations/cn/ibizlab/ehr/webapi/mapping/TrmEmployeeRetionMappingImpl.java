package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmEmployeeRetion;
import cn.ibizlab.ehr.webapi.dto.TrmEmployeeRetionDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmEmployeeRetionMappingImpl implements TrmEmployeeRetionMapping {

    @Override
    public TrmEmployeeRetion toDomain(TrmEmployeeRetionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmEmployeeRetion trmEmployeeRetion = new TrmEmployeeRetion();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmEmployeeRetion.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmEmployeeRetion.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPxnr() != null ) {
            trmEmployeeRetion.setPxnr( dto.getPxnr() );
        }
        if ( dto.getTrmemployretionname() != null ) {
            trmEmployeeRetion.setTrmemployretionname( dto.getTrmemployretionname() );
        }
        if ( dto.getBmtj() != null ) {
            trmEmployeeRetion.setBmtj( dto.getBmtj() );
        }
        if ( dto.getBmjzrq() != null ) {
            trmEmployeeRetion.setBmjzrq( dto.getBmjzrq() );
        }
        if ( dto.getBmkssj() != null ) {
            trmEmployeeRetion.setBmkssj( dto.getBmkssj() );
        }
        if ( dto.getPxdd() != null ) {
            trmEmployeeRetion.setPxdd( dto.getPxdd() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmEmployeeRetion.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getTrmcouarrangeid() != null ) {
            trmEmployeeRetion.setTrmcouarrangeid( dto.getTrmcouarrangeid() );
        }
        if ( dto.getTrmtrainactapplyid() != null ) {
            trmEmployeeRetion.setTrmtrainactapplyid( dto.getTrmtrainactapplyid() );
        }
        if ( dto.getTrmtrainagencyid() != null ) {
            trmEmployeeRetion.setTrmtrainagencyid( dto.getTrmtrainagencyid() );
        }
        if ( dto.getCreatedate() != null ) {
            trmEmployeeRetion.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmEmployeeRetion.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getTrmemployretionid() != null ) {
            trmEmployeeRetion.setTrmemployretionid( dto.getTrmemployretionid() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmEmployeeRetion.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            trmEmployeeRetion.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            trmEmployeeRetion.setEnable( dto.getEnable() );
        }
        if ( dto.getSkksrq() != null ) {
            trmEmployeeRetion.setSkksrq( dto.getSkksrq() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmEmployeeRetion.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getPxhdbm() != null ) {
            trmEmployeeRetion.setPxhdbm( dto.getPxhdbm() );
        }
        if ( dto.getTrmcouarrangename() != null ) {
            trmEmployeeRetion.setTrmcouarrangename( dto.getTrmcouarrangename() );
        }
        if ( dto.getSkjssj() != null ) {
            trmEmployeeRetion.setSkjssj( dto.getSkjssj() );
        }
        if ( dto.getTrmtrainagencyname() != null ) {
            trmEmployeeRetion.setTrmtrainagencyname( dto.getTrmtrainagencyname() );
        }
        if ( dto.getTrmtrainactapplyname() != null ) {
            trmEmployeeRetion.setTrmtrainactapplyname( dto.getTrmtrainactapplyname() );
        }
        if ( dto.getKcxs() != null ) {
            trmEmployeeRetion.setKcxs( dto.getKcxs() );
        }

        return trmEmployeeRetion;
    }

    @Override
    public TrmEmployeeRetionDTO toDto(TrmEmployeeRetion entity) {
        if ( entity == null ) {
            return null;
        }

        TrmEmployeeRetionDTO trmEmployeeRetionDTO = new TrmEmployeeRetionDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmEmployeeRetionDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmEmployeeRetionDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPxnr() != null ) {
            trmEmployeeRetionDTO.setPxnr( entity.getPxnr() );
        }
        if ( entity.getTrmemployretionname() != null ) {
            trmEmployeeRetionDTO.setTrmemployretionname( entity.getTrmemployretionname() );
        }
        if ( entity.getBmtj() != null ) {
            trmEmployeeRetionDTO.setBmtj( entity.getBmtj() );
        }
        if ( entity.getBmjzrq() != null ) {
            trmEmployeeRetionDTO.setBmjzrq( entity.getBmjzrq() );
        }
        if ( entity.getBmkssj() != null ) {
            trmEmployeeRetionDTO.setBmkssj( entity.getBmkssj() );
        }
        if ( entity.getPxdd() != null ) {
            trmEmployeeRetionDTO.setPxdd( entity.getPxdd() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmEmployeeRetionDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getTrmcouarrangeid() != null ) {
            trmEmployeeRetionDTO.setTrmcouarrangeid( entity.getTrmcouarrangeid() );
        }
        if ( entity.getTrmtrainactapplyid() != null ) {
            trmEmployeeRetionDTO.setTrmtrainactapplyid( entity.getTrmtrainactapplyid() );
        }
        if ( entity.getTrmtrainagencyid() != null ) {
            trmEmployeeRetionDTO.setTrmtrainagencyid( entity.getTrmtrainagencyid() );
        }
        if ( entity.getCreatedate() != null ) {
            trmEmployeeRetionDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmEmployeeRetionDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getTrmemployretionid() != null ) {
            trmEmployeeRetionDTO.setTrmemployretionid( entity.getTrmemployretionid() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmEmployeeRetionDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            trmEmployeeRetionDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            trmEmployeeRetionDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getSkksrq() != null ) {
            trmEmployeeRetionDTO.setSkksrq( entity.getSkksrq() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmEmployeeRetionDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getPxhdbm() != null ) {
            trmEmployeeRetionDTO.setPxhdbm( entity.getPxhdbm() );
        }
        if ( entity.getTrmcouarrangename() != null ) {
            trmEmployeeRetionDTO.setTrmcouarrangename( entity.getTrmcouarrangename() );
        }
        if ( entity.getSkjssj() != null ) {
            trmEmployeeRetionDTO.setSkjssj( entity.getSkjssj() );
        }
        if ( entity.getTrmtrainagencyname() != null ) {
            trmEmployeeRetionDTO.setTrmtrainagencyname( entity.getTrmtrainagencyname() );
        }
        if ( entity.getTrmtrainactapplyname() != null ) {
            trmEmployeeRetionDTO.setTrmtrainactapplyname( entity.getTrmtrainactapplyname() );
        }
        if ( entity.getKcxs() != null ) {
            trmEmployeeRetionDTO.setKcxs( entity.getKcxs() );
        }

        return trmEmployeeRetionDTO;
    }

    @Override
    public List<TrmEmployeeRetion> toDomain(List<TrmEmployeeRetionDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmEmployeeRetion> list = new ArrayList<TrmEmployeeRetion>( dtoList.size() );
        for ( TrmEmployeeRetionDTO trmEmployeeRetionDTO : dtoList ) {
            list.add( toDomain( trmEmployeeRetionDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmEmployeeRetionDTO> toDto(List<TrmEmployeeRetion> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmEmployeeRetionDTO> list = new ArrayList<TrmEmployeeRetionDTO>( entityList.size() );
        for ( TrmEmployeeRetion trmEmployeeRetion : entityList ) {
            list.add( toDto( trmEmployeeRetion ) );
        }

        return list;
    }
}
