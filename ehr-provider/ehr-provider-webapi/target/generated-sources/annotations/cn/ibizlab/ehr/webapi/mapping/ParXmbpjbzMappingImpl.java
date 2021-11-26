package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParXmbpjbz;
import cn.ibizlab.ehr.webapi.dto.ParXmbpjbzDTO;
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
public class ParXmbpjbzMappingImpl implements ParXmbpjbzMapping {

    @Override
    public ParXmbpjbz toDomain(ParXmbpjbzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParXmbpjbz parXmbpjbz = new ParXmbpjbz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parXmbpjbz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parXmbpjbz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDjbl() != null ) {
            parXmbpjbz.setDjbl( dto.getDjbl() );
        }
        if ( dto.getGwlx() != null ) {
            parXmbpjbz.setGwlx( dto.getGwlx() );
        }
        if ( dto.getParxmbpjbzname() != null ) {
            parXmbpjbz.setParxmbpjbzname( dto.getParxmbpjbzname() );
        }
        if ( dto.getDj() != null ) {
            parXmbpjbz.setDj( dto.getDj() );
        }
        if ( dto.getOrmorgid() != null ) {
            parXmbpjbz.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getXmbpjbzid() != null ) {
            parXmbpjbz.setXmbpjbzid( dto.getXmbpjbzid() );
        }
        if ( dto.getCreatedate() != null ) {
            parXmbpjbz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            parXmbpjbz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getParxmbpjbzid() != null ) {
            parXmbpjbz.setParxmbpjbzid( dto.getParxmbpjbzid() );
        }
        if ( dto.getUpdateman() != null ) {
            parXmbpjbz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parXmbpjbz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            parXmbpjbz.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getXmbpjbzmc() != null ) {
            parXmbpjbz.setXmbpjbzmc( dto.getXmbpjbzmc() );
        }

        return parXmbpjbz;
    }

    @Override
    public ParXmbpjbzDTO toDto(ParXmbpjbz entity) {
        if ( entity == null ) {
            return null;
        }

        ParXmbpjbzDTO parXmbpjbzDTO = new ParXmbpjbzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parXmbpjbzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parXmbpjbzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDjbl() != null ) {
            parXmbpjbzDTO.setDjbl( entity.getDjbl() );
        }
        if ( entity.getGwlx() != null ) {
            parXmbpjbzDTO.setGwlx( entity.getGwlx() );
        }
        if ( entity.getParxmbpjbzname() != null ) {
            parXmbpjbzDTO.setParxmbpjbzname( entity.getParxmbpjbzname() );
        }
        if ( entity.getDj() != null ) {
            parXmbpjbzDTO.setDj( entity.getDj() );
        }
        if ( entity.getOrmorgid() != null ) {
            parXmbpjbzDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getXmbpjbzid() != null ) {
            parXmbpjbzDTO.setXmbpjbzid( entity.getXmbpjbzid() );
        }
        if ( entity.getCreatedate() != null ) {
            parXmbpjbzDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            parXmbpjbzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getParxmbpjbzid() != null ) {
            parXmbpjbzDTO.setParxmbpjbzid( entity.getParxmbpjbzid() );
        }
        if ( entity.getUpdateman() != null ) {
            parXmbpjbzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parXmbpjbzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            parXmbpjbzDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getXmbpjbzmc() != null ) {
            parXmbpjbzDTO.setXmbpjbzmc( entity.getXmbpjbzmc() );
        }

        return parXmbpjbzDTO;
    }

    @Override
    public List<ParXmbpjbz> toDomain(List<ParXmbpjbzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParXmbpjbz> list = new ArrayList<ParXmbpjbz>( dtoList.size() );
        for ( ParXmbpjbzDTO parXmbpjbzDTO : dtoList ) {
            list.add( toDomain( parXmbpjbzDTO ) );
        }

        return list;
    }

    @Override
    public List<ParXmbpjbzDTO> toDto(List<ParXmbpjbz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParXmbpjbzDTO> list = new ArrayList<ParXmbpjbzDTO>( entityList.size() );
        for ( ParXmbpjbz parXmbpjbz : entityList ) {
            list.add( toDto( parXmbpjbz ) );
        }

        return list;
    }
}
