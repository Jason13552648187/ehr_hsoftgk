package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParJxzgpcmx;
import cn.ibizlab.ehr.webapi.dto.ParJxzgpcmxDTO;
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
    date = "2021-09-04T00:31:50+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParJxzgpcmxMappingImpl implements ParJxzgpcmxMapping {

    @Override
    public ParJxzgpcmx toDomain(ParJxzgpcmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParJxzgpcmx parJxzgpcmx = new ParJxzgpcmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parJxzgpcmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parJxzgpcmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getFzfw() != null ) {
            parJxzgpcmx.setFzfw( dto.getFzfw() );
        }
        if ( dto.getZgdf() != null ) {
            parJxzgpcmx.setZgdf( dto.getZgdf() );
        }
        if ( dto.getZb() != null ) {
            parJxzgpcmx.setZb( dto.getZb() );
        }
        if ( dto.getParjxzgpcmxname() != null ) {
            parJxzgpcmx.setParjxzgpcmxname( dto.getParjxzgpcmxname() );
        }
        if ( dto.getPf() != null ) {
            parJxzgpcmx.setPf( dto.getPf() );
        }
        if ( dto.getXh() != null ) {
            parJxzgpcmx.setXh( dto.getXh() );
        }
        if ( dto.getZddf() != null ) {
            parJxzgpcmx.setZddf( dto.getZddf() );
        }
        if ( dto.getBz() != null ) {
            parJxzgpcmx.setBz( dto.getBz() );
        }
        if ( dto.getParjxzgpcid() != null ) {
            parJxzgpcmx.setParjxzgpcid( dto.getParjxzgpcid() );
        }
        if ( dto.getCreateman() != null ) {
            parJxzgpcmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parJxzgpcmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parJxzgpcmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parJxzgpcmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getParjxzgpcmxid() != null ) {
            parJxzgpcmx.setParjxzgpcmxid( dto.getParjxzgpcmxid() );
        }
        if ( dto.getParjxzgpcname() != null ) {
            parJxzgpcmx.setParjxzgpcname( dto.getParjxzgpcname() );
        }

        return parJxzgpcmx;
    }

    @Override
    public ParJxzgpcmxDTO toDto(ParJxzgpcmx entity) {
        if ( entity == null ) {
            return null;
        }

        ParJxzgpcmxDTO parJxzgpcmxDTO = new ParJxzgpcmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parJxzgpcmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parJxzgpcmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getFzfw() != null ) {
            parJxzgpcmxDTO.setFzfw( entity.getFzfw() );
        }
        if ( entity.getZgdf() != null ) {
            parJxzgpcmxDTO.setZgdf( entity.getZgdf() );
        }
        if ( entity.getZb() != null ) {
            parJxzgpcmxDTO.setZb( entity.getZb() );
        }
        if ( entity.getParjxzgpcmxname() != null ) {
            parJxzgpcmxDTO.setParjxzgpcmxname( entity.getParjxzgpcmxname() );
        }
        if ( entity.getPf() != null ) {
            parJxzgpcmxDTO.setPf( entity.getPf() );
        }
        if ( entity.getXh() != null ) {
            parJxzgpcmxDTO.setXh( entity.getXh() );
        }
        if ( entity.getZddf() != null ) {
            parJxzgpcmxDTO.setZddf( entity.getZddf() );
        }
        if ( entity.getBz() != null ) {
            parJxzgpcmxDTO.setBz( entity.getBz() );
        }
        if ( entity.getParjxzgpcid() != null ) {
            parJxzgpcmxDTO.setParjxzgpcid( entity.getParjxzgpcid() );
        }
        if ( entity.getCreateman() != null ) {
            parJxzgpcmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parJxzgpcmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parJxzgpcmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parJxzgpcmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getParjxzgpcmxid() != null ) {
            parJxzgpcmxDTO.setParjxzgpcmxid( entity.getParjxzgpcmxid() );
        }
        if ( entity.getParjxzgpcname() != null ) {
            parJxzgpcmxDTO.setParjxzgpcname( entity.getParjxzgpcname() );
        }

        return parJxzgpcmxDTO;
    }

    @Override
    public List<ParJxzgpcmx> toDomain(List<ParJxzgpcmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParJxzgpcmx> list = new ArrayList<ParJxzgpcmx>( dtoList.size() );
        for ( ParJxzgpcmxDTO parJxzgpcmxDTO : dtoList ) {
            list.add( toDomain( parJxzgpcmxDTO ) );
        }

        return list;
    }

    @Override
    public List<ParJxzgpcmxDTO> toDto(List<ParJxzgpcmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParJxzgpcmxDTO> list = new ArrayList<ParJxzgpcmxDTO>( entityList.size() );
        for ( ParJxzgpcmx parJxzgpcmx : entityList ) {
            list.add( toDto( parJxzgpcmx ) );
        }

        return list;
    }
}
