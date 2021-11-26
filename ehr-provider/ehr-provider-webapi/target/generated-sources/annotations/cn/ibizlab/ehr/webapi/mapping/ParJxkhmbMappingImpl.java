package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParJxkhmb;
import cn.ibizlab.ehr.webapi.dto.ParJxkhmbDTO;
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
public class ParJxkhmbMappingImpl implements ParJxkhmbMapping {

    @Override
    public ParJxkhmb toDomain(ParJxkhmbDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParJxkhmb parJxkhmb = new ParJxkhmb();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parJxkhmb.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parJxkhmb.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getParjxkhmbname() != null ) {
            parJxkhmb.setParjxkhmbname( dto.getParjxkhmbname() );
        }
        if ( dto.getKhdx() != null ) {
            parJxkhmb.setKhdx( dto.getKhdx() );
        }
        if ( dto.getKhx() != null ) {
            parJxkhmb.setKhx( dto.getKhx() );
        }
        if ( dto.getOrmorgid() != null ) {
            parJxkhmb.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getParjxkhmbid() != null ) {
            parJxkhmb.setParjxkhmbid( dto.getParjxkhmbid() );
        }
        if ( dto.getCreateman() != null ) {
            parJxkhmb.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parJxkhmb.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            parJxkhmb.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parJxkhmb.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmorgname() != null ) {
            parJxkhmb.setOrmorgname( dto.getOrmorgname() );
        }

        return parJxkhmb;
    }

    @Override
    public ParJxkhmbDTO toDto(ParJxkhmb entity) {
        if ( entity == null ) {
            return null;
        }

        ParJxkhmbDTO parJxkhmbDTO = new ParJxkhmbDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parJxkhmbDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parJxkhmbDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getParjxkhmbname() != null ) {
            parJxkhmbDTO.setParjxkhmbname( entity.getParjxkhmbname() );
        }
        if ( entity.getKhdx() != null ) {
            parJxkhmbDTO.setKhdx( entity.getKhdx() );
        }
        if ( entity.getKhx() != null ) {
            parJxkhmbDTO.setKhx( entity.getKhx() );
        }
        if ( entity.getOrmorgid() != null ) {
            parJxkhmbDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getParjxkhmbid() != null ) {
            parJxkhmbDTO.setParjxkhmbid( entity.getParjxkhmbid() );
        }
        if ( entity.getCreateman() != null ) {
            parJxkhmbDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parJxkhmbDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            parJxkhmbDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parJxkhmbDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmorgname() != null ) {
            parJxkhmbDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return parJxkhmbDTO;
    }

    @Override
    public List<ParJxkhmb> toDomain(List<ParJxkhmbDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParJxkhmb> list = new ArrayList<ParJxkhmb>( dtoList.size() );
        for ( ParJxkhmbDTO parJxkhmbDTO : dtoList ) {
            list.add( toDomain( parJxkhmbDTO ) );
        }

        return list;
    }

    @Override
    public List<ParJxkhmbDTO> toDto(List<ParJxkhmb> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParJxkhmbDTO> list = new ArrayList<ParJxkhmbDTO>( entityList.size() );
        for ( ParJxkhmb parJxkhmb : entityList ) {
            list.add( toDto( parJxkhmb ) );
        }

        return list;
    }
}
