package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmXmxqhz;
import cn.ibizlab.ehr.webapi.dto.OrmXmxqhzDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmXmxqhzMappingImpl implements OrmXmxqhzMapping {

    @Override
    public OrmXmxqhz toDomain(OrmXmxqhzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmXmxqhz ormXmxqhz = new OrmXmxqhz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormXmxqhz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormXmxqhz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXm() != null ) {
            ormXmxqhz.setXm( dto.getXm() );
        }
        if ( dto.getNd() != null ) {
            ormXmxqhz.setNd( dto.getNd() );
        }
        if ( dto.getOrmxmxqhzname() != null ) {
            ormXmxqhz.setOrmxmxqhzname( dto.getOrmxmxqhzname() );
        }
        if ( dto.getRs() != null ) {
            ormXmxqhz.setRs( dto.getRs() );
        }
        if ( dto.getXh() != null ) {
            ormXmxqhz.setXh( dto.getXh() );
        }
        if ( dto.getZz() != null ) {
            ormXmxqhz.setZz( dto.getZz() );
        }
        if ( dto.getGw() != null ) {
            ormXmxqhz.setGw( dto.getGw() );
        }
        if ( dto.getXmid() != null ) {
            ormXmxqhz.setXmid( dto.getXmid() );
        }
        if ( dto.getYf() != null ) {
            ormXmxqhz.setYf( dto.getYf() );
        }
        if ( dto.getOrmxmxqhzid() != null ) {
            ormXmxqhz.setOrmxmxqhzid( dto.getOrmxmxqhzid() );
        }
        if ( dto.getUpdateman() != null ) {
            ormXmxqhz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrgid() != null ) {
            ormXmxqhz.setOrgid( dto.getOrgid() );
        }
        if ( dto.getCreateman() != null ) {
            ormXmxqhz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            ormXmxqhz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormXmxqhz.setUpdatedate( dto.getUpdatedate() );
        }

        return ormXmxqhz;
    }

    @Override
    public OrmXmxqhzDTO toDto(OrmXmxqhz entity) {
        if ( entity == null ) {
            return null;
        }

        OrmXmxqhzDTO ormXmxqhzDTO = new OrmXmxqhzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormXmxqhzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormXmxqhzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXm() != null ) {
            ormXmxqhzDTO.setXm( entity.getXm() );
        }
        if ( entity.getNd() != null ) {
            ormXmxqhzDTO.setNd( entity.getNd() );
        }
        if ( entity.getOrmxmxqhzname() != null ) {
            ormXmxqhzDTO.setOrmxmxqhzname( entity.getOrmxmxqhzname() );
        }
        if ( entity.getRs() != null ) {
            ormXmxqhzDTO.setRs( entity.getRs() );
        }
        if ( entity.getXh() != null ) {
            ormXmxqhzDTO.setXh( entity.getXh() );
        }
        if ( entity.getZz() != null ) {
            ormXmxqhzDTO.setZz( entity.getZz() );
        }
        if ( entity.getGw() != null ) {
            ormXmxqhzDTO.setGw( entity.getGw() );
        }
        if ( entity.getXmid() != null ) {
            ormXmxqhzDTO.setXmid( entity.getXmid() );
        }
        if ( entity.getYf() != null ) {
            ormXmxqhzDTO.setYf( entity.getYf() );
        }
        if ( entity.getOrmxmxqhzid() != null ) {
            ormXmxqhzDTO.setOrmxmxqhzid( entity.getOrmxmxqhzid() );
        }
        if ( entity.getUpdateman() != null ) {
            ormXmxqhzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrgid() != null ) {
            ormXmxqhzDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getCreateman() != null ) {
            ormXmxqhzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            ormXmxqhzDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormXmxqhzDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return ormXmxqhzDTO;
    }

    @Override
    public List<OrmXmxqhz> toDomain(List<OrmXmxqhzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmXmxqhz> list = new ArrayList<OrmXmxqhz>( dtoList.size() );
        for ( OrmXmxqhzDTO ormXmxqhzDTO : dtoList ) {
            list.add( toDomain( ormXmxqhzDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmXmxqhzDTO> toDto(List<OrmXmxqhz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmXmxqhzDTO> list = new ArrayList<OrmXmxqhzDTO>( entityList.size() );
        for ( OrmXmxqhz ormXmxqhz : entityList ) {
            list.add( toDto( ormXmxqhz ) );
        }

        return list;
    }
}
