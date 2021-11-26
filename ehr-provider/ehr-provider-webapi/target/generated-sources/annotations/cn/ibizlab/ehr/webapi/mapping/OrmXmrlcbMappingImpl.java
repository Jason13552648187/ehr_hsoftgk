package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmXmrlcb;
import cn.ibizlab.ehr.webapi.dto.OrmXmrlcbDTO;
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
public class OrmXmrlcbMappingImpl implements OrmXmrlcbMapping {

    @Override
    public OrmXmrlcb toDomain(OrmXmrlcbDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmXmrlcb ormXmrlcb = new OrmXmrlcb();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormXmrlcb.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormXmrlcb.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getZzmc() != null ) {
            ormXmrlcb.setZzmc( dto.getZzmc() );
        }
        if ( dto.getXm() != null ) {
            ormXmrlcb.setXm( dto.getXm() );
        }
        if ( dto.getOrmxmrlcbname() != null ) {
            ormXmrlcb.setOrmxmrlcbname( dto.getOrmxmrlcbname() );
        }
        if ( dto.getXmjhzccb() != null ) {
            ormXmrlcb.setXmjhzccb( dto.getXmjhzccb() );
        }
        if ( dto.getXced() != null ) {
            ormXmrlcb.setXced( dto.getXced() );
        }
        if ( dto.getXmsjry() != null ) {
            ormXmrlcb.setXmsjry( dto.getXmsjry() );
        }
        if ( dto.getXmsjzccb() != null ) {
            ormXmrlcb.setXmsjzccb( dto.getXmsjzccb() );
        }
        if ( dto.getXcry() != null ) {
            ormXmrlcb.setXcry( dto.getXcry() );
        }
        if ( dto.getXmjhry() != null ) {
            ormXmrlcb.setXmjhry( dto.getXmjhry() );
        }
        if ( dto.getXmb() != null ) {
            ormXmrlcb.setXmb( dto.getXmb() );
        }
        if ( dto.getCreateman() != null ) {
            ormXmrlcb.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            ormXmrlcb.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getXcryColor() != null ) {
            ormXmrlcb.setXcryColor( dto.getXcryColor() );
        }
        if ( dto.getXmsjryColor() != null ) {
            ormXmrlcb.setXmsjryColor( dto.getXmsjryColor() );
        }
        if ( dto.getOrgid() != null ) {
            ormXmrlcb.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormXmrlcb.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            ormXmrlcb.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmxmrlcbid() != null ) {
            ormXmrlcb.setOrmxmrlcbid( dto.getOrmxmrlcbid() );
        }

        return ormXmrlcb;
    }

    @Override
    public OrmXmrlcbDTO toDto(OrmXmrlcb entity) {
        if ( entity == null ) {
            return null;
        }

        OrmXmrlcbDTO ormXmrlcbDTO = new OrmXmrlcbDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormXmrlcbDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormXmrlcbDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getZzmc() != null ) {
            ormXmrlcbDTO.setZzmc( entity.getZzmc() );
        }
        if ( entity.getXm() != null ) {
            ormXmrlcbDTO.setXm( entity.getXm() );
        }
        if ( entity.getOrmxmrlcbname() != null ) {
            ormXmrlcbDTO.setOrmxmrlcbname( entity.getOrmxmrlcbname() );
        }
        if ( entity.getXmjhzccb() != null ) {
            ormXmrlcbDTO.setXmjhzccb( entity.getXmjhzccb() );
        }
        if ( entity.getXced() != null ) {
            ormXmrlcbDTO.setXced( entity.getXced() );
        }
        if ( entity.getXmsjry() != null ) {
            ormXmrlcbDTO.setXmsjry( entity.getXmsjry() );
        }
        if ( entity.getXmsjzccb() != null ) {
            ormXmrlcbDTO.setXmsjzccb( entity.getXmsjzccb() );
        }
        if ( entity.getXcry() != null ) {
            ormXmrlcbDTO.setXcry( entity.getXcry() );
        }
        if ( entity.getXmjhry() != null ) {
            ormXmrlcbDTO.setXmjhry( entity.getXmjhry() );
        }
        if ( entity.getXmb() != null ) {
            ormXmrlcbDTO.setXmb( entity.getXmb() );
        }
        if ( entity.getCreateman() != null ) {
            ormXmrlcbDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            ormXmrlcbDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getXcryColor() != null ) {
            ormXmrlcbDTO.setXcryColor( entity.getXcryColor() );
        }
        if ( entity.getXmsjryColor() != null ) {
            ormXmrlcbDTO.setXmsjryColor( entity.getXmsjryColor() );
        }
        if ( entity.getOrgid() != null ) {
            ormXmrlcbDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormXmrlcbDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            ormXmrlcbDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmxmrlcbid() != null ) {
            ormXmrlcbDTO.setOrmxmrlcbid( entity.getOrmxmrlcbid() );
        }

        return ormXmrlcbDTO;
    }

    @Override
    public List<OrmXmrlcb> toDomain(List<OrmXmrlcbDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmXmrlcb> list = new ArrayList<OrmXmrlcb>( dtoList.size() );
        for ( OrmXmrlcbDTO ormXmrlcbDTO : dtoList ) {
            list.add( toDomain( ormXmrlcbDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmXmrlcbDTO> toDto(List<OrmXmrlcb> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmXmrlcbDTO> list = new ArrayList<OrmXmrlcbDTO>( entityList.size() );
        for ( OrmXmrlcb ormXmrlcb : entityList ) {
            list.add( toDto( ormXmrlcb ) );
        }

        return list;
    }
}
