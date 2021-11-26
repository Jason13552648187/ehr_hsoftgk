package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.att.domain.AttEndenceType;
import cn.ibizlab.ehr.webapi.dto.AttEndenceTypeDTO;
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
public class AttEndenceTypeMappingImpl implements AttEndenceTypeMapping {

    @Override
    public AttEndenceType toDomain(AttEndenceTypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AttEndenceType attEndenceType = new AttEndenceType();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            attEndenceType.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            attEndenceType.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getTypecode() != null ) {
            attEndenceType.setTypecode( dto.getTypecode() );
        }
        if ( dto.getAttendencetypename() != null ) {
            attEndenceType.setAttendencetypename( dto.getAttendencetypename() );
        }
        if ( dto.getAttendencetypeid() != null ) {
            attEndenceType.setAttendencetypeid( dto.getAttendencetypeid() );
        }
        if ( dto.getUpdatedate() != null ) {
            attEndenceType.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            attEndenceType.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            attEndenceType.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            attEndenceType.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            attEndenceType.setEnable( dto.getEnable() );
        }

        return attEndenceType;
    }

    @Override
    public AttEndenceTypeDTO toDto(AttEndenceType entity) {
        if ( entity == null ) {
            return null;
        }

        AttEndenceTypeDTO attEndenceTypeDTO = new AttEndenceTypeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            attEndenceTypeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            attEndenceTypeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getTypecode() != null ) {
            attEndenceTypeDTO.setTypecode( entity.getTypecode() );
        }
        if ( entity.getAttendencetypename() != null ) {
            attEndenceTypeDTO.setAttendencetypename( entity.getAttendencetypename() );
        }
        if ( entity.getAttendencetypeid() != null ) {
            attEndenceTypeDTO.setAttendencetypeid( entity.getAttendencetypeid() );
        }
        if ( entity.getUpdatedate() != null ) {
            attEndenceTypeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            attEndenceTypeDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            attEndenceTypeDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            attEndenceTypeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            attEndenceTypeDTO.setEnable( entity.getEnable() );
        }

        return attEndenceTypeDTO;
    }

    @Override
    public List<AttEndenceType> toDomain(List<AttEndenceTypeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AttEndenceType> list = new ArrayList<AttEndenceType>( dtoList.size() );
        for ( AttEndenceTypeDTO attEndenceTypeDTO : dtoList ) {
            list.add( toDomain( attEndenceTypeDTO ) );
        }

        return list;
    }

    @Override
    public List<AttEndenceTypeDTO> toDto(List<AttEndenceType> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttEndenceTypeDTO> list = new ArrayList<AttEndenceTypeDTO>( entityList.size() );
        for ( AttEndenceType attEndenceType : entityList ) {
            list.add( toDto( attEndenceType ) );
        }

        return list;
    }
}
