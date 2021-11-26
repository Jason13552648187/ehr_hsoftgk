package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParJxqdsz;
import cn.ibizlab.ehr.webapi.dto.ParJxqdszDTO;
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
public class ParJxqdszMappingImpl implements ParJxqdszMapping {

    @Override
    public ParJxqdsz toDomain(ParJxqdszDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParJxqdsz parJxqdsz = new ParJxqdsz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parJxqdsz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parJxqdsz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJzsj() != null ) {
            parJxqdsz.setJzsj( dto.getJzsj() );
        }
        if ( dto.getQdlx() != null ) {
            parJxqdsz.setQdlx( dto.getQdlx() );
        }
        if ( dto.getKqsj() != null ) {
            parJxqdsz.setKqsj( dto.getKqsj() );
        }
        if ( dto.getParjxqdszname() != null ) {
            parJxqdsz.setParjxqdszname( dto.getParjxqdszname() );
        }
        if ( dto.getOrmorgid() != null ) {
            parJxqdsz.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getCreateman() != null ) {
            parJxqdsz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parJxqdsz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parJxqdsz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parJxqdsz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getParjxqdszid() != null ) {
            parJxqdsz.setParjxqdszid( dto.getParjxqdszid() );
        }
        if ( dto.getOrmorgname() != null ) {
            parJxqdsz.setOrmorgname( dto.getOrmorgname() );
        }

        return parJxqdsz;
    }

    @Override
    public ParJxqdszDTO toDto(ParJxqdsz entity) {
        if ( entity == null ) {
            return null;
        }

        ParJxqdszDTO parJxqdszDTO = new ParJxqdszDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parJxqdszDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parJxqdszDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJzsj() != null ) {
            parJxqdszDTO.setJzsj( entity.getJzsj() );
        }
        if ( entity.getQdlx() != null ) {
            parJxqdszDTO.setQdlx( entity.getQdlx() );
        }
        if ( entity.getKqsj() != null ) {
            parJxqdszDTO.setKqsj( entity.getKqsj() );
        }
        if ( entity.getParjxqdszname() != null ) {
            parJxqdszDTO.setParjxqdszname( entity.getParjxqdszname() );
        }
        if ( entity.getOrmorgid() != null ) {
            parJxqdszDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getCreateman() != null ) {
            parJxqdszDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parJxqdszDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parJxqdszDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parJxqdszDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getParjxqdszid() != null ) {
            parJxqdszDTO.setParjxqdszid( entity.getParjxqdszid() );
        }
        if ( entity.getOrmorgname() != null ) {
            parJxqdszDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return parJxqdszDTO;
    }

    @Override
    public List<ParJxqdsz> toDomain(List<ParJxqdszDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParJxqdsz> list = new ArrayList<ParJxqdsz>( dtoList.size() );
        for ( ParJxqdszDTO parJxqdszDTO : dtoList ) {
            list.add( toDomain( parJxqdszDTO ) );
        }

        return list;
    }

    @Override
    public List<ParJxqdszDTO> toDto(List<ParJxqdsz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParJxqdszDTO> list = new ArrayList<ParJxqdszDTO>( entityList.size() );
        for ( ParJxqdsz parJxqdsz : entityList ) {
            list.add( toDto( parJxqdsz ) );
        }

        return list;
    }
}
