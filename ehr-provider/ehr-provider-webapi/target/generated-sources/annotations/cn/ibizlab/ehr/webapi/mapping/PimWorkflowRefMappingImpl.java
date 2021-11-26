package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimWorkflowRef;
import cn.ibizlab.ehr.webapi.dto.PimWorkflowRefDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimWorkflowRefMappingImpl implements PimWorkflowRefMapping {

    @Override
    public PimWorkflowRef toDomain(PimWorkflowRefDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimWorkflowRef pimWorkflowRef = new PimWorkflowRef();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimWorkflowRef.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimWorkflowRef.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPimworkflowrefname() != null ) {
            pimWorkflowRef.setPimworkflowrefname( dto.getPimworkflowrefname() );
        }
        if ( dto.getPimworkflowid() != null ) {
            pimWorkflowRef.setPimworkflowid( dto.getPimworkflowid() );
        }
        if ( dto.getPimworkflowrefid() != null ) {
            pimWorkflowRef.setPimworkflowrefid( dto.getPimworkflowrefid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimWorkflowRef.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimWorkflowRef.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pimWorkflowRef.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            pimWorkflowRef.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimworkflowname() != null ) {
            pimWorkflowRef.setPimworkflowname( dto.getPimworkflowname() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimWorkflowRef.setOrmorgid( dto.getOrmorgid() );
        }

        return pimWorkflowRef;
    }

    @Override
    public PimWorkflowRefDTO toDto(PimWorkflowRef entity) {
        if ( entity == null ) {
            return null;
        }

        PimWorkflowRefDTO pimWorkflowRefDTO = new PimWorkflowRefDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimWorkflowRefDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimWorkflowRefDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPimworkflowrefname() != null ) {
            pimWorkflowRefDTO.setPimworkflowrefname( entity.getPimworkflowrefname() );
        }
        if ( entity.getPimworkflowid() != null ) {
            pimWorkflowRefDTO.setPimworkflowid( entity.getPimworkflowid() );
        }
        if ( entity.getPimworkflowrefid() != null ) {
            pimWorkflowRefDTO.setPimworkflowrefid( entity.getPimworkflowrefid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimWorkflowRefDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimWorkflowRefDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pimWorkflowRefDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            pimWorkflowRefDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimworkflowname() != null ) {
            pimWorkflowRefDTO.setPimworkflowname( entity.getPimworkflowname() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimWorkflowRefDTO.setOrmorgid( entity.getOrmorgid() );
        }

        return pimWorkflowRefDTO;
    }

    @Override
    public List<PimWorkflowRef> toDomain(List<PimWorkflowRefDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimWorkflowRef> list = new ArrayList<PimWorkflowRef>( dtoList.size() );
        for ( PimWorkflowRefDTO pimWorkflowRefDTO : dtoList ) {
            list.add( toDomain( pimWorkflowRefDTO ) );
        }

        return list;
    }

    @Override
    public List<PimWorkflowRefDTO> toDto(List<PimWorkflowRef> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimWorkflowRefDTO> list = new ArrayList<PimWorkflowRefDTO>( entityList.size() );
        for ( PimWorkflowRef pimWorkflowRef : entityList ) {
            list.add( toDto( pimWorkflowRef ) );
        }

        return list;
    }
}
