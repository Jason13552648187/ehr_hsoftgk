package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmXmbmx;
import cn.ibizlab.ehr.webapi.dto.OrmXmbmxDTO;
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
public class OrmXmbmxMappingImpl implements OrmXmbmxMapping {

    @Override
    public OrmXmbmx toDomain(OrmXmbmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmXmbmx ormXmbmx = new OrmXmbmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormXmbmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormXmbmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXh() != null ) {
            ormXmbmx.setXh( dto.getXh() );
        }
        if ( dto.getOrmxmbmxname() != null ) {
            ormXmbmx.setOrmxmbmxname( dto.getOrmxmbmxname() );
        }
        if ( dto.getZsmc() != null ) {
            ormXmbmx.setZsmc( dto.getZsmc() );
        }
        if ( dto.getZsbh() != null ) {
            ormXmbmx.setZsbh( dto.getZsbh() );
        }
        if ( dto.getXmrylx() != null ) {
            ormXmbmx.setXmrylx( dto.getXmrylx() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            ormXmbmx.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getPimpersonid() != null ) {
            ormXmbmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormXmbmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmxmbmxid() != null ) {
            ormXmbmx.setOrmxmbmxid( dto.getOrmxmbmxid() );
        }
        if ( dto.getCreatedate() != null ) {
            ormXmbmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            ormXmbmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            ormXmbmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            ormXmbmx.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getPimpersonname() != null ) {
            ormXmbmx.setPimpersonname( dto.getPimpersonname() );
        }

        return ormXmbmx;
    }

    @Override
    public OrmXmbmxDTO toDto(OrmXmbmx entity) {
        if ( entity == null ) {
            return null;
        }

        OrmXmbmxDTO ormXmbmxDTO = new OrmXmbmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormXmbmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormXmbmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXh() != null ) {
            ormXmbmxDTO.setXh( entity.getXh() );
        }
        if ( entity.getOrmxmbmxname() != null ) {
            ormXmbmxDTO.setOrmxmbmxname( entity.getOrmxmbmxname() );
        }
        if ( entity.getZsmc() != null ) {
            ormXmbmxDTO.setZsmc( entity.getZsmc() );
        }
        if ( entity.getZsbh() != null ) {
            ormXmbmxDTO.setZsbh( entity.getZsbh() );
        }
        if ( entity.getXmrylx() != null ) {
            ormXmbmxDTO.setXmrylx( entity.getXmrylx() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            ormXmbmxDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getPimpersonid() != null ) {
            ormXmbmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormXmbmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmxmbmxid() != null ) {
            ormXmbmxDTO.setOrmxmbmxid( entity.getOrmxmbmxid() );
        }
        if ( entity.getCreatedate() != null ) {
            ormXmbmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            ormXmbmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            ormXmbmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            ormXmbmxDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getPimpersonname() != null ) {
            ormXmbmxDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return ormXmbmxDTO;
    }

    @Override
    public List<OrmXmbmx> toDomain(List<OrmXmbmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmXmbmx> list = new ArrayList<OrmXmbmx>( dtoList.size() );
        for ( OrmXmbmxDTO ormXmbmxDTO : dtoList ) {
            list.add( toDomain( ormXmbmxDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmXmbmxDTO> toDto(List<OrmXmbmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmXmbmxDTO> list = new ArrayList<OrmXmbmxDTO>( entityList.size() );
        for ( OrmXmbmx ormXmbmx : entityList ) {
            list.add( toDto( ormXmbmx ) );
        }

        return list;
    }
}
