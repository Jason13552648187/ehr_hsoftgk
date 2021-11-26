package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParJxkhmbmx;
import cn.ibizlab.ehr.webapi.dto.ParJxkhmbmxDTO;
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
    date = "2021-09-04T00:31:45+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParJxkhmbmxMappingImpl implements ParJxkhmbmxMapping {

    @Override
    public ParJxkhmbmx toDomain(ParJxkhmbmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParJxkhmbmx parJxkhmbmx = new ParJxkhmbmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parJxkhmbmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parJxkhmbmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getParjxkhmbmxname() != null ) {
            parJxkhmbmx.setParjxkhmbmxname( dto.getParjxkhmbmxname() );
        }
        if ( dto.getZdfz() != null ) {
            parJxkhmbmx.setZdfz( dto.getZdfz() );
        }
        if ( dto.getFz() != null ) {
            parJxkhmbmx.setFz( dto.getFz() );
        }
        if ( dto.getZb() != null ) {
            parJxkhmbmx.setZb( dto.getZb() );
        }
        if ( dto.getXh() != null ) {
            parJxkhmbmx.setXh( dto.getXh() );
        }
        if ( dto.getBz() != null ) {
            parJxkhmbmx.setBz( dto.getBz() );
        }
        if ( dto.getZxfz() != null ) {
            parJxkhmbmx.setZxfz( dto.getZxfz() );
        }
        if ( dto.getParjxkhmbid() != null ) {
            parJxkhmbmx.setParjxkhmbid( dto.getParjxkhmbid() );
        }
        if ( dto.getUpdateman() != null ) {
            parJxkhmbmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parJxkhmbmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getParjxkhmbmxid() != null ) {
            parJxkhmbmx.setParjxkhmbmxid( dto.getParjxkhmbmxid() );
        }
        if ( dto.getUpdatedate() != null ) {
            parJxkhmbmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            parJxkhmbmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getParjxkhmbname() != null ) {
            parJxkhmbmx.setParjxkhmbname( dto.getParjxkhmbname() );
        }

        return parJxkhmbmx;
    }

    @Override
    public ParJxkhmbmxDTO toDto(ParJxkhmbmx entity) {
        if ( entity == null ) {
            return null;
        }

        ParJxkhmbmxDTO parJxkhmbmxDTO = new ParJxkhmbmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parJxkhmbmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parJxkhmbmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getParjxkhmbmxname() != null ) {
            parJxkhmbmxDTO.setParjxkhmbmxname( entity.getParjxkhmbmxname() );
        }
        if ( entity.getZdfz() != null ) {
            parJxkhmbmxDTO.setZdfz( entity.getZdfz() );
        }
        if ( entity.getFz() != null ) {
            parJxkhmbmxDTO.setFz( entity.getFz() );
        }
        if ( entity.getZb() != null ) {
            parJxkhmbmxDTO.setZb( entity.getZb() );
        }
        if ( entity.getXh() != null ) {
            parJxkhmbmxDTO.setXh( entity.getXh() );
        }
        if ( entity.getBz() != null ) {
            parJxkhmbmxDTO.setBz( entity.getBz() );
        }
        if ( entity.getZxfz() != null ) {
            parJxkhmbmxDTO.setZxfz( entity.getZxfz() );
        }
        if ( entity.getParjxkhmbid() != null ) {
            parJxkhmbmxDTO.setParjxkhmbid( entity.getParjxkhmbid() );
        }
        if ( entity.getUpdateman() != null ) {
            parJxkhmbmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parJxkhmbmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getParjxkhmbmxid() != null ) {
            parJxkhmbmxDTO.setParjxkhmbmxid( entity.getParjxkhmbmxid() );
        }
        if ( entity.getUpdatedate() != null ) {
            parJxkhmbmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            parJxkhmbmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getParjxkhmbname() != null ) {
            parJxkhmbmxDTO.setParjxkhmbname( entity.getParjxkhmbname() );
        }

        return parJxkhmbmxDTO;
    }

    @Override
    public List<ParJxkhmbmx> toDomain(List<ParJxkhmbmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParJxkhmbmx> list = new ArrayList<ParJxkhmbmx>( dtoList.size() );
        for ( ParJxkhmbmxDTO parJxkhmbmxDTO : dtoList ) {
            list.add( toDomain( parJxkhmbmxDTO ) );
        }

        return list;
    }

    @Override
    public List<ParJxkhmbmxDTO> toDto(List<ParJxkhmbmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParJxkhmbmxDTO> list = new ArrayList<ParJxkhmbmxDTO>( entityList.size() );
        for ( ParJxkhmbmx parJxkhmbmx : entityList ) {
            list.add( toDto( parJxkhmbmx ) );
        }

        return list;
    }
}
