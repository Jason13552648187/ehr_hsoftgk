package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParJxbzglmx;
import cn.ibizlab.ehr.webapi.dto.ParJxbzglmxDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParJxbzglmxMappingImpl implements ParJxbzglmxMapping {

    @Override
    public ParJxbzglmx toDomain(ParJxbzglmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParJxbzglmx parJxbzglmx = new ParJxbzglmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parJxbzglmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parJxbzglmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getParjxbzglmxname() != null ) {
            parJxbzglmx.setParjxbzglmxname( dto.getParjxbzglmxname() );
        }
        if ( dto.getBm() != null ) {
            parJxbzglmx.setBm( dto.getBm() );
        }
        if ( dto.getZz() != null ) {
            parJxbzglmx.setZz( dto.getZz() );
        }
        if ( dto.getParjxbzglid() != null ) {
            parJxbzglmx.setParjxbzglid( dto.getParjxbzglid() );
        }
        if ( dto.getPimpersonid() != null ) {
            parJxbzglmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreateman() != null ) {
            parJxbzglmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            parJxbzglmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getParjxbzglmxid() != null ) {
            parJxbzglmx.setParjxbzglmxid( dto.getParjxbzglmxid() );
        }
        if ( dto.getCreatedate() != null ) {
            parJxbzglmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            parJxbzglmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPimpersonname() != null ) {
            parJxbzglmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getParjxbzglname() != null ) {
            parJxbzglmx.setParjxbzglname( dto.getParjxbzglname() );
        }

        return parJxbzglmx;
    }

    @Override
    public ParJxbzglmxDTO toDto(ParJxbzglmx entity) {
        if ( entity == null ) {
            return null;
        }

        ParJxbzglmxDTO parJxbzglmxDTO = new ParJxbzglmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parJxbzglmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parJxbzglmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getParjxbzglmxname() != null ) {
            parJxbzglmxDTO.setParjxbzglmxname( entity.getParjxbzglmxname() );
        }
        if ( entity.getBm() != null ) {
            parJxbzglmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getZz() != null ) {
            parJxbzglmxDTO.setZz( entity.getZz() );
        }
        if ( entity.getParjxbzglid() != null ) {
            parJxbzglmxDTO.setParjxbzglid( entity.getParjxbzglid() );
        }
        if ( entity.getPimpersonid() != null ) {
            parJxbzglmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreateman() != null ) {
            parJxbzglmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            parJxbzglmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getParjxbzglmxid() != null ) {
            parJxbzglmxDTO.setParjxbzglmxid( entity.getParjxbzglmxid() );
        }
        if ( entity.getCreatedate() != null ) {
            parJxbzglmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            parJxbzglmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPimpersonname() != null ) {
            parJxbzglmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getParjxbzglname() != null ) {
            parJxbzglmxDTO.setParjxbzglname( entity.getParjxbzglname() );
        }

        return parJxbzglmxDTO;
    }

    @Override
    public List<ParJxbzglmx> toDomain(List<ParJxbzglmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParJxbzglmx> list = new ArrayList<ParJxbzglmx>( dtoList.size() );
        for ( ParJxbzglmxDTO parJxbzglmxDTO : dtoList ) {
            list.add( toDomain( parJxbzglmxDTO ) );
        }

        return list;
    }

    @Override
    public List<ParJxbzglmxDTO> toDto(List<ParJxbzglmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParJxbzglmxDTO> list = new ArrayList<ParJxbzglmxDTO>( entityList.size() );
        for ( ParJxbzglmx parJxbzglmx : entityList ) {
            list.add( toDto( parJxbzglmx ) );
        }

        return list;
    }
}
