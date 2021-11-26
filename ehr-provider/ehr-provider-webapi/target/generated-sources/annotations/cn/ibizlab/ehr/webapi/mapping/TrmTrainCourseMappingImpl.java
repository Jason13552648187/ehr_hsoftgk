package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmTrainCourse;
import cn.ibizlab.ehr.webapi.dto.TrmTrainCourseDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmTrainCourseMappingImpl implements TrmTrainCourseMapping {

    @Override
    public TrmTrainCourse toDomain(TrmTrainCourseDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmTrainCourse trmTrainCourse = new TrmTrainCourse();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmTrainCourse.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmTrainCourse.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getJb() != null ) {
            trmTrainCourse.setJb( dto.getJb() );
        }
        if ( dto.getKcbm() != null ) {
            trmTrainCourse.setKcbm( dto.getKcbm() );
        }
        if ( dto.getKclb() != null ) {
            trmTrainCourse.setKclb( dto.getKclb() );
        }
        if ( dto.getBbh() != null ) {
            trmTrainCourse.setBbh( dto.getBbh() );
        }
        if ( dto.getPxmb() != null ) {
            trmTrainCourse.setPxmb( dto.getPxmb() );
        }
        if ( dto.getKcjs() != null ) {
            trmTrainCourse.setKcjs( dto.getKcjs() );
        }
        if ( dto.getTrmtraincoursename() != null ) {
            trmTrainCourse.setTrmtraincoursename( dto.getTrmtraincoursename() );
        }
        if ( dto.getSkfs() != null ) {
            trmTrainCourse.setSkfs( dto.getSkfs() );
        }
        if ( dto.getBb() != null ) {
            trmTrainCourse.setBb( dto.getBb() );
        }
        if ( dto.getKcxs() != null ) {
            trmTrainCourse.setKcxs( dto.getKcxs() );
        }
        if ( dto.getSffc() != null ) {
            trmTrainCourse.setSffc( dto.getSffc() );
        }
        if ( dto.getSfgx() != null ) {
            trmTrainCourse.setSfgx( dto.getSfgx() );
        }
        if ( dto.getTrmtrainagencyid() != null ) {
            trmTrainCourse.setTrmtrainagencyid( dto.getTrmtrainagencyid() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmTrainCourse.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getTrmcoursesystemid() != null ) {
            trmTrainCourse.setTrmcoursesystemid( dto.getTrmcoursesystemid() );
        }
        if ( dto.getCreateman() != null ) {
            trmTrainCourse.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            trmTrainCourse.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getTrmtraincourseid() != null ) {
            trmTrainCourse.setTrmtraincourseid( dto.getTrmtraincourseid() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmTrainCourse.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            trmTrainCourse.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            trmTrainCourse.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmTrainCourse.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getTrmtrainagencyname() != null ) {
            trmTrainCourse.setTrmtrainagencyname( dto.getTrmtrainagencyname() );
        }
        if ( dto.getNr() != null ) {
            trmTrainCourse.setNr( dto.getNr() );
        }
        if ( dto.getTrmcoursesystemname() != null ) {
            trmTrainCourse.setTrmcoursesystemname( dto.getTrmcoursesystemname() );
        }

        return trmTrainCourse;
    }

    @Override
    public TrmTrainCourseDTO toDto(TrmTrainCourse entity) {
        if ( entity == null ) {
            return null;
        }

        TrmTrainCourseDTO trmTrainCourseDTO = new TrmTrainCourseDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmTrainCourseDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmTrainCourseDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getJb() != null ) {
            trmTrainCourseDTO.setJb( entity.getJb() );
        }
        if ( entity.getKcbm() != null ) {
            trmTrainCourseDTO.setKcbm( entity.getKcbm() );
        }
        if ( entity.getKclb() != null ) {
            trmTrainCourseDTO.setKclb( entity.getKclb() );
        }
        if ( entity.getBbh() != null ) {
            trmTrainCourseDTO.setBbh( entity.getBbh() );
        }
        if ( entity.getPxmb() != null ) {
            trmTrainCourseDTO.setPxmb( entity.getPxmb() );
        }
        if ( entity.getKcjs() != null ) {
            trmTrainCourseDTO.setKcjs( entity.getKcjs() );
        }
        if ( entity.getTrmtraincoursename() != null ) {
            trmTrainCourseDTO.setTrmtraincoursename( entity.getTrmtraincoursename() );
        }
        if ( entity.getSkfs() != null ) {
            trmTrainCourseDTO.setSkfs( entity.getSkfs() );
        }
        if ( entity.getBb() != null ) {
            trmTrainCourseDTO.setBb( entity.getBb() );
        }
        if ( entity.getKcxs() != null ) {
            trmTrainCourseDTO.setKcxs( entity.getKcxs() );
        }
        if ( entity.getSffc() != null ) {
            trmTrainCourseDTO.setSffc( entity.getSffc() );
        }
        if ( entity.getSfgx() != null ) {
            trmTrainCourseDTO.setSfgx( entity.getSfgx() );
        }
        if ( entity.getTrmtrainagencyid() != null ) {
            trmTrainCourseDTO.setTrmtrainagencyid( entity.getTrmtrainagencyid() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmTrainCourseDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getTrmcoursesystemid() != null ) {
            trmTrainCourseDTO.setTrmcoursesystemid( entity.getTrmcoursesystemid() );
        }
        if ( entity.getCreateman() != null ) {
            trmTrainCourseDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            trmTrainCourseDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getTrmtraincourseid() != null ) {
            trmTrainCourseDTO.setTrmtraincourseid( entity.getTrmtraincourseid() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmTrainCourseDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            trmTrainCourseDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            trmTrainCourseDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmTrainCourseDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getTrmtrainagencyname() != null ) {
            trmTrainCourseDTO.setTrmtrainagencyname( entity.getTrmtrainagencyname() );
        }
        if ( entity.getNr() != null ) {
            trmTrainCourseDTO.setNr( entity.getNr() );
        }
        if ( entity.getTrmcoursesystemname() != null ) {
            trmTrainCourseDTO.setTrmcoursesystemname( entity.getTrmcoursesystemname() );
        }

        return trmTrainCourseDTO;
    }

    @Override
    public List<TrmTrainCourse> toDomain(List<TrmTrainCourseDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmTrainCourse> list = new ArrayList<TrmTrainCourse>( dtoList.size() );
        for ( TrmTrainCourseDTO trmTrainCourseDTO : dtoList ) {
            list.add( toDomain( trmTrainCourseDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmTrainCourseDTO> toDto(List<TrmTrainCourse> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmTrainCourseDTO> list = new ArrayList<TrmTrainCourseDTO>( entityList.size() );
        for ( TrmTrainCourse trmTrainCourse : entityList ) {
            list.add( toDto( trmTrainCourse ) );
        }

        return list;
    }
}
