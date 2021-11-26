package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParJxmtfk;
import cn.ibizlab.ehr.webapi.dto.ParJxmtfkDTO;
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
public class ParJxmtfkMappingImpl implements ParJxmtfkMapping {

    @Override
    public ParJxmtfk toDomain(ParJxmtfkDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParJxmtfk parJxmtfk = new ParJxmtfk();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parJxmtfk.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parJxmtfk.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getMtnr() != null ) {
            parJxmtfk.setMtnr( dto.getMtnr() );
        }
        if ( dto.getYgcs() != null ) {
            parJxmtfk.setYgcs( dto.getYgcs() );
        }
        if ( dto.getParjxmtfkname() != null ) {
            parJxmtfk.setParjxmtfkname( dto.getParjxmtfkname() );
        }
        if ( dto.getFjxx() != null ) {
            parJxmtfk.setFjxx( dto.getFjxx() );
        }
        if ( dto.getPimpersonid() != null ) {
            parJxmtfk.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreateman() != null ) {
            parJxmtfk.setCreateman( dto.getCreateman() );
        }
        if ( dto.getParjxmtfkid() != null ) {
            parJxmtfk.setParjxmtfkid( dto.getParjxmtfkid() );
        }
        if ( dto.getCreatedate() != null ) {
            parJxmtfk.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parJxmtfk.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parJxmtfk.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getSszz() != null ) {
            parJxmtfk.setSszz( dto.getSszz() );
        }
        if ( dto.getPimpersonname() != null ) {
            parJxmtfk.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getSsbm() != null ) {
            parJxmtfk.setSsbm( dto.getSsbm() );
        }

        return parJxmtfk;
    }

    @Override
    public ParJxmtfkDTO toDto(ParJxmtfk entity) {
        if ( entity == null ) {
            return null;
        }

        ParJxmtfkDTO parJxmtfkDTO = new ParJxmtfkDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parJxmtfkDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parJxmtfkDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getMtnr() != null ) {
            parJxmtfkDTO.setMtnr( entity.getMtnr() );
        }
        if ( entity.getYgcs() != null ) {
            parJxmtfkDTO.setYgcs( entity.getYgcs() );
        }
        if ( entity.getParjxmtfkname() != null ) {
            parJxmtfkDTO.setParjxmtfkname( entity.getParjxmtfkname() );
        }
        if ( entity.getFjxx() != null ) {
            parJxmtfkDTO.setFjxx( entity.getFjxx() );
        }
        if ( entity.getPimpersonid() != null ) {
            parJxmtfkDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreateman() != null ) {
            parJxmtfkDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getParjxmtfkid() != null ) {
            parJxmtfkDTO.setParjxmtfkid( entity.getParjxmtfkid() );
        }
        if ( entity.getCreatedate() != null ) {
            parJxmtfkDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parJxmtfkDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parJxmtfkDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getSszz() != null ) {
            parJxmtfkDTO.setSszz( entity.getSszz() );
        }
        if ( entity.getPimpersonname() != null ) {
            parJxmtfkDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getSsbm() != null ) {
            parJxmtfkDTO.setSsbm( entity.getSsbm() );
        }

        return parJxmtfkDTO;
    }

    @Override
    public List<ParJxmtfk> toDomain(List<ParJxmtfkDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParJxmtfk> list = new ArrayList<ParJxmtfk>( dtoList.size() );
        for ( ParJxmtfkDTO parJxmtfkDTO : dtoList ) {
            list.add( toDomain( parJxmtfkDTO ) );
        }

        return list;
    }

    @Override
    public List<ParJxmtfkDTO> toDto(List<ParJxmtfk> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParJxmtfkDTO> list = new ArrayList<ParJxmtfkDTO>( entityList.size() );
        for ( ParJxmtfk parJxmtfk : entityList ) {
            list.add( toDto( parJxmtfk ) );
        }

        return list;
    }
}
