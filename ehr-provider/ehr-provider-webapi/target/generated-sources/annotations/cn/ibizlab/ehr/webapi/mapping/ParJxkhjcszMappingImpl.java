package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParJxkhjcsz;
import cn.ibizlab.ehr.webapi.dto.ParJxkhjcszDTO;
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
    date = "2021-09-04T00:31:48+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParJxkhjcszMappingImpl implements ParJxkhjcszMapping {

    @Override
    public ParJxkhjcsz toDomain(ParJxkhjcszDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParJxkhjcsz parJxkhjcsz = new ParJxkhjcsz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parJxkhjcsz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parJxkhjcsz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getKhlx() != null ) {
            parJxkhjcsz.setKhlx( dto.getKhlx() );
        }
        if ( dto.getSzsj() != null ) {
            parJxkhjcsz.setSzsj( dto.getSzsj() );
        }
        if ( dto.getSfqy() != null ) {
            parJxkhjcsz.setSfqy( dto.getSfqy() );
        }
        if ( dto.getParjxkhjcszname() != null ) {
            parJxkhjcsz.setParjxkhjcszname( dto.getParjxkhjcszname() );
        }
        if ( dto.getKhnd() != null ) {
            parJxkhjcsz.setKhnd( dto.getKhnd() );
        }
        if ( dto.getOrmorgid() != null ) {
            parJxkhjcsz.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getCreatedate() != null ) {
            parJxkhjcsz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parJxkhjcsz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            parJxkhjcsz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getParjxkhjcszid() != null ) {
            parJxkhjcsz.setParjxkhjcszid( dto.getParjxkhjcszid() );
        }
        if ( dto.getEnable() != null ) {
            parJxkhjcsz.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            parJxkhjcsz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            parJxkhjcsz.setOrmorgname( dto.getOrmorgname() );
        }

        return parJxkhjcsz;
    }

    @Override
    public ParJxkhjcszDTO toDto(ParJxkhjcsz entity) {
        if ( entity == null ) {
            return null;
        }

        ParJxkhjcszDTO parJxkhjcszDTO = new ParJxkhjcszDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parJxkhjcszDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parJxkhjcszDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getKhlx() != null ) {
            parJxkhjcszDTO.setKhlx( entity.getKhlx() );
        }
        if ( entity.getSzsj() != null ) {
            parJxkhjcszDTO.setSzsj( entity.getSzsj() );
        }
        if ( entity.getSfqy() != null ) {
            parJxkhjcszDTO.setSfqy( entity.getSfqy() );
        }
        if ( entity.getParjxkhjcszname() != null ) {
            parJxkhjcszDTO.setParjxkhjcszname( entity.getParjxkhjcszname() );
        }
        if ( entity.getKhnd() != null ) {
            parJxkhjcszDTO.setKhnd( entity.getKhnd() );
        }
        if ( entity.getOrmorgid() != null ) {
            parJxkhjcszDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getCreatedate() != null ) {
            parJxkhjcszDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parJxkhjcszDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            parJxkhjcszDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getParjxkhjcszid() != null ) {
            parJxkhjcszDTO.setParjxkhjcszid( entity.getParjxkhjcszid() );
        }
        if ( entity.getEnable() != null ) {
            parJxkhjcszDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            parJxkhjcszDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            parJxkhjcszDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return parJxkhjcszDTO;
    }

    @Override
    public List<ParJxkhjcsz> toDomain(List<ParJxkhjcszDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParJxkhjcsz> list = new ArrayList<ParJxkhjcsz>( dtoList.size() );
        for ( ParJxkhjcszDTO parJxkhjcszDTO : dtoList ) {
            list.add( toDomain( parJxkhjcszDTO ) );
        }

        return list;
    }

    @Override
    public List<ParJxkhjcszDTO> toDto(List<ParJxkhjcsz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParJxkhjcszDTO> list = new ArrayList<ParJxkhjcszDTO>( entityList.size() );
        for ( ParJxkhjcsz parJxkhjcsz : entityList ) {
            list.add( toDto( parJxkhjcsz ) );
        }

        return list;
    }
}
