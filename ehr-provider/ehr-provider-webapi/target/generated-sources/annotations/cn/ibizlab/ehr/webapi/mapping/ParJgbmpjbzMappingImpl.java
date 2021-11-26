package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParJgbmpjbz;
import cn.ibizlab.ehr.webapi.dto.ParJgbmpjbzDTO;
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
public class ParJgbmpjbzMappingImpl implements ParJgbmpjbzMapping {

    @Override
    public ParJgbmpjbz toDomain(ParJgbmpjbzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParJgbmpjbz parJgbmpjbz = new ParJgbmpjbz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parJgbmpjbz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parJgbmpjbz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPj() != null ) {
            parJgbmpjbz.setPj( dto.getPj() );
        }
        if ( dto.getBmpj() != null ) {
            parJgbmpjbz.setBmpj( dto.getBmpj() );
        }
        if ( dto.getPjbl() != null ) {
            parJgbmpjbz.setPjbl( dto.getPjbl() );
        }
        if ( dto.getParjgbmpjbzname() != null ) {
            parJgbmpjbz.setParjgbmpjbzname( dto.getParjgbmpjbzname() );
        }
        if ( dto.getDj() != null ) {
            parJgbmpjbz.setDj( dto.getDj() );
        }
        if ( dto.getPjbzid() != null ) {
            parJgbmpjbz.setPjbzid( dto.getPjbzid() );
        }
        if ( dto.getOrmorgid() != null ) {
            parJgbmpjbz.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            parJgbmpjbz.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getParjgbmpjbzid() != null ) {
            parJgbmpjbz.setParjgbmpjbzid( dto.getParjgbmpjbzid() );
        }
        if ( dto.getCreateman() != null ) {
            parJgbmpjbz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parJgbmpjbz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            parJgbmpjbz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parJgbmpjbz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            parJgbmpjbz.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getOrmorgname() != null ) {
            parJgbmpjbz.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getPjbzmc() != null ) {
            parJgbmpjbz.setPjbzmc( dto.getPjbzmc() );
        }

        return parJgbmpjbz;
    }

    @Override
    public ParJgbmpjbzDTO toDto(ParJgbmpjbz entity) {
        if ( entity == null ) {
            return null;
        }

        ParJgbmpjbzDTO parJgbmpjbzDTO = new ParJgbmpjbzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parJgbmpjbzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parJgbmpjbzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPj() != null ) {
            parJgbmpjbzDTO.setPj( entity.getPj() );
        }
        if ( entity.getBmpj() != null ) {
            parJgbmpjbzDTO.setBmpj( entity.getBmpj() );
        }
        if ( entity.getPjbl() != null ) {
            parJgbmpjbzDTO.setPjbl( entity.getPjbl() );
        }
        if ( entity.getParjgbmpjbzname() != null ) {
            parJgbmpjbzDTO.setParjgbmpjbzname( entity.getParjgbmpjbzname() );
        }
        if ( entity.getDj() != null ) {
            parJgbmpjbzDTO.setDj( entity.getDj() );
        }
        if ( entity.getPjbzid() != null ) {
            parJgbmpjbzDTO.setPjbzid( entity.getPjbzid() );
        }
        if ( entity.getOrmorgid() != null ) {
            parJgbmpjbzDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            parJgbmpjbzDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getParjgbmpjbzid() != null ) {
            parJgbmpjbzDTO.setParjgbmpjbzid( entity.getParjgbmpjbzid() );
        }
        if ( entity.getCreateman() != null ) {
            parJgbmpjbzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parJgbmpjbzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            parJgbmpjbzDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parJgbmpjbzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            parJgbmpjbzDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getOrmorgname() != null ) {
            parJgbmpjbzDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getPjbzmc() != null ) {
            parJgbmpjbzDTO.setPjbzmc( entity.getPjbzmc() );
        }

        return parJgbmpjbzDTO;
    }

    @Override
    public List<ParJgbmpjbz> toDomain(List<ParJgbmpjbzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParJgbmpjbz> list = new ArrayList<ParJgbmpjbz>( dtoList.size() );
        for ( ParJgbmpjbzDTO parJgbmpjbzDTO : dtoList ) {
            list.add( toDomain( parJgbmpjbzDTO ) );
        }

        return list;
    }

    @Override
    public List<ParJgbmpjbzDTO> toDto(List<ParJgbmpjbz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParJgbmpjbzDTO> list = new ArrayList<ParJgbmpjbzDTO>( entityList.size() );
        for ( ParJgbmpjbz parJgbmpjbz : entityList ) {
            list.add( toDto( parJgbmpjbz ) );
        }

        return list;
    }
}
