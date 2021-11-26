package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalSubject;
import cn.ibizlab.ehr.webapi.dto.SalSubjectDTO;
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
public class SalSubjectMappingImpl implements SalSubjectMapping {

    @Override
    public SalSubject toDomain(SalSubjectDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalSubject salSubject = new SalSubject();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salSubject.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salSubject.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSalsubjectname() != null ) {
            salSubject.setSalsubjectname( dto.getSalsubjectname() );
        }
        if ( dto.getSubcode() != null ) {
            salSubject.setSubcode( dto.getSubcode() );
        }
        if ( dto.getUpdateman() != null ) {
            salSubject.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getSalsubjectid() != null ) {
            salSubject.setSalsubjectid( dto.getSalsubjectid() );
        }
        if ( dto.getEnable() != null ) {
            salSubject.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            salSubject.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            salSubject.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            salSubject.setCreatedate( dto.getCreatedate() );
        }

        return salSubject;
    }

    @Override
    public SalSubjectDTO toDto(SalSubject entity) {
        if ( entity == null ) {
            return null;
        }

        SalSubjectDTO salSubjectDTO = new SalSubjectDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salSubjectDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salSubjectDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSalsubjectname() != null ) {
            salSubjectDTO.setSalsubjectname( entity.getSalsubjectname() );
        }
        if ( entity.getSubcode() != null ) {
            salSubjectDTO.setSubcode( entity.getSubcode() );
        }
        if ( entity.getUpdateman() != null ) {
            salSubjectDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getSalsubjectid() != null ) {
            salSubjectDTO.setSalsubjectid( entity.getSalsubjectid() );
        }
        if ( entity.getEnable() != null ) {
            salSubjectDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            salSubjectDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            salSubjectDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            salSubjectDTO.setCreatedate( entity.getCreatedate() );
        }

        return salSubjectDTO;
    }

    @Override
    public List<SalSubject> toDomain(List<SalSubjectDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalSubject> list = new ArrayList<SalSubject>( dtoList.size() );
        for ( SalSubjectDTO salSubjectDTO : dtoList ) {
            list.add( toDomain( salSubjectDTO ) );
        }

        return list;
    }

    @Override
    public List<SalSubjectDTO> toDto(List<SalSubject> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalSubjectDTO> list = new ArrayList<SalSubjectDTO>( entityList.size() );
        for ( SalSubject salSubject : entityList ) {
            list.add( toDto( salSubject ) );
        }

        return list;
    }
}
