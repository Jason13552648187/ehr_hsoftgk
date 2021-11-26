package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.att.domain.AttEndanceDate;
import cn.ibizlab.ehr.webapi.dto.AttEndanceDateDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class AttEndanceDateMappingImpl implements AttEndanceDateMapping {

    @Override
    public AttEndanceDate toDomain(AttEndanceDateDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AttEndanceDate attEndanceDate = new AttEndanceDate();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            attEndanceDate.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            attEndanceDate.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getAttendancedatename() != null ) {
            attEndanceDate.setAttendancedatename( dto.getAttendancedatename() );
        }
        if ( dto.getMonth() != null ) {
            attEndanceDate.setMonth( dto.getMonth() );
        }
        if ( dto.getYear() != null ) {
            attEndanceDate.setYear( dto.getYear() );
        }
        if ( dto.getDay() != null ) {
            attEndanceDate.setDay( dto.getDay() );
        }
        if ( dto.getEnable() != null ) {
            attEndanceDate.setEnable( dto.getEnable() );
        }
        if ( dto.getAttendancedateid() != null ) {
            attEndanceDate.setAttendancedateid( dto.getAttendancedateid() );
        }
        if ( dto.getUpdateman() != null ) {
            attEndanceDate.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            attEndanceDate.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            attEndanceDate.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            attEndanceDate.setUpdatedate( dto.getUpdatedate() );
        }

        return attEndanceDate;
    }

    @Override
    public AttEndanceDateDTO toDto(AttEndanceDate entity) {
        if ( entity == null ) {
            return null;
        }

        AttEndanceDateDTO attEndanceDateDTO = new AttEndanceDateDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            attEndanceDateDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            attEndanceDateDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getAttendancedatename() != null ) {
            attEndanceDateDTO.setAttendancedatename( entity.getAttendancedatename() );
        }
        if ( entity.getMonth() != null ) {
            attEndanceDateDTO.setMonth( entity.getMonth() );
        }
        if ( entity.getYear() != null ) {
            attEndanceDateDTO.setYear( entity.getYear() );
        }
        if ( entity.getDay() != null ) {
            attEndanceDateDTO.setDay( entity.getDay() );
        }
        if ( entity.getEnable() != null ) {
            attEndanceDateDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getAttendancedateid() != null ) {
            attEndanceDateDTO.setAttendancedateid( entity.getAttendancedateid() );
        }
        if ( entity.getUpdateman() != null ) {
            attEndanceDateDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            attEndanceDateDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            attEndanceDateDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            attEndanceDateDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return attEndanceDateDTO;
    }

    @Override
    public List<AttEndanceDate> toDomain(List<AttEndanceDateDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AttEndanceDate> list = new ArrayList<AttEndanceDate>( dtoList.size() );
        for ( AttEndanceDateDTO attEndanceDateDTO : dtoList ) {
            list.add( toDomain( attEndanceDateDTO ) );
        }

        return list;
    }

    @Override
    public List<AttEndanceDateDTO> toDto(List<AttEndanceDate> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttEndanceDateDTO> list = new ArrayList<AttEndanceDateDTO>( entityList.size() );
        for ( AttEndanceDate attEndanceDate : entityList ) {
            list.add( toDto( attEndanceDate ) );
        }

        return list;
    }
}
