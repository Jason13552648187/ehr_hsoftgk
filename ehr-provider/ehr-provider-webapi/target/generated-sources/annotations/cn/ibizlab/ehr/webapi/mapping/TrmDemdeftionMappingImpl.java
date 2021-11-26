package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmDemdeftion;
import cn.ibizlab.ehr.webapi.dto.TrmDemdeftionDTO;
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
    date = "2021-09-04T00:31:46+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmDemdeftionMappingImpl implements TrmDemdeftionMapping {

    @Override
    public TrmDemdeftion toDomain(TrmDemdeftionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmDemdeftion trmDemdeftion = new TrmDemdeftion();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmDemdeftion.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmDemdeftion.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDcbjb() != null ) {
            trmDemdeftion.setDcbjb( dto.getDcbjb() );
        }
        if ( dto.getPxbmc() != null ) {
            trmDemdeftion.setPxbmc( dto.getPxbmc() );
        }
        if ( dto.getSffb() != null ) {
            trmDemdeftion.setSffb( dto.getSffb() );
        }
        if ( dto.getBmjzsj() != null ) {
            trmDemdeftion.setBmjzsj( dto.getBmjzsj() );
        }
        if ( dto.getDcscjd() != null ) {
            trmDemdeftion.setDcscjd( dto.getDcscjd() );
        }
        if ( dto.getPxjssj() != null ) {
            trmDemdeftion.setPxjssj( dto.getPxjssj() );
        }
        if ( dto.getPxdd() != null ) {
            trmDemdeftion.setPxdd( dto.getPxdd() );
        }
        if ( dto.getNd() != null ) {
            trmDemdeftion.setNd( dto.getNd() );
        }
        if ( dto.getDcdxlx() != null ) {
            trmDemdeftion.setDcdxlx( dto.getDcdxlx() );
        }
        if ( dto.getXh() != null ) {
            trmDemdeftion.setXh( dto.getXh() );
        }
        if ( dto.getPxrs() != null ) {
            trmDemdeftion.setPxrs( dto.getPxrs() );
        }
        if ( dto.getPxzynr() != null ) {
            trmDemdeftion.setPxzynr( dto.getPxzynr() );
        }
        if ( dto.getDcyglb() != null ) {
            trmDemdeftion.setDcyglb( dto.getDcyglb() );
        }
        if ( dto.getDcblx() != null ) {
            trmDemdeftion.setDcblx( dto.getDcblx() );
        }
        if ( dto.getPxkssj() != null ) {
            trmDemdeftion.setPxkssj( dto.getPxkssj() );
        }
        if ( dto.getXqfl() != null ) {
            trmDemdeftion.setXqfl( dto.getXqfl() );
        }
        if ( dto.getZdsj() != null ) {
            trmDemdeftion.setZdsj( dto.getZdsj() );
        }
        if ( dto.getTrmdemdeftionname() != null ) {
            trmDemdeftion.setTrmdemdeftionname( dto.getTrmdemdeftionname() );
        }
        if ( dto.getPxdx() != null ) {
            trmDemdeftion.setPxdx( dto.getPxdx() );
        }
        if ( dto.getBz() != null ) {
            trmDemdeftion.setBz( dto.getBz() );
        }
        if ( dto.getDcjzrq() != null ) {
            trmDemdeftion.setDcjzrq( dto.getDcjzrq() );
        }
        if ( dto.getDcscnd() != null ) {
            trmDemdeftion.setDcscnd( dto.getDcscnd() );
        }
        if ( dto.getPxmk() != null ) {
            trmDemdeftion.setPxmk( dto.getPxmk() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmDemdeftion.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getTrmtrainfillinid() != null ) {
            trmDemdeftion.setTrmtrainfillinid( dto.getTrmtrainfillinid() );
        }
        if ( dto.getTrmtraincourseid() != null ) {
            trmDemdeftion.setTrmtraincourseid( dto.getTrmtraincourseid() );
        }
        if ( dto.getTrmdepartid() != null ) {
            trmDemdeftion.setTrmdepartid( dto.getTrmdepartid() );
        }
        if ( dto.getPimpersonid() != null ) {
            trmDemdeftion.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreateman() != null ) {
            trmDemdeftion.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            trmDemdeftion.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            trmDemdeftion.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmDemdeftion.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmDemdeftion.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getTrmdemdeftionid() != null ) {
            trmDemdeftion.setTrmdemdeftionid( dto.getTrmdemdeftionid() );
        }
        if ( dto.getTrmtraincoursename() != null ) {
            trmDemdeftion.setTrmtraincoursename( dto.getTrmtraincoursename() );
        }
        if ( dto.getTrmtrainfillinname() != null ) {
            trmDemdeftion.setTrmtrainfillinname( dto.getTrmtrainfillinname() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmDemdeftion.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getTrmdepartname() != null ) {
            trmDemdeftion.setTrmdepartname( dto.getTrmdepartname() );
        }
        if ( dto.getPimpersonname() != null ) {
            trmDemdeftion.setPimpersonname( dto.getPimpersonname() );
        }

        return trmDemdeftion;
    }

    @Override
    public TrmDemdeftionDTO toDto(TrmDemdeftion entity) {
        if ( entity == null ) {
            return null;
        }

        TrmDemdeftionDTO trmDemdeftionDTO = new TrmDemdeftionDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmDemdeftionDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmDemdeftionDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDcbjb() != null ) {
            trmDemdeftionDTO.setDcbjb( entity.getDcbjb() );
        }
        if ( entity.getPxbmc() != null ) {
            trmDemdeftionDTO.setPxbmc( entity.getPxbmc() );
        }
        if ( entity.getSffb() != null ) {
            trmDemdeftionDTO.setSffb( entity.getSffb() );
        }
        if ( entity.getBmjzsj() != null ) {
            trmDemdeftionDTO.setBmjzsj( entity.getBmjzsj() );
        }
        if ( entity.getDcscjd() != null ) {
            trmDemdeftionDTO.setDcscjd( entity.getDcscjd() );
        }
        if ( entity.getPxjssj() != null ) {
            trmDemdeftionDTO.setPxjssj( entity.getPxjssj() );
        }
        if ( entity.getPxdd() != null ) {
            trmDemdeftionDTO.setPxdd( entity.getPxdd() );
        }
        if ( entity.getNd() != null ) {
            trmDemdeftionDTO.setNd( entity.getNd() );
        }
        if ( entity.getDcdxlx() != null ) {
            trmDemdeftionDTO.setDcdxlx( entity.getDcdxlx() );
        }
        if ( entity.getXh() != null ) {
            trmDemdeftionDTO.setXh( entity.getXh() );
        }
        if ( entity.getPxrs() != null ) {
            trmDemdeftionDTO.setPxrs( entity.getPxrs() );
        }
        if ( entity.getPxzynr() != null ) {
            trmDemdeftionDTO.setPxzynr( entity.getPxzynr() );
        }
        if ( entity.getDcyglb() != null ) {
            trmDemdeftionDTO.setDcyglb( entity.getDcyglb() );
        }
        if ( entity.getDcblx() != null ) {
            trmDemdeftionDTO.setDcblx( entity.getDcblx() );
        }
        if ( entity.getPxkssj() != null ) {
            trmDemdeftionDTO.setPxkssj( entity.getPxkssj() );
        }
        if ( entity.getXqfl() != null ) {
            trmDemdeftionDTO.setXqfl( entity.getXqfl() );
        }
        if ( entity.getZdsj() != null ) {
            trmDemdeftionDTO.setZdsj( entity.getZdsj() );
        }
        if ( entity.getTrmdemdeftionname() != null ) {
            trmDemdeftionDTO.setTrmdemdeftionname( entity.getTrmdemdeftionname() );
        }
        if ( entity.getPxdx() != null ) {
            trmDemdeftionDTO.setPxdx( entity.getPxdx() );
        }
        if ( entity.getBz() != null ) {
            trmDemdeftionDTO.setBz( entity.getBz() );
        }
        if ( entity.getDcjzrq() != null ) {
            trmDemdeftionDTO.setDcjzrq( entity.getDcjzrq() );
        }
        if ( entity.getDcscnd() != null ) {
            trmDemdeftionDTO.setDcscnd( entity.getDcscnd() );
        }
        if ( entity.getPxmk() != null ) {
            trmDemdeftionDTO.setPxmk( entity.getPxmk() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmDemdeftionDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getTrmtrainfillinid() != null ) {
            trmDemdeftionDTO.setTrmtrainfillinid( entity.getTrmtrainfillinid() );
        }
        if ( entity.getTrmtraincourseid() != null ) {
            trmDemdeftionDTO.setTrmtraincourseid( entity.getTrmtraincourseid() );
        }
        if ( entity.getTrmdepartid() != null ) {
            trmDemdeftionDTO.setTrmdepartid( entity.getTrmdepartid() );
        }
        if ( entity.getPimpersonid() != null ) {
            trmDemdeftionDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreateman() != null ) {
            trmDemdeftionDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            trmDemdeftionDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            trmDemdeftionDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmDemdeftionDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmDemdeftionDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getTrmdemdeftionid() != null ) {
            trmDemdeftionDTO.setTrmdemdeftionid( entity.getTrmdemdeftionid() );
        }
        if ( entity.getTrmtraincoursename() != null ) {
            trmDemdeftionDTO.setTrmtraincoursename( entity.getTrmtraincoursename() );
        }
        if ( entity.getTrmtrainfillinname() != null ) {
            trmDemdeftionDTO.setTrmtrainfillinname( entity.getTrmtrainfillinname() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmDemdeftionDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getTrmdepartname() != null ) {
            trmDemdeftionDTO.setTrmdepartname( entity.getTrmdepartname() );
        }
        if ( entity.getPimpersonname() != null ) {
            trmDemdeftionDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return trmDemdeftionDTO;
    }

    @Override
    public List<TrmDemdeftion> toDomain(List<TrmDemdeftionDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmDemdeftion> list = new ArrayList<TrmDemdeftion>( dtoList.size() );
        for ( TrmDemdeftionDTO trmDemdeftionDTO : dtoList ) {
            list.add( toDomain( trmDemdeftionDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmDemdeftionDTO> toDto(List<TrmDemdeftion> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmDemdeftionDTO> list = new ArrayList<TrmDemdeftionDTO>( entityList.size() );
        for ( TrmDemdeftion trmDemdeftion : entityList ) {
            list.add( toDto( trmDemdeftion ) );
        }

        return list;
    }
}
