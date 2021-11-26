package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimSearchFieldSet;
import cn.ibizlab.ehr.webapi.dto.PimSearchFieldSetDTO;
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
public class PimSearchFieldSetMappingImpl implements PimSearchFieldSetMapping {

    @Override
    public PimSearchFieldSet toDomain(PimSearchFieldSetDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimSearchFieldSet pimSearchFieldSet = new PimSearchFieldSet();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimSearchFieldSet.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimSearchFieldSet.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getLinkfieldname() != null ) {
            pimSearchFieldSet.setLinkfieldname( dto.getLinkfieldname() );
        }
        if ( dto.getSearchtag() != null ) {
            pimSearchFieldSet.setSearchtag( dto.getSearchtag() );
        }
        if ( dto.getPxh2() != null ) {
            pimSearchFieldSet.setPxh2( dto.getPxh2() );
        }
        if ( dto.getIsshown() != null ) {
            pimSearchFieldSet.setIsshown( dto.getIsshown() );
        }
        if ( dto.getColumnname() != null ) {
            pimSearchFieldSet.setColumnname( dto.getColumnname() );
        }
        if ( dto.getColumnwidth() != null ) {
            pimSearchFieldSet.setColumnwidth( dto.getColumnwidth() );
        }
        if ( dto.getEntitylogicname() != null ) {
            pimSearchFieldSet.setEntitylogicname( dto.getEntitylogicname() );
        }
        if ( dto.getPimsearchfieldsetname() != null ) {
            pimSearchFieldSet.setPimsearchfieldsetname( dto.getPimsearchfieldsetname() );
        }
        if ( dto.getEntityid() != null ) {
            pimSearchFieldSet.setEntityid( dto.getEntityid() );
        }
        if ( dto.getColumnlogicname() != null ) {
            pimSearchFieldSet.setColumnlogicname( dto.getColumnlogicname() );
        }
        if ( dto.getVname() != null ) {
            pimSearchFieldSet.setVname( dto.getVname() );
        }
        if ( dto.getFieldtype() != null ) {
            pimSearchFieldSet.setFieldtype( dto.getFieldtype() );
        }
        if ( dto.getCodelistid() != null ) {
            pimSearchFieldSet.setCodelistid( dto.getCodelistid() );
        }
        if ( dto.getEntityname() != null ) {
            pimSearchFieldSet.setEntityname( dto.getEntityname() );
        }
        if ( dto.getTname() != null ) {
            pimSearchFieldSet.setTname( dto.getTname() );
        }
        if ( dto.getPxh() != null ) {
            pimSearchFieldSet.setPxh( dto.getPxh() );
        }
        if ( dto.getUpdateman() != null ) {
            pimSearchFieldSet.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimSearchFieldSet.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimSearchFieldSet.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pimSearchFieldSet.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPimsearchfieldsetid() != null ) {
            pimSearchFieldSet.setPimsearchfieldsetid( dto.getPimsearchfieldsetid() );
        }

        return pimSearchFieldSet;
    }

    @Override
    public PimSearchFieldSetDTO toDto(PimSearchFieldSet entity) {
        if ( entity == null ) {
            return null;
        }

        PimSearchFieldSetDTO pimSearchFieldSetDTO = new PimSearchFieldSetDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimSearchFieldSetDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimSearchFieldSetDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getLinkfieldname() != null ) {
            pimSearchFieldSetDTO.setLinkfieldname( entity.getLinkfieldname() );
        }
        if ( entity.getSearchtag() != null ) {
            pimSearchFieldSetDTO.setSearchtag( entity.getSearchtag() );
        }
        if ( entity.getPxh2() != null ) {
            pimSearchFieldSetDTO.setPxh2( entity.getPxh2() );
        }
        if ( entity.getIsshown() != null ) {
            pimSearchFieldSetDTO.setIsshown( entity.getIsshown() );
        }
        if ( entity.getColumnname() != null ) {
            pimSearchFieldSetDTO.setColumnname( entity.getColumnname() );
        }
        if ( entity.getColumnwidth() != null ) {
            pimSearchFieldSetDTO.setColumnwidth( entity.getColumnwidth() );
        }
        if ( entity.getEntitylogicname() != null ) {
            pimSearchFieldSetDTO.setEntitylogicname( entity.getEntitylogicname() );
        }
        if ( entity.getPimsearchfieldsetname() != null ) {
            pimSearchFieldSetDTO.setPimsearchfieldsetname( entity.getPimsearchfieldsetname() );
        }
        if ( entity.getEntityid() != null ) {
            pimSearchFieldSetDTO.setEntityid( entity.getEntityid() );
        }
        if ( entity.getColumnlogicname() != null ) {
            pimSearchFieldSetDTO.setColumnlogicname( entity.getColumnlogicname() );
        }
        if ( entity.getVname() != null ) {
            pimSearchFieldSetDTO.setVname( entity.getVname() );
        }
        if ( entity.getFieldtype() != null ) {
            pimSearchFieldSetDTO.setFieldtype( entity.getFieldtype() );
        }
        if ( entity.getCodelistid() != null ) {
            pimSearchFieldSetDTO.setCodelistid( entity.getCodelistid() );
        }
        if ( entity.getEntityname() != null ) {
            pimSearchFieldSetDTO.setEntityname( entity.getEntityname() );
        }
        if ( entity.getTname() != null ) {
            pimSearchFieldSetDTO.setTname( entity.getTname() );
        }
        if ( entity.getPxh() != null ) {
            pimSearchFieldSetDTO.setPxh( entity.getPxh() );
        }
        if ( entity.getUpdateman() != null ) {
            pimSearchFieldSetDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimSearchFieldSetDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimSearchFieldSetDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pimSearchFieldSetDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPimsearchfieldsetid() != null ) {
            pimSearchFieldSetDTO.setPimsearchfieldsetid( entity.getPimsearchfieldsetid() );
        }

        return pimSearchFieldSetDTO;
    }

    @Override
    public List<PimSearchFieldSet> toDomain(List<PimSearchFieldSetDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimSearchFieldSet> list = new ArrayList<PimSearchFieldSet>( dtoList.size() );
        for ( PimSearchFieldSetDTO pimSearchFieldSetDTO : dtoList ) {
            list.add( toDomain( pimSearchFieldSetDTO ) );
        }

        return list;
    }

    @Override
    public List<PimSearchFieldSetDTO> toDto(List<PimSearchFieldSet> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimSearchFieldSetDTO> list = new ArrayList<PimSearchFieldSetDTO>( entityList.size() );
        for ( PimSearchFieldSet pimSearchFieldSet : entityList ) {
            list.add( toDto( pimSearchFieldSet ) );
        }

        return list;
    }
}
