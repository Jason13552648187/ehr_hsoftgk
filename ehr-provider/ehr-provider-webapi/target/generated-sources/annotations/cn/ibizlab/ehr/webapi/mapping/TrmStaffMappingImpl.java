package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmStaff;
import cn.ibizlab.ehr.webapi.dto.TrmStaffDTO;
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
public class TrmStaffMappingImpl implements TrmStaffMapping {

    @Override
    public TrmStaff toDomain(TrmStaffDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmStaff trmStaff = new TrmStaff();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmStaff.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmStaff.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getTrmstaffname() != null ) {
            trmStaff.setTrmstaffname( dto.getTrmstaffname() );
        }
        if ( dto.getXqlylx() != null ) {
            trmStaff.setXqlylx( dto.getXqlylx() );
        }
        if ( dto.getSpfs() != null ) {
            trmStaff.setSpfs( dto.getSpfs() );
        }
        if ( dto.getTdrq() != null ) {
            trmStaff.setTdrq( dto.getTdrq() );
        }
        if ( dto.getLclx() != null ) {
            trmStaff.setLclx( dto.getLclx() );
        }
        if ( dto.getXqdbma() != null ) {
            trmStaff.setXqdbma( dto.getXqdbma() );
        }
        if ( dto.getZw() != null ) {
            trmStaff.setZw( dto.getZw() );
        }
        if ( dto.getGzzz() != null ) {
            trmStaff.setGzzz( dto.getGzzz() );
        }
        if ( dto.getGw() != null ) {
            trmStaff.setGw( dto.getGw() );
        }
        if ( dto.getXl() != null ) {
            trmStaff.setXl( dto.getXl() );
        }
        if ( dto.getPimpersonid() != null ) {
            trmStaff.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmStaff.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimpersonid2() != null ) {
            trmStaff.setPimpersonid2( dto.getPimpersonid2() );
        }
        if ( dto.getCreatedate() != null ) {
            trmStaff.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmStaff.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmStaff.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmStaff.setEnable( dto.getEnable() );
        }
        if ( dto.getTrmstaffid() != null ) {
            trmStaff.setTrmstaffid( dto.getTrmstaffid() );
        }
        if ( dto.getCreateman() != null ) {
            trmStaff.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPimpersonname2() != null ) {
            trmStaff.setPimpersonname2( dto.getPimpersonname2() );
        }
        if ( dto.getPimpersonname() != null ) {
            trmStaff.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmStaff.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getBm() != null ) {
            trmStaff.setBm( dto.getBm() );
        }
        if ( dto.getZz() != null ) {
            trmStaff.setZz( dto.getZz() );
        }

        return trmStaff;
    }

    @Override
    public TrmStaffDTO toDto(TrmStaff entity) {
        if ( entity == null ) {
            return null;
        }

        TrmStaffDTO trmStaffDTO = new TrmStaffDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmStaffDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmStaffDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getTrmstaffname() != null ) {
            trmStaffDTO.setTrmstaffname( entity.getTrmstaffname() );
        }
        if ( entity.getXqlylx() != null ) {
            trmStaffDTO.setXqlylx( entity.getXqlylx() );
        }
        if ( entity.getSpfs() != null ) {
            trmStaffDTO.setSpfs( entity.getSpfs() );
        }
        if ( entity.getTdrq() != null ) {
            trmStaffDTO.setTdrq( entity.getTdrq() );
        }
        if ( entity.getLclx() != null ) {
            trmStaffDTO.setLclx( entity.getLclx() );
        }
        if ( entity.getXqdbma() != null ) {
            trmStaffDTO.setXqdbma( entity.getXqdbma() );
        }
        if ( entity.getZw() != null ) {
            trmStaffDTO.setZw( entity.getZw() );
        }
        if ( entity.getGzzz() != null ) {
            trmStaffDTO.setGzzz( entity.getGzzz() );
        }
        if ( entity.getGw() != null ) {
            trmStaffDTO.setGw( entity.getGw() );
        }
        if ( entity.getXl() != null ) {
            trmStaffDTO.setXl( entity.getXl() );
        }
        if ( entity.getPimpersonid() != null ) {
            trmStaffDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmStaffDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimpersonid2() != null ) {
            trmStaffDTO.setPimpersonid2( entity.getPimpersonid2() );
        }
        if ( entity.getCreatedate() != null ) {
            trmStaffDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmStaffDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmStaffDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmStaffDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getTrmstaffid() != null ) {
            trmStaffDTO.setTrmstaffid( entity.getTrmstaffid() );
        }
        if ( entity.getCreateman() != null ) {
            trmStaffDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPimpersonname2() != null ) {
            trmStaffDTO.setPimpersonname2( entity.getPimpersonname2() );
        }
        if ( entity.getPimpersonname() != null ) {
            trmStaffDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmStaffDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getBm() != null ) {
            trmStaffDTO.setBm( entity.getBm() );
        }
        if ( entity.getZz() != null ) {
            trmStaffDTO.setZz( entity.getZz() );
        }

        return trmStaffDTO;
    }

    @Override
    public List<TrmStaff> toDomain(List<TrmStaffDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmStaff> list = new ArrayList<TrmStaff>( dtoList.size() );
        for ( TrmStaffDTO trmStaffDTO : dtoList ) {
            list.add( toDomain( trmStaffDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmStaffDTO> toDto(List<TrmStaff> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmStaffDTO> list = new ArrayList<TrmStaffDTO>( entityList.size() );
        for ( TrmStaff trmStaff : entityList ) {
            list.add( toDto( trmStaff ) );
        }

        return list;
    }
}
