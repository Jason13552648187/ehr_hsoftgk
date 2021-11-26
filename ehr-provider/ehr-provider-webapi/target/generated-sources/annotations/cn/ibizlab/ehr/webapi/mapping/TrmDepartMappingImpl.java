package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmDepart;
import cn.ibizlab.ehr.webapi.dto.TrmDepartDTO;
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
    date = "2021-09-04T00:31:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmDepartMappingImpl implements TrmDepartMapping {

    @Override
    public TrmDepart toDomain(TrmDepartDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmDepart trmDepart = new TrmDepart();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmDepart.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmDepart.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getTrmdepartname() != null ) {
            trmDepart.setTrmdepartname( dto.getTrmdepartname() );
        }
        if ( dto.getNd() != null ) {
            trmDepart.setNd( dto.getNd() );
        }
        if ( dto.getLclx() != null ) {
            trmDepart.setLclx( dto.getLclx() );
        }
        if ( dto.getXqlylx() != null ) {
            trmDepart.setXqlylx( dto.getXqlylx() );
        }
        if ( dto.getXqdbm() != null ) {
            trmDepart.setXqdbm( dto.getXqdbm() );
        }
        if ( dto.getSpfs() != null ) {
            trmDepart.setSpfs( dto.getSpfs() );
        }
        if ( dto.getTzlx() != null ) {
            trmDepart.setTzlx( dto.getTzlx() );
        }
        if ( dto.getFj() != null ) {
            trmDepart.setFj( dto.getFj() );
        }
        if ( dto.getJd() != null ) {
            trmDepart.setJd( dto.getJd() );
        }
        if ( dto.getTdrq() != null ) {
            trmDepart.setTdrq( dto.getTdrq() );
        }
        if ( dto.getJzrq() != null ) {
            trmDepart.setJzrq( dto.getJzrq() );
        }
        if ( dto.getPimpersonid() != null ) {
            trmDepart.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            trmDepart.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmDepart.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getCreateman() != null ) {
            trmDepart.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            trmDepart.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmDepart.setEnable( dto.getEnable() );
        }
        if ( dto.getTrmdepartid() != null ) {
            trmDepart.setTrmdepartid( dto.getTrmdepartid() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmDepart.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmDepart.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            trmDepart.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getPimpersonname() != null ) {
            trmDepart.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getZzdzs() != null ) {
            trmDepart.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmDepart.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getShortname() != null ) {
            trmDepart.setShortname( dto.getShortname() );
        }

        return trmDepart;
    }

    @Override
    public TrmDepartDTO toDto(TrmDepart entity) {
        if ( entity == null ) {
            return null;
        }

        TrmDepartDTO trmDepartDTO = new TrmDepartDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmDepartDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmDepartDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getTrmdepartname() != null ) {
            trmDepartDTO.setTrmdepartname( entity.getTrmdepartname() );
        }
        if ( entity.getNd() != null ) {
            trmDepartDTO.setNd( entity.getNd() );
        }
        if ( entity.getLclx() != null ) {
            trmDepartDTO.setLclx( entity.getLclx() );
        }
        if ( entity.getXqlylx() != null ) {
            trmDepartDTO.setXqlylx( entity.getXqlylx() );
        }
        if ( entity.getXqdbm() != null ) {
            trmDepartDTO.setXqdbm( entity.getXqdbm() );
        }
        if ( entity.getSpfs() != null ) {
            trmDepartDTO.setSpfs( entity.getSpfs() );
        }
        if ( entity.getTzlx() != null ) {
            trmDepartDTO.setTzlx( entity.getTzlx() );
        }
        if ( entity.getFj() != null ) {
            trmDepartDTO.setFj( entity.getFj() );
        }
        if ( entity.getJd() != null ) {
            trmDepartDTO.setJd( entity.getJd() );
        }
        if ( entity.getTdrq() != null ) {
            trmDepartDTO.setTdrq( entity.getTdrq() );
        }
        if ( entity.getJzrq() != null ) {
            trmDepartDTO.setJzrq( entity.getJzrq() );
        }
        if ( entity.getPimpersonid() != null ) {
            trmDepartDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            trmDepartDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmDepartDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getCreateman() != null ) {
            trmDepartDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            trmDepartDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmDepartDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getTrmdepartid() != null ) {
            trmDepartDTO.setTrmdepartid( entity.getTrmdepartid() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmDepartDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmDepartDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            trmDepartDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getPimpersonname() != null ) {
            trmDepartDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getZzdzs() != null ) {
            trmDepartDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmDepartDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getShortname() != null ) {
            trmDepartDTO.setShortname( entity.getShortname() );
        }

        return trmDepartDTO;
    }

    @Override
    public List<TrmDepart> toDomain(List<TrmDepartDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmDepart> list = new ArrayList<TrmDepart>( dtoList.size() );
        for ( TrmDepartDTO trmDepartDTO : dtoList ) {
            list.add( toDomain( trmDepartDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmDepartDTO> toDto(List<TrmDepart> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmDepartDTO> list = new ArrayList<TrmDepartDTO>( entityList.size() );
        for ( TrmDepart trmDepart : entityList ) {
            list.add( toDto( trmDepart ) );
        }

        return list;
    }
}
