package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParJxbzgl;
import cn.ibizlab.ehr.webapi.dto.ParJxbzglDTO;
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
public class ParJxbzglMappingImpl implements ParJxbzglMapping {

    @Override
    public ParJxbzgl toDomain(ParJxbzglDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParJxbzgl parJxbzgl = new ParJxbzgl();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parJxbzgl.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parJxbzgl.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getKhlx() != null ) {
            parJxbzgl.setKhlx( dto.getKhlx() );
        }
        if ( dto.getParjxbzglname() != null ) {
            parJxbzgl.setParjxbzglname( dto.getParjxbzglname() );
        }
        if ( dto.getNd() != null ) {
            parJxbzgl.setNd( dto.getNd() );
        }
        if ( dto.getSfqy() != null ) {
            parJxbzgl.setSfqy( dto.getSfqy() );
        }
        if ( dto.getOrmorgid() != null ) {
            parJxbzgl.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdateman() != null ) {
            parJxbzgl.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getParjxbzglid() != null ) {
            parJxbzgl.setParjxbzglid( dto.getParjxbzglid() );
        }
        if ( dto.getUpdatedate() != null ) {
            parJxbzgl.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            parJxbzgl.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parJxbzgl.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            parJxbzgl.setOrmorgname( dto.getOrmorgname() );
        }

        return parJxbzgl;
    }

    @Override
    public ParJxbzglDTO toDto(ParJxbzgl entity) {
        if ( entity == null ) {
            return null;
        }

        ParJxbzglDTO parJxbzglDTO = new ParJxbzglDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parJxbzglDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parJxbzglDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getKhlx() != null ) {
            parJxbzglDTO.setKhlx( entity.getKhlx() );
        }
        if ( entity.getParjxbzglname() != null ) {
            parJxbzglDTO.setParjxbzglname( entity.getParjxbzglname() );
        }
        if ( entity.getNd() != null ) {
            parJxbzglDTO.setNd( entity.getNd() );
        }
        if ( entity.getSfqy() != null ) {
            parJxbzglDTO.setSfqy( entity.getSfqy() );
        }
        if ( entity.getOrmorgid() != null ) {
            parJxbzglDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdateman() != null ) {
            parJxbzglDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getParjxbzglid() != null ) {
            parJxbzglDTO.setParjxbzglid( entity.getParjxbzglid() );
        }
        if ( entity.getUpdatedate() != null ) {
            parJxbzglDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            parJxbzglDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parJxbzglDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            parJxbzglDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return parJxbzglDTO;
    }

    @Override
    public List<ParJxbzgl> toDomain(List<ParJxbzglDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParJxbzgl> list = new ArrayList<ParJxbzgl>( dtoList.size() );
        for ( ParJxbzglDTO parJxbzglDTO : dtoList ) {
            list.add( toDomain( parJxbzglDTO ) );
        }

        return list;
    }

    @Override
    public List<ParJxbzglDTO> toDto(List<ParJxbzgl> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParJxbzglDTO> list = new ArrayList<ParJxbzglDTO>( entityList.size() );
        for ( ParJxbzgl parJxbzgl : entityList ) {
            list.add( toDto( parJxbzgl ) );
        }

        return list;
    }
}
