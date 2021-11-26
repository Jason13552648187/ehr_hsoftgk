package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmDuty;
import cn.ibizlab.ehr.webapi.dto.OrmDutyDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmDutyMappingImpl implements OrmDutyMapping {

    @Override
    public OrmDuty toDomain(OrmDutyDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmDuty ormDuty = new OrmDuty();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormDuty.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormDuty.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getFglx() != null ) {
            ormDuty.setFglx( dto.getFglx() );
        }
        if ( dto.getXh() != null ) {
            ormDuty.setXh( dto.getXh() );
        }
        if ( dto.getZwjb() != null ) {
            ormDuty.setZwjb( dto.getZwjb() );
        }
        if ( dto.getDyzj() != null ) {
            ormDuty.setDyzj( dto.getDyzj() );
        }
        if ( dto.getNx() != null ) {
            ormDuty.setNx( dto.getNx() );
        }
        if ( dto.getZwlb() != null ) {
            ormDuty.setZwlb( dto.getZwlb() );
        }
        if ( dto.getBxjlnx() != null ) {
            ormDuty.setBxjlnx( dto.getBxjlnx() );
        }
        if ( dto.getOrmdutyname() != null ) {
            ormDuty.setOrmdutyname( dto.getOrmdutyname() );
        }
        if ( dto.getOrmdutyid() != null ) {
            ormDuty.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getUpdateman() != null ) {
            ormDuty.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormDuty.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            ormDuty.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            ormDuty.setCreatedate( dto.getCreatedate() );
        }

        return ormDuty;
    }

    @Override
    public OrmDutyDTO toDto(OrmDuty entity) {
        if ( entity == null ) {
            return null;
        }

        OrmDutyDTO ormDutyDTO = new OrmDutyDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormDutyDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormDutyDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getFglx() != null ) {
            ormDutyDTO.setFglx( entity.getFglx() );
        }
        if ( entity.getXh() != null ) {
            ormDutyDTO.setXh( entity.getXh() );
        }
        if ( entity.getZwjb() != null ) {
            ormDutyDTO.setZwjb( entity.getZwjb() );
        }
        if ( entity.getDyzj() != null ) {
            ormDutyDTO.setDyzj( entity.getDyzj() );
        }
        if ( entity.getNx() != null ) {
            ormDutyDTO.setNx( entity.getNx() );
        }
        if ( entity.getZwlb() != null ) {
            ormDutyDTO.setZwlb( entity.getZwlb() );
        }
        if ( entity.getBxjlnx() != null ) {
            ormDutyDTO.setBxjlnx( entity.getBxjlnx() );
        }
        if ( entity.getOrmdutyname() != null ) {
            ormDutyDTO.setOrmdutyname( entity.getOrmdutyname() );
        }
        if ( entity.getOrmdutyid() != null ) {
            ormDutyDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getUpdateman() != null ) {
            ormDutyDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormDutyDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            ormDutyDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            ormDutyDTO.setCreatedate( entity.getCreatedate() );
        }

        return ormDutyDTO;
    }

    @Override
    public List<OrmDuty> toDomain(List<OrmDutyDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmDuty> list = new ArrayList<OrmDuty>( dtoList.size() );
        for ( OrmDutyDTO ormDutyDTO : dtoList ) {
            list.add( toDomain( ormDutyDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmDutyDTO> toDto(List<OrmDuty> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmDutyDTO> list = new ArrayList<OrmDutyDTO>( entityList.size() );
        for ( OrmDuty ormDuty : entityList ) {
            list.add( toDto( ormDuty ) );
        }

        return list;
    }
}
