package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmXmbq;
import cn.ibizlab.ehr.webapi.dto.OrmXmbqDTO;
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
public class OrmXmbqMappingImpl implements OrmXmbqMapping {

    @Override
    public OrmXmbq toDomain(OrmXmbqDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmXmbq ormXmbq = new OrmXmbq();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormXmbq.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormXmbq.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXh() != null ) {
            ormXmbq.setXh( dto.getXh() );
        }
        if ( dto.getOrmxmbqname() != null ) {
            ormXmbq.setOrmxmbqname( dto.getOrmxmbqname() );
        }
        if ( dto.getOrmorgid() != null ) {
            ormXmbq.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrgid() != null ) {
            ormXmbq.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdateman() != null ) {
            ormXmbq.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            ormXmbq.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            ormXmbq.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormXmbq.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmxmbqid() != null ) {
            ormXmbq.setOrmxmbqid( dto.getOrmxmbqid() );
        }
        if ( dto.getOrmorgname() != null ) {
            ormXmbq.setOrmorgname( dto.getOrmorgname() );
        }

        return ormXmbq;
    }

    @Override
    public OrmXmbqDTO toDto(OrmXmbq entity) {
        if ( entity == null ) {
            return null;
        }

        OrmXmbqDTO ormXmbqDTO = new OrmXmbqDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormXmbqDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormXmbqDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXh() != null ) {
            ormXmbqDTO.setXh( entity.getXh() );
        }
        if ( entity.getOrmxmbqname() != null ) {
            ormXmbqDTO.setOrmxmbqname( entity.getOrmxmbqname() );
        }
        if ( entity.getOrmorgid() != null ) {
            ormXmbqDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrgid() != null ) {
            ormXmbqDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdateman() != null ) {
            ormXmbqDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            ormXmbqDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            ormXmbqDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormXmbqDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmxmbqid() != null ) {
            ormXmbqDTO.setOrmxmbqid( entity.getOrmxmbqid() );
        }
        if ( entity.getOrmorgname() != null ) {
            ormXmbqDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return ormXmbqDTO;
    }

    @Override
    public List<OrmXmbq> toDomain(List<OrmXmbqDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmXmbq> list = new ArrayList<OrmXmbq>( dtoList.size() );
        for ( OrmXmbqDTO ormXmbqDTO : dtoList ) {
            list.add( toDomain( ormXmbqDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmXmbqDTO> toDto(List<OrmXmbq> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmXmbqDTO> list = new ArrayList<OrmXmbqDTO>( entityList.size() );
        for ( OrmXmbq ormXmbq : entityList ) {
            list.add( toDto( ormXmbq ) );
        }

        return list;
    }
}
