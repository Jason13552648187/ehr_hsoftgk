package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimWorkflow;
import cn.ibizlab.ehr.webapi.dto.PimWorkflowDTO;
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
    date = "2021-09-04T00:31:50+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimWorkflowMappingImpl implements PimWorkflowMapping {

    @Override
    public PimWorkflow toDomain(PimWorkflowDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimWorkflow pimWorkflow = new PimWorkflow();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimWorkflow.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimWorkflow.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPimworkflowname() != null ) {
            pimWorkflow.setPimworkflowname( dto.getPimworkflowname() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimWorkflow.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimWorkflow.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimworkflowid() != null ) {
            pimWorkflow.setPimworkflowid( dto.getPimworkflowid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimWorkflow.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pimWorkflow.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pimWorkflow.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimWorkflow.setOrmorgname( dto.getOrmorgname() );
        }

        return pimWorkflow;
    }

    @Override
    public PimWorkflowDTO toDto(PimWorkflow entity) {
        if ( entity == null ) {
            return null;
        }

        PimWorkflowDTO pimWorkflowDTO = new PimWorkflowDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimWorkflowDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimWorkflowDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPimworkflowname() != null ) {
            pimWorkflowDTO.setPimworkflowname( entity.getPimworkflowname() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimWorkflowDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimWorkflowDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimworkflowid() != null ) {
            pimWorkflowDTO.setPimworkflowid( entity.getPimworkflowid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimWorkflowDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pimWorkflowDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pimWorkflowDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimWorkflowDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return pimWorkflowDTO;
    }

    @Override
    public List<PimWorkflow> toDomain(List<PimWorkflowDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimWorkflow> list = new ArrayList<PimWorkflow>( dtoList.size() );
        for ( PimWorkflowDTO pimWorkflowDTO : dtoList ) {
            list.add( toDomain( pimWorkflowDTO ) );
        }

        return list;
    }

    @Override
    public List<PimWorkflowDTO> toDto(List<PimWorkflow> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimWorkflowDTO> list = new ArrayList<PimWorkflowDTO>( entityList.size() );
        for ( PimWorkflow pimWorkflow : entityList ) {
            list.add( toDto( pimWorkflow ) );
        }

        return list;
    }
}
