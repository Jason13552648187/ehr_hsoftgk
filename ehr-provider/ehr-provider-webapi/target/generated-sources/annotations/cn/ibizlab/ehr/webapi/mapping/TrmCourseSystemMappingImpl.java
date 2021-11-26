package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmCourseSystem;
import cn.ibizlab.ehr.webapi.dto.TrmCourseSystemDTO;
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
public class TrmCourseSystemMappingImpl implements TrmCourseSystemMapping {

    @Override
    public TrmCourseSystem toDomain(TrmCourseSystemDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmCourseSystem trmCourseSystem = new TrmCourseSystem();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmCourseSystem.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmCourseSystem.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDygx() != null ) {
            trmCourseSystem.setDygx( dto.getDygx() );
        }
        if ( dto.getTrmcoursesystemname() != null ) {
            trmCourseSystem.setTrmcoursesystemname( dto.getTrmcoursesystemname() );
        }
        if ( dto.getJb() != null ) {
            trmCourseSystem.setJb( dto.getJb() );
        }
        if ( dto.getNr() != null ) {
            trmCourseSystem.setNr( dto.getNr() );
        }
        if ( dto.getDm() != null ) {
            trmCourseSystem.setDm( dto.getDm() );
        }
        if ( dto.getTrmtrainagencyid() != null ) {
            trmCourseSystem.setTrmtrainagencyid( dto.getTrmtrainagencyid() );
        }
        if ( dto.getTrmcoursesystemid() != null ) {
            trmCourseSystem.setTrmcoursesystemid( dto.getTrmcoursesystemid() );
        }
        if ( dto.getCreateman() != null ) {
            trmCourseSystem.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            trmCourseSystem.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            trmCourseSystem.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmCourseSystem.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmCourseSystem.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getTrmtrainagencyname() != null ) {
            trmCourseSystem.setTrmtrainagencyname( dto.getTrmtrainagencyname() );
        }

        return trmCourseSystem;
    }

    @Override
    public TrmCourseSystemDTO toDto(TrmCourseSystem entity) {
        if ( entity == null ) {
            return null;
        }

        TrmCourseSystemDTO trmCourseSystemDTO = new TrmCourseSystemDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmCourseSystemDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmCourseSystemDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDygx() != null ) {
            trmCourseSystemDTO.setDygx( entity.getDygx() );
        }
        if ( entity.getTrmcoursesystemname() != null ) {
            trmCourseSystemDTO.setTrmcoursesystemname( entity.getTrmcoursesystemname() );
        }
        if ( entity.getJb() != null ) {
            trmCourseSystemDTO.setJb( entity.getJb() );
        }
        if ( entity.getNr() != null ) {
            trmCourseSystemDTO.setNr( entity.getNr() );
        }
        if ( entity.getDm() != null ) {
            trmCourseSystemDTO.setDm( entity.getDm() );
        }
        if ( entity.getTrmtrainagencyid() != null ) {
            trmCourseSystemDTO.setTrmtrainagencyid( entity.getTrmtrainagencyid() );
        }
        if ( entity.getTrmcoursesystemid() != null ) {
            trmCourseSystemDTO.setTrmcoursesystemid( entity.getTrmcoursesystemid() );
        }
        if ( entity.getCreateman() != null ) {
            trmCourseSystemDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            trmCourseSystemDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            trmCourseSystemDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmCourseSystemDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmCourseSystemDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getTrmtrainagencyname() != null ) {
            trmCourseSystemDTO.setTrmtrainagencyname( entity.getTrmtrainagencyname() );
        }

        return trmCourseSystemDTO;
    }

    @Override
    public List<TrmCourseSystem> toDomain(List<TrmCourseSystemDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmCourseSystem> list = new ArrayList<TrmCourseSystem>( dtoList.size() );
        for ( TrmCourseSystemDTO trmCourseSystemDTO : dtoList ) {
            list.add( toDomain( trmCourseSystemDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmCourseSystemDTO> toDto(List<TrmCourseSystem> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmCourseSystemDTO> list = new ArrayList<TrmCourseSystemDTO>( entityList.size() );
        for ( TrmCourseSystem trmCourseSystem : entityList ) {
            list.add( toDto( trmCourseSystem ) );
        }

        return list;
    }
}
